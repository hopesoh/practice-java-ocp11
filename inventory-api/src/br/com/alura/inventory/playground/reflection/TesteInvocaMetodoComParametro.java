package br.com.alura.inventory.playground.reflection;

import java.lang.reflect.*;

public class TesteInvocaMetodoComParametro {
    public static void main(String[] args) throws Exception{
        Class<?> controleClass = Class.forName("br.com.alura.inventory.playground.controller.Control");

        Constructor<?> declaredConstructor = controleClass.getDeclaredConstructor();
        Object newInstance = declaredConstructor.newInstance();
        Method method = controleClass.getDeclaredMethod("secondControlMethod", String.class, Integer.class);
        Object returnedObject = method.invoke(newInstance, "Sonia", 26);

        System.out.println(returnedObject);
    }
}
