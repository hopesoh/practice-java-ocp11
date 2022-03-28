import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;
import java.io.PrintStream;

public class JuntaResultadosFutureWSFutureBanco implements Callable<Void>{

    private Future<String> futureWS;
    private Future<String> futureBanco;
    private PrintStream saida;

    public JuntaResultadosFutureWSFutureBanco(Future<String> futureWS,
                                              Future<String> futureBanco,
                                              PrintStream saida) {
        this.futureWS = futureWS;
        this.futureBanco = futureBanco;
        this.saida = saida;
    }

    @Override
    public Void call() {
        System.out.println("Aguardando resultados do future WS e Banco");

        try {
            String numeroMagico = futureWS.get(15, TimeUnit.SECONDS);
            String numeroMagico2 = futureBanco.get(15, TimeUnit.SECONDS);

            saida.println("Resultado comando c2: " + numeroMagico + ", " + numeroMagico2);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            System.out.println("Timeout: Cancelando execucao do comando c2");
            saida.println("Timeout na execucao do comando c2");
            futureWS.cancel(true);
            futureBanco.cancel(true);
        }

        System.out.println("Finalizou JuntaResultadosFutureWSFutureBanco");
        return null;
    }
}