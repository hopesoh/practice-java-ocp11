class Carros {
    Carro c1;
    Carro c2;
}

public class TestaCicloDeVida {

    public static void main(String[] args) {
        Carros carros = new Carros();

        Carro c; //se rodar o código apenas até aqui, não criei nenhum Carro. Para criar, preciso chamar o construtor.

        Carro carro = new Carro(); //a variavel carro é uma referência à classe Carro
        carro.modelo = "aaa";
        carro.ano = "2020";
        carros.c1 = carro;

        carro = new Carro(); //criei um novo Carro na memória e mandei o carro referencias à esse novo Carro. Quem está referenciando ao carro antigo? Ninguém!
        carros.c2 = carro;
        carro = null; //agora tenho dois objetos inacessíveis

        if (15>10) {
            Carro c2 = new Carro(); //inacessível fora do if
            c2.ano = "2010";
        }

        //variável acessível
        Carro c3;
        for (int i=0; i<10; i++) {
            c3 = new Carro();
        }

        //Sem considerar a classe Carros:
        //Quantos objetos foram garbage coletados? Não sei.
        //Quantos objetos podem ser garbage coletados? 2 (carro e c3).
        //Quantos estão inacessíveis? 2 (carro e c2).

        //Considerando a classe Carros:
        //Quantos objetos foram garbage coletados? Não sei.
        //Quantos objetos podem ser garbage coletados? 0.
        //Quantos estão inacessíveis? 0 (a  variável carros ainda pode ser acessada indiretamente pela variável c1 de Carros).
    }
}