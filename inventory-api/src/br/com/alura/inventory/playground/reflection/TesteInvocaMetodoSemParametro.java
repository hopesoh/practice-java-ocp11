package br.com.alura.inventory.playground.reflection;

import java.lang.reflect.*;

public class TesteInvocaMetodoSemParametro {

    public static void main(String[] args) throws Exception{
        Class<?> subControleClass = Class.forName("br.com.alura.inventory.playground.controller.SubControl");

        for (Method method : subControleClass.getMethods()) {
            System.out.println(method);
        }

        System.out.println("__________________");

        for (Method method : subControleClass.getDeclaredMethods()) {
            System.out.println(method);
        }

        System.out.println("_________________");

        Constructor<?> declaredConstructors = subControleClass.getDeclaredConstructor();
        declaredConstructors.setAccessible(true);
        Object newInstance = declaredConstructors.newInstance();

        Method method = subControleClass.getDeclaredMethod("metodoSubControle2");
        method.setAccessible(true);
        Object object = method.invoke(newInstance);
        System.out.println(object);

        method = subControleClass.getDeclaredMethod("firstSubControlMethod");
        object = method.invoke(newInstance);
        System.out.println(object);
    }
}
