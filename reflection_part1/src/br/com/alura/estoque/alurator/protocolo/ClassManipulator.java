package br.com.alura.estoque.alurator.protocolo;

import java.lang.reflect.Constructor;

public class ClassManipulator {

    private Class<?> controllerClass;

    public ClassManipulator(Class<?> controllerClass) {
        this.controllerClass = controllerClass;
    }

    public ConstructorManipulator getDefaultConstructor() {
        try {
            Constructor<?> declaredConstructor = controllerClass.getDeclaredConstructor();
            return new ConstructorManipulator(declaredConstructor);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public ObjectManipulator createInstance() {
        Object instance = getDefaultConstructor().invoke();
        return new ObjectManipulator(instance);
    }
}
