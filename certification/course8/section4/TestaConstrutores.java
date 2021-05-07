class A {

    String nome;
    int i = 15;
    int tamanho = tamanhoDoNome();

    A() {
        super();
    }

    A (String nome) {
        this.nome = nome;
        System.out.println(i);
    }

    int tamanhoDoNome() {
        return nome.length();
    }

}

class TestaCOnstrutores {
    public static void main(String[] args) {
        A a = new A("Sonia");
        A b = new A();
        System.out.println(b.i);
    }
}