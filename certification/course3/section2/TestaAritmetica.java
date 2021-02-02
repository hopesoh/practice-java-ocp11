class TestaAritmetica {
    public static void main(String[] args) {
        int dois = 2;
        int dez = 10;
        //long dez = 10; NÃO COMPILA pois tentamos atribuir um long para dentro de um int.

        int doze = dez + dois;
        int oito = dez - dois;
        int vinte = dez*dois;
        int cinco = dez/dois;
        int restoDaDivisão = cinco%dois;

        double divisao1 = cinco/0.0;

//        byte dois = 2;
//        byte dez = 10;
//
//        //int doze = (byte) dez + dois; NÃO COMPILA, pois a precedência do cast é maior do que a da soma e, então, ele aplica o cast apenas em uma das variáveis.
//        byte doze = (byte) (dez + dois);
//        int oito = dez - dois;
//        int vinte = dez*dois;
//        int cinco = dez/dois;
//        int restoDaDivisão = cinco%dois;


    }
}