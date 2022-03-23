import java.util.List;

public class TarefaAdicionarElemento implements Runnable {

    private List<String> lista;
    private int numeroDaThread;

    public TarefaAdicionarElemento(List<String> lista, int numeroDaThread) {
        this.lista = lista;
        this.numeroDaThread = numeroDaThread;
    }

    @Override
    public void run() {
        for(int i=0; i< 10; i++) {
            lista.add("Thread " + numeroDaThread + " - adicionando " + i);
        }
    }
}