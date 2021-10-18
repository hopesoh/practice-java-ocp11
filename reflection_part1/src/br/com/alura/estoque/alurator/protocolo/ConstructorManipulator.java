package br.com.alura.estoque.alurator.protocolo;

import java.lang.reflect.*;

public class ConstructorManipulator {
    private Constructor<?> constructor;

    public ConstructorManipulator(Constructor<?> constructor) {
        this.constructor = constructor;
    }

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
