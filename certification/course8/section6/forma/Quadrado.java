package forma;

class Quadrado extends Forma {

    private String cor = "vermelha";

    void imprimeCor() {
        super.imprimeCor();
        System.out.println(cor);
    }

}