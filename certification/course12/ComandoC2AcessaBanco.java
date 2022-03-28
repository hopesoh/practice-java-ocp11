import java.io.PrintStream;
import java.util.concurrent.Callable;
import java.util.Random;

public class ComandoC2AcessaBanco implements Callable<String> {

    private PrintStream saida;

    public ComandoC2AcessaBanco(PrintStream saida) {
        this.saida = saida;
    }

    @Override
    public String call() throws Exception {
        System.out.println("Servidor recebeu comando c2 - Banco");

        saida.println("Processando comando c2 - Banco");

        Thread.sleep(25000);
        int numero = new Random().nextInt(100) + 1;

        System.out.println("Servidor finalizou comando c2 - Banco");
        return Integer.toString(numero);
    }
}