public class TesteArray {

    public static void main(String[] args) {

        int [] idades = new int[10];
        System.out.println(idades[0]);

        int [] idadesSegundaVersao = new int[] {0, 2, 4, 6, 8};
        System.out.println(idadesSegundaVersao[1]);

//        Cliente[] clientes = new Cliente[] {new CLiente(), null, new Cliente()};

        System.out.println("-----------------");

        int [] idadesTerceiraVersao = {0, 2, 4, 6, 8}; //precisa estar tudo na mesma linha
        System.out.println(idadesTerceiraVersao.length);

        for (int idade : idadesTerceiraVersao) System.out.println(idade);

        //várias possíveis formas de inicialização
        double pesos[];
        long []numeros;
        long[]tamanhos;


    }
}