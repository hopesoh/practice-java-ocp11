class Veiculo {
    double velocidade;
}

class Carro extends Veiculo{
    double velocidade;
    double velocidadeDoCarro() {
        return this.velocidade;
    }
    double velocidadeDoVeiculo() {
        return super.velocidade;
    }
}
class Avo {
    Avo() {
        System.out.println("CCCCC");
    }
}

class Mae extends Avo{
    Mae(String s) {}
    Mae() {
        System.out.println("BBBBBB");
    }
}

class Filha extends Mae {
    Filha() {
        System.out.println("AAAA");
    }

    Filha(String a) {
        super();
        System.out.println("AAAA");
    }

    public static void main(String[] args) {
        new Filha("MMM");
    }
}

class TesteConstrutores3 {
    public static void main(String[] args) {
        new Filha("567");

        Carro c = new Carro();
        ((Veiculo) c).velocidade = 50;
        System.out.println(c.velocidadeDoCarro());
        System.out.println(c.velocidadeDoVeiculo());
    }
}