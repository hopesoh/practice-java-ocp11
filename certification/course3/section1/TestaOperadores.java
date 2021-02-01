import java.util.*;

public class TestaOperadores {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        List<String> lista2 = lista;

        long idade = 15;

        int a = 10;
        long b = 20;
        short c = 3;
        byte d = 4;
        char h = 65;
        //char i = -2; NÃO COMPILA. Vê se é um número válido em tempo de compilação

        double e = 30.0;
        float f = 40.3f;
        double g = 40.3f;
        f = a;
        f = b;
        f = c;
        f = d;

        g = a;
        g = b;
        g = c;
        g = d;


    }
}