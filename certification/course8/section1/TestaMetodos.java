class Param {
    String getNumero() {
        if(true) return "verdadeiro";
        System.out.println("aaaa");
        return "falso";
    }

    void primitivo(double a) {
        if (a > 5) return;
        System.out.println(a);
    }

    void referencia(Object o) {
    }

    void teste(final int a, int b) {
        b = 10;
//        a = 5
    }
}

class ClasseComMetodos {
    int getNumero() {
        return 5;
    }
}

class TestaMetodos {
    public static void main(String[] args) {
        Param p = new Param();
        int a = 1;
        p.referencia(new Object());
        p.referencia("Sonia");
        p.primitivo('Z');
        p.primitivo(a);
        p.teste(1,2);
    }
}