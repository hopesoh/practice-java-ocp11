package br.com.alura.estoque.aluratorplayground.reflexao;

import br.com.alura.estoque.aluratorplayground.controle.SubControle;

import java.lang.reflect.*;

public class TesteInstanciaObjetoCorretamente {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        Class<SubControle> subControleClass1 = SubControle.class;
        Constructor<SubControle> constructor = subControleClass1.getConstructor();
        System.out.println(constructor);

        Constructor<SubControle> constructor1 = subControleClass1.getDeclaredConstructor(String.class);
        System.out.println(constructor1);

        constructor1.setAccessible(true);
        SubControle subControle = constructor1.newInstance("");
        System.out.println(subControle);

        Class<?> subControleClass2 = Class.forName("br.com.alura.estoque.aluratorplayground.controle.SubControle");

        Class<?> controleClass1 = Class.forName("br.com.alura.estoque.aluratorplayground.controle.Controle");
        //controleClass1.newInstance();
        try {
            Constructor<?> declaredConstructor = controleClass1.getDeclaredConstructor();
            Object o = declaredConstructor.newInstance();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
            //lança um io exception
            System.out.println(e.getTargetException());
        }

    }
}
