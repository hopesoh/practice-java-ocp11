class ObjetoMeu {
    int valor;
}

public class Teste{
    public static void main(String[] args) {
        ObjetoMeu o1 = new ObjetoMeu();
        o1.valor = 10;
        ObjetoMeu o2 = o1;
        System.out.println(o1.valor);
        System.out.println(o2.valor);

        o1.valor = o1.valor + 5;

        System.out.println(o1.valor);
        System.out.println(o2.valor);

        System.out.println("-------------------");

        int a = 10;
        int b = a; //pego o valor 10 e coloco para a variável b
        System.out.println(a);
        System.out.println(b);

        a = a + 5;
        System.out.println(a);
        System.out.println(b);

        System.out.println("-------------------");

        Integer a2 = 10;
        Integer b2 = a2; //pego o valor 10 e coloco para a variável b
        System.out.println(a2);
        System.out.println(b2);

        a2 = a2 + 5;
        System.out.println(a2);
        System.out.println(b2);
    }
}