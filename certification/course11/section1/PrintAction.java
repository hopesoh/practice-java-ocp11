
public class PrintAction implements Runnable {

    private String resultado;

    public PrintAction(String resultado) {
        this.resultado = resultado;
    }

    @Override
    public void run() {
        System.out.println(resultado);
    }
}