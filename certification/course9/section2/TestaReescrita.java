class C {
    public void metodo() {
        System.out.println("c");
//        this.metodo2();
    }

    public void metodo2() {
        System.out.println("metodo 2 do pai");
    }
}

class D extends C {
    @java.lang.Override
    public void metodo() {
        System.out.println("d");
        super.metodo();
    }

    public void metodo2() {
        System.out.println("e");
        metodo();
        super.metodo();
    }

    public static void main(String[] args) {
        new D().metodo2();
    }
}

interface A {
    void x();
}

class B implements A {
    public void x(){}
}

class Veiculo {
    public void liga() {
        System.out.println("O veiculo esta sendo ligado");
    }
}

class Helicoptero extends Veiculo {
    public void liga() {
        System.out.println("Ligando o helicóptero");
    }
}

abstract class Droid extends Veiculo {
    public abstract void liga();
}

class HexaDroid extends Droid {
    @java.lang.Override
    public void liga() {
        System.out.println("Hexa");
    }
}

class FabricaDeVeiculo {
    Veiculo fabrica() {
        return new Veiculo();
    }
}

class FabricaDeHexaDroid extends FabricaDeVeiculo{
    HexaDroid fabrica() {
        return new HexaDroid();
    }
}

class TestaReescrita {
    static void metodo(Veiculo v) {
        v.liga();
    }

    public static void main(String[] args) {
//        HexaDroid h1 = new FabricaDeHexaDroid().fabrica();
//        h1.liga();
        metodo(new HexaDroid());
        metodo(new Veiculo());
        metodo(new Helicoptero());
    }
}