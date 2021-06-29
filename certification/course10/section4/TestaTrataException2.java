import java.io.*;

class AcessoAoArquivo {
    InputStream is = new FileInputStream("a.txt");
    AcessoAoArquivo() throws FileNotFoundException {

    }
}

class SaldoInsuficienteException  extends Exception {
    SaldoInsuficienteException(String msg) {
        super(msg);
    }
}

class ContaDoBem {
    double saldo = 100;
    void saca (double quantidade) throws SaldoInsuficienteException {
        if (this.saldo < quantidade) {
            throw new SaldoInsuficienteException("Saldo insuficiente " + saldo + " para sacar essa quantidade.");
        }
        saldo -= quantidade;
    }
}

class TestaTrataException3 {
    public static void metodo1() {
        try {
            new ContaDoBem().saca(500);
        } catch (NullPointerException ex) {
            System.out.println("tratei nullpointer");
        } catch (SaldoInsuficienteException ex) {
            System.out.println("tratei saldo");
        }
    }

    public static void main(String[] args) {
        metodo1();
    }
}

public class TestaTrataException2 {
    public static void metodo1() {
        System.out.println("primeiro antes");
        try {
            metodo2();
            System.out.println("primeiro depois");
        } catch (NullPointerException ex) {
            System.out.println("tratei");
        }
        System.out.println("fim do metodo1");
    }

    public static void metodo2() {
        String s = null;
        System.out.println("segundo antes");
        s.length();
        System.out.println("segundo depois");
    }

    public static void main(String[] args) {
        metodo1();
    }
}