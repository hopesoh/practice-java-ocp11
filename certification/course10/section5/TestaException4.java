import java.util.*;

class NovaConta {
    double saldo = 100;
    public void saca(double valor) {
        if (saldo < valor) {
            throw new IllegalArgumentException();
        }
        saldo-=valor;
    }
}

class Tarefa {
    boolean rodando = false;
    void start() {
        if (rodando) {
            throw new IllegalStateException();
        }
        rodando = true;
    }
    void stop() {
        rodando = false;
    }
}

class BlocoEstatico {
    static {
        String s = null;
        s.length();
    }
}

class TestaException4 {
    void metodo() {
        metodo();
    }

    public static void main(String[] args) {
//        int[] x = new int[56];
//        x[56] = 13;

//        ArrayList<String> lista = new ArrayList<String>();
//        lista.add("sonia");
//        lista.add("vinícius");
//        lista.get(2);

//        String s = null;
//        s.length();

//        Object o = "sonia";
//        Date i = (Date) o;

//        String numero1 = "1a";
//        int um = Integer.parseInt(numero1);

//        new NovaConta().saca(500);

//        Tarefa t = new Tarefa();
//        t.start();
//        t.start();

//        new BlocoEstatico();

//        new TestaException4().metodo();

        boolean sempre = true;
        ArrayList<String> strings = new ArrayList<String>();
        String inicial = "sonia";
        while(sempre) {
            inicial += "sonia";
            strings.add(inicial);
        }
    }
}