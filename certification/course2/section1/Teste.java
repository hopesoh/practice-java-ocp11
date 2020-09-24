public class Teste {

    public static void main(String[] args) {
//       NÃO COMPILA
//        int idade;
//        System.out.println(idade);

        int ano;
        ano = 1994;
        System.out.println(ano);

        int idade = 15;
        System.out.println(idade);

        int teste;
        if(args.length > 10) {
            teste = 2;
        } else {
            System.out.println("faca uma outra coisa qualquer");
            //sem inicializar a variável teste aqui dentro, o programa não compila
            teste = 0;
        }
        System.out.println(teste);
    }
}