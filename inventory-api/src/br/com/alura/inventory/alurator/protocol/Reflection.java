package br.com.alura.inventory.alurator.protocol;

public class Reflection {

    public ClassManipulator reflect(String fullyQualifiedName) {
        return new ClassManipulator(getClass(fullyQualifiedName));
    }

    public Class<?> getClass(String fullyQualifiedName) {
        try {
            return Class.forName(fullyQualifiedName);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
