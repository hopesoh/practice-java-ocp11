public class TesteComparaIfs {
    public static void main(String[] args) {

        boolean autentico = true;
        if(autentico) {
            System.out.println("Ok");
        } else {
            System.out.println("Não autorizado");
        }

        if (1<2) {
            System.out.println("Ok");
        }

        boolean valor = true;

        if (valor == false) {
            System.out.println("false");
        }

        int a=0, b=3;
        if(a == b) {
            System.out.println("iguais");
        }

        boolean v = true;
        if (v)
            System.out.println("true");
        else if (valor)
            System.out.println("false");
        else if (!valor)
            System.out.println("false");
        else
            System.out.println("só else");

    }
}