package br.com.alura.estoque.aluratorplayground.reflexao;

import java.lang.reflect.*;

public class TesteInvocaMetodoSemParametro {

    public static void main(String[] args) throws Exception{
        Class<?> subControleClass = Class.forName("br.com.alura.estoque.aluratorplayground.controle.SubControle");

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

        method = subControleClass.getDeclaredMethod("metodoSubControle1");
        object = method.invoke(newInstance);
        System.out.println(object);
    }
}
