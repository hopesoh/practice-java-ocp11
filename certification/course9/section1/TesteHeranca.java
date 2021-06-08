class Mae {
}

class Filha extends Mae {
}

class Neta extends Filha {
}

class X {
    int x;
    public void y() {
        System.out.println("Invocando y em um objeto");
    }
}

class Y extends X {

}

class W {
    public static void metodo() {
        System.out.println("Invocando o metodo estatico que foi definido em W");
    }
}

class Z extends W {
    public static void metodo() {
        System.out.println("Invocando o metodo estatico que foi definido em Z");
    }
}

class TestaHeranca {
    public static void main(String[] args) {
        Y y = new Y();
        y.x = 15;
        y.y();

        W.metodo();
        Z.metodo();
    }
}