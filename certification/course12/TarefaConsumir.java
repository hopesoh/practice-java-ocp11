import java.util.concurrent.BlockingQueue;

public class TarefaConsumir implements Runnable {

    private BlockingQueue<String> fila;

    public TarefaConsumir(BlockingQueue<String> fila) {
        this.fila = fila;
    }

    @Override
    public void run() {
        try {

            String comando = null;

            while ((comando = fila.take()) != null) {
                System.out.println("Consumindo comando c3");
                Thread.sleep(5000);
            }

        } catch(InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}