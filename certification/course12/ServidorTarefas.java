import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ArrayBlockingQueue;
import java.io.IOException;
import java.net.SocketException;

public class ServidorTarefas {

    private ServerSocket servidor;
    private ExecutorService service;
    private AtomicBoolean estaRodando;
    private BlockingQueue<String> fila;

    public ServidorTarefas() throws IOException {
        System.out.println("--- Iniciando servidor ---");
        this.servidor = new ServerSocket(12345);
        this.service = Executors.newCachedThreadPool(new FabricaDeThreads());  //newFixedThreadPool();
        this.estaRodando = new AtomicBoolean(true);
        this.fila = new ArrayBlockingQueue<>(2);

        iniciaConsumers();
    }

    private void iniciaConsumers() {
        for (int qtdConsumers = 0; qtdConsumers < 2; qtdConsumers++) {
            TarefaConsumir tarefa = new TarefaConsumir(fila);
            service.execute(tarefa);
        }
    }

    public void rodar() throws IOException {
        while (estaRodando.get()) {
            try {
                Socket socket = servidor.accept();
                System.out.println("Aceitando novo cliente na porta " + socket.getPort());

                DistribuirTarefas distribuir = new DistribuirTarefas(socket, this, service, fila);
                service.execute(distribuir);
            } catch (SocketException e) {
                System.out.println("SocketException, está rodando? " + this.estaRodando);
            }
        }
    }

    public void parar() throws IOException {
        estaRodando.set(false);
        servidor.close();
        service.shutdown();
    }

    public static void main(String[] args) throws Exception {
        ServidorTarefas servidor = new ServidorTarefas();
        servidor.rodar();
        servidor.parar();
    }
}