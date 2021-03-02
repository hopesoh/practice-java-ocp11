public class TestaFor {
    public static void main(String[] args) {

        //int i = 1; Inicialização
        //while(i<10) { Condição de parada
        //    System.out.println(i);
        //    i++; Condição de incremento
        //}

//        O terceiro parâmetro aceita expressões:
//        int i;
//        long j;
//        for (i = 0, j = 10; i<10; System.out.println(i + " " + j), i++, j--);

//        for (; ; ) {
//            System.out.println("Loop infinito");
//        }

//        for (; ; ) {
//            System.out.println("Sonia");
//        }
//        System.out.println("unreachable statement");

        int i;
        long j;
        for (i = 0, j = 10; i<10; i++, j--) {
            System.out.println(i + " " + j);
        }

        int[] numeros = {1,2,3,4,5,6};
        for (int k = 0; k<numeros.length; k++) {
            System.out.println(numeros[k]);
        }

        System.out.println("enhenced for");
        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
}