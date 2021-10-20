package br.com.alura.inventory.alurator.protocol;

import lombok.AllArgsConstructor;

import java.lang.reflect.Method;
import java.util.Map;
import java.util.stream.Stream;

@AllArgsConstructor
public class ObjectManipulator {

    private Object instance;

    public MethodManipulator getMethod(String methodName, Map<String, Object> queryParams) {
        Stream<Method> declaredMethods = Stream.of(instance.getClass().getDeclaredMethods());
        Method selectedMethod = declaredMethods
                .filter(method -> hasSameParametersFor(methodName, queryParams, method))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Método não encontrado!"));

        return new MethodManipulator(selectedMethod, instance, queryParams);
    }

    private boolean hasSameParametersFor(String methodName, Map<String, Object> queryParams, Method method) {
        return hasSameName(methodName, method)
                && hasSameNumber(queryParams, method)
                && hasSameClassType(queryParams, method);
    }

    private boolean hasSameClassType(Map<String, Object> queryParams, Method method) {
        return Stream.of(method.getParameters())
                .allMatch(param ->
                        queryParams.containsKey(param.getName())
                                && queryParams.get(param.getName()).getClass().equals(param.getType())
                );
    }

    private boolean hasSameNumber(Map<String, Object> queryParams, Method method) {
        return method.getParameterCount() == queryParams.values().size();
    }

    private boolean hasSameName(String methodName, Method method) {
        return method.getName().equals(methodName);
    }
}
