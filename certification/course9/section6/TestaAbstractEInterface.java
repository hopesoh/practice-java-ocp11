abstract class SemMetodo {

}

abstract class ComMetodoAbstrato {
    abstract void executa();
}

interface Veiculo {
    void liga();
}

class Carro extends Veiculo {
    //não pode ser concreta pois herdou o
    //método liga mas não implementou
    void liga() {

    }
}

abstract class CarroAutomatico extends Carro {
    abstract void liga();
}

abstract class CarroAutomaticoBonito extends CarroAutomatico {
    //precisa implementar novamente liga caso seja concreta
}

class TestaAbstractEInterface {
    public static void main(String[] args) {
        Carro c = new Carro();
        c.liga();
//        new SemMetodo();
//        new ComMetodoAbstrato();
    }
}