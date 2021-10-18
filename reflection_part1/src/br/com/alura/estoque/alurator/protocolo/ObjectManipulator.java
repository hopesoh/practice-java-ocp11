package br.com.alura.estoque.alurator.protocolo;

import java.lang.reflect.Method;
import java.util.Map;
import java.util.stream.Stream;

public class ObjectManipulator {

    private Object instance;

    public ObjectManipulator(Object instance) {
        this.instance = instance;
    }

    public MethodManipulator getMethod(String methodName, Map<String, Object> queryParams) throws NoSuchMethodException {
        Stream<Method> declaredMethods = Stream.of(instance.getClass().getDeclaredMethods());
        Method selectedMethod = declaredMethods
                .filter(method ->
                        method.getName().equals(methodName)
                        && method.getParameterCount() == queryParams.values().size()
                        && Stream.of(method.getParameters())
                                .allMatch(param ->
                                            queryParams.containsKey(param.getName())
                                            && queryParams.get(param.getName()).getClass().equals(param.getType())
                                        )
                )
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Método não encontrado!"));

        return new MethodManipulator(selectedMethod, instance, queryParams);
    }
}
