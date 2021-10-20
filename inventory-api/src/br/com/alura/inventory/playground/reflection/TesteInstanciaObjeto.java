package br.com.alura.inventory.playground.reflection;

import br.com.alura.inventory.playground.controller.*;

import java.io.IOException;

public class TesteInstanciaObjeto {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IOException {
        //url do tipo -> /controle/lista

        Class<Control> controleClass1 = Control.class; //objeto que consegue inferir todas as informações relativas a nossa classe controle

        SubControl controle = new SubControl();
        Class<? extends SubControl> constroleClasse2 = controle.getClass();

        Class<?> controleClasse3 = Class.forName("br.com.alura.alurator.playground.controle.Controle");

        //Controle controle1 = controleClass1.newInstance();
        Object controle1 = controleClass1.newInstance();
        System.out.println(controle1 instanceof Control);


    }
}
