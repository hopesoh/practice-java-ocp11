package br.com.alura.inventory.playground.reflection;

import br.com.alura.inventory.playground.model.Product;

import java.lang.reflect.Field;

public class TesteManipulaAtributos {
    public static void main(String[] args) throws IllegalAccessException, NoSuchFieldException {
        Object product = new Product("Produto 1", 20.0, "Marca 1");
        Class<?> aClass = product.getClass();

//        System.out.println(aClass.getField("id"));

        for (Field field : aClass.getDeclaredFields()) {
            field.setAccessible(true);
            System.out.println(field.getName() + ":" + field.get(product));
        }

    }
}
