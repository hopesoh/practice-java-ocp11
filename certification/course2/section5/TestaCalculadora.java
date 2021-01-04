class Calculadora {

    public int soma(String nome, int... numeros) {
        int soma = 0;
        for(int numero : numeros) {
            soma += numero;
        }
        return soma;
    }

}

public class TestaCalculadora {

    public static void main(String[] args) {
        Calculadora c = new Calculadora();
        System.out.println(c.soma("sonia",3,5));
        System.out.println(c.soma("sonia",3,5, 10));
        System.out.println(c.soma("sonia",3,5, 10, 4));
        System.out.println(c.soma("sonia",3,5, 10, 4, 5));
        System.out.println(c.soma("sonia"));
    }
}