package br.com.alura.inventory.alurator.protocol;

import lombok.AllArgsConstructor;

import java.lang.reflect.*;

@AllArgsConstructor
public class ConstructorManipulator {
    private Constructor<?> constructor;

    public Object invoke() {
        try {
            return constructor.newInstance();
        } catch (IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
            return new RuntimeException();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
            return new RuntimeException("Erro no construtor!", e.getTargetException());
        }
    }
}
