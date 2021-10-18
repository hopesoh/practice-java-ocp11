package br.com.alura.estoque.alurator.protocolo;

public class Reflection {

    public ClassManipulator reflect(String fullyQualifiedName) {
        try {
            Class<?> controllerClass = Class.forName(fullyQualifiedName);
            return new ClassManipulator(controllerClass);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
