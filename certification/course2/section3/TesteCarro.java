class TestaCarro {
    public static void main(String args[]) {
        Carro a = new Carro();
        a.modelo = "Palio";
        a.setModelo("Palio 2");
        System.out.println(a.getDadosDeImpressao());
        System.out.println(a.ano);
        System.out.println(a.modelo.length()); //cuidado pois pode dar NPE em qualquer lugar
    }
}