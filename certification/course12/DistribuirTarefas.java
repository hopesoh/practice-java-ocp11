import java.net.Socket;
import java.util.Scanner;
import java.io.PrintStream;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ArrayBlockingQueue;


public class DistribuirTarefas implements Runnable {

    private Socket socket;
    private ServidorTarefas servidor;
    private ExecutorService service;
    private BlockingQueue<String> fila;

    public DistribuirTarefas(Socket socket, ServidorTarefas servidor, ExecutorService service, BlockingQueue<String> fila) {
        this.servidor = servidor;
        this.socket = socket;
        this.service = service;
        this.fila = fila;
    }

    @Override
    public void run() {
        try {
            System.out.println("Distribuindo tarefas para " + socket);
            Scanner entrada = new Scanner(socket.getInputStream());

            PrintStream saida = new PrintStream(socket.getOutputStream());

            while (entrada.hasNextLine()) {
                String comando = entrada.nextLine();

                switch (comando) {
                    case "c1": {
                        saida.println("Confirmacao comando c1");
                        ComandoC1 c1 = new ComandoC1(saida);
                        service.execute(c1);
                        break;
                    }
                    case "c2": {
                        saida.println("Confirmacao comando c2");

                        ComandoC2ChamaWS c2WS = new ComandoC2ChamaWS(saida);
                        Future<String> futureWS = service.submit(c2WS);

                        ComandoC2AcessaBanco c2Banco = new ComandoC2AcessaBanco(saida);
                        Future<String> futureBanco = service.submit(c2Banco);

                        service.submit(new JuntaResultadosFutureWSFutureBanco(futureWS, futureBanco, saida));

                        break;
                    }
                    case "c3": {
                        fila.put(comando); //bloqueia
                        saida.println("Comando c3 adicionado na fila");
                        break;
                    }
                    case "fim": {
                        saida.println("Desligando o servidor");
                        servidor.parar();
                        break;
                    }
                    default: {
                        saida.println("Comando nao encontrado");
                    }
                }
            }

            saida.close();
            entrada.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}