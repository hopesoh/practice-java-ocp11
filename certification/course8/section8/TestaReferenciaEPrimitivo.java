class Prova {
    int tempo;
}

class TestaReferenciaEPrimitivo {
    public static void main(String[] args) {
        Prova prova = new Prova();
        prova.tempo = 100;
        teste(prova);
        System.out.println(prova.tempo);

        teste2(prova);
        System.out.println(prova.tempo);

        int i = 2;
        i = teste(i);
        System.out.println(i);
    }

    static void teste2(Prova prova) {
        prova = new Prova();
        prova.tempo = 520;
    }

    static void teste(Prova prova) {
        prova.tempo = 210;
    }

    static int teste(int i) {
        i = 5;
        System.out.println(i);
        return i;
    }
}