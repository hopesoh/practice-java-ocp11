class Motor {
}

class Carro {
    int ano = 1567; //valor literal
    char primeiraLetra;
    boolean usado;
    Motor motor;
    String marca;
}

public class SegundoTeste {
    public static void main(String[] args) {
        char c = 'A';
        System.out.println(c);

        char c2 = 65;
        System.out.println(c2);

//         NÃO EXISTE EQUIVALENTE NO CHAR
//         char sete = 7;
//         System.out.println(sete);

        char c3 = '\u03A9'; //caractere ômega
        System.out.println(c3);

        long x2 = 12_345_676_543_355L;
        long x3 = 12__345_676_543_355L;
        int x4 = 0xF__F;
//          NÃO COMPILA
//         long x2 = _12_345_676_543_355L;
//         long x2 = 12_345_676_543_355L_;
//         long x2 = _12_345_676_543_355L_;
//         long x2 = 12_345_676_543_355_L;
//         long x2 = 0_B100;
//         long x2 = 10._2D;


        int[] valores = new int[10];
        System.out.println(valores[0]);

        boolean[] testes = new boolean[10];
        System.out.println(testes[0]);

        boolean valor = true;
        int x = 15;
        double v = 10.2D;
        long l = 13L;
        long outrol = 13l;
        float f = 13.1f;

        double d2 = 3.1E2;
        System.out.println(d2);

        int i = 0761;
        System.out.println(i);

        int h = 0xA;
        System.out.println(h);

        int b = 0B100;
        System.out.println(b);

        Carro carro = new Carro();

        System.out.println(carro.ano);
        System.out.println(carro.primeiraLetra == 0);
        System.out.println(carro.usado);
        System.out.println(carro.motor);
        System.out.println(carro.marca);

        boolean bonitão = true;
        int idade = 1;
        int Idade = 2;
        int IDADE = 3;
        int IdAdE = 4;
//         int idade#preco; NÃO COMPILA
    }

}