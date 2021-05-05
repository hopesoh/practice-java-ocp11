class Moto {
    public static final int PADRAO_TOTAL_DE_MOTOS = 8;
    public static int totalDeMotos = PADRAO_TOTAL_DE_MOTOS;

    String marca;
    static int b = getMetodo();
    public static int getMetodo()
    {
        return a;
    }
    static int a = 15;

    public static int getTotalDeMotos() {
        return Moto.totalDeMotos;
    }
}



class TestaStatic {
    public static void main(String[] args) {
//        Moto.totalDeMotos = 15;
        System.out.println(Moto.b);
        System.out.println(Moto.a);
        System.out.println(Moto.totalDeMotos);
//        System.out.println(Moto.getTotalDeMotos());

        Moto moto = new Moto();
        System.out.println(moto.getTotalDeMotos());
    }
}