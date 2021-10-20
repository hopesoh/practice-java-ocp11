package br.com.alura.inventory.playground.reflection;

import br.com.alura.inventory.playground.annotations.XMLTagName;
import br.com.alura.inventory.playground.model.Product;

public class TesteManipulaAnotacao {
    public static void main(String[] args) {
        Product product = new Product("Produto 1", 20.0, "Marca 1");
        Class<?> aClass = product.getClass();

        XMLTagName declaredAnnotation = aClass.getDeclaredAnnotation(XMLTagName.class);
        String value = declaredAnnotation.value();
        System.out.println(value);
    }
}
