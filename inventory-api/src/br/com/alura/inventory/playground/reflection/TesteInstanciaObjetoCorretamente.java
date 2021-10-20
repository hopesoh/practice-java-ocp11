package br.com.alura.inventory.playground.reflection;

import br.com.alura.inventory.playground.controller.SubControl;

import java.lang.reflect.*;

public class TesteInstanciaObjetoCorretamente {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        Class<SubControl> subControleClass1 = SubControl.class;
        Constructor<SubControl> constructor = subControleClass1.getConstructor();
        System.out.println(constructor);

        Constructor<SubControl> constructor1 = subControleClass1.getDeclaredConstructor(String.class);
        System.out.println(constructor1);

        constructor1.setAccessible(true);
        SubControl subControl = constructor1.newInstance("");
        System.out.println(subControl);

        Class<?> subControleClass2 = Class.forName("br.com.alura.inventory.playground.controller.SubControl");

        Class<?> controleClass1 = Class.forName("br.com.alura.inventory.playground.controller.Control");
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
