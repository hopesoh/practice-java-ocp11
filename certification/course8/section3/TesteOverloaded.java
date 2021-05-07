class Overloader {

    public void metodo2(String s) {
        System.out.println("Com String");
    }

    public void metodo2(Object o) {
        System.out.println("Com Object");
    }

    public void metodo3(String s, int i) {
        System.out.println("String, int");
    }

    public void metodo3(int i, String s) {
        System.out.println("int, String");
    }

    public void metodo(int a) {
        System.out.println("Com int");
    }

    public void metodo(double d) {
        System.out.println("Com double");
    }

    public void metodo() {
        System.out.println("Sem nada");
    }
}

class TestaOverloaded {
    public static void main(String[] args) {
        new Overloader().metodo2("Sonia");
        new Overloader().metodo2(new Object());

        new Overloader().metodo();
        new Overloader().metodo((short)300);
        new Overloader().metodo(300);
        new Overloader().metodo(300.0f);
        new Overloader().metodo(300.0);
    }
}