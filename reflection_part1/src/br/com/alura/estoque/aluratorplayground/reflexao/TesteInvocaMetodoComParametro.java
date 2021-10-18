package br.com.alura.estoque.aluratorplayground.reflexao;

import java.lang.reflect.*;

public class TesteInvocaMetodoComParametro {
    public static void main(String[] args) throws Exception{
        Class<?> controleClass = Class.forName("br.com.alura.estoque.aluratorplayground.controle.Controle");

        Constructor<?> declaredConstructor = controleClass.getDeclaredConstructor();
        Object newInstance = declaredConstructor.newInstance();
        Method method = controleClass.getDeclaredMethod("metodoControle2", String.class, Integer.class);
        Object returnedObject = method.invoke(newInstance, "Sonia", 26);

        System.out.println(returnedObject);
    }
}
