package br.com.alura.estoque.aluratorplayground.reflexao;

import br.com.alura.estoque.aluratorplayground.controle.*;

import java.io.IOException;

public class TesteInstanciaObjeto {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IOException {
        //url do tipo -> /controle/lista

        Class<Controle> controleClass1 = Controle.class; //objeto que consegue inferir todas as informações relativas a nossa classe controle

        SubControle controle = new SubControle();
        Class<? extends SubControle> constroleClasse2 = controle.getClass();

        Class<?> controleClasse3 = Class.forName("br.com.alura.alurator.playground.controle.Controle");

        //Controle controle1 = controleClass1.newInstance();
        Object controle1 = controleClass1.newInstance();
        System.out.println(controle1 instanceof Controle);


    }
}
