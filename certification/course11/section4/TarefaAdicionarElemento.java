import java.util.List;

public class TarefaAdicionarElemento implements Runnable {

    private Lista lista;
    private int numeroDaThread;

    public TarefaAdicionarElemento(Lista lista, int numeroDaThread) {
        this.lista = lista;
        this.numeroDaThread = numeroDaThread;
    }

    @Override
    public void run() {
        for(int i=0; i< 10; i++) {
            lista.adicionaElementos("Thread " + numeroDaThread + " - adicionando " + i);
        }
    }
}