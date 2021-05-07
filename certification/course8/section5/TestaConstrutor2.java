class Livro {

    Livro() {
        System.out.println("Sem argumentos");
    }

    Livro(String ... s){}

    Livro(String s) {
    }

    Livro(int i) {
//        this(); chama o construtor vazio
        this(valor()); //apenas funciona com métodos static
        System.out.println("Construtor com int");
    }

    static String valor() {
        return "x";
    }
}

class TestaConstrutor2 {
    public static void main(String[] args) {
        Livro l = new Livro("Sonia");
        Livro p = new Livro("Sonia", "Maria");
        Livro q = new Livro(13);
    }
}