package br.com.alura.inventory.alurator.protocol;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ClassManipulator {

    private Class<?> controllerClass;

    public ConstructorManipulator getDefaultConstructor() {
        try {
            return new ConstructorManipulator(controllerClass.getDeclaredConstructor());
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public ObjectManipulator createInstance() {
        return new ObjectManipulator(getDefaultConstructor().invoke());
    }
}
