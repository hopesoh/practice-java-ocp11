package forma;

public class Forma {
    protected double lado;
    public double getArea() {
        return 0;
    }
    double getPerimetro() {
        return 10;
    }
    private String cor = "azul";
    void imprimeCor() {
        System.out.println(cor);
    }
}

class Forma2 {
    void metodo() {
        Forma f = new Forma();
    }
}