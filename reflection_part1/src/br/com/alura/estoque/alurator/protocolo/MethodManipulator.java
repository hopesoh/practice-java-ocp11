package br.com.alura.estoque.alurator.protocolo;

import java.lang.reflect.*;
import java.util.*;
import java.util.stream.Stream;

public class MethodManipulator {
    private Method method;
    private Object instance;
    private Map<String, Object> queryParams;

    public MethodManipulator(Method method, Object instance, Map<String, Object> queryParams) {
        this.method = method;
        this.instance = instance;
        this.queryParams = queryParams;
    }

    public Object invoke() {
        try {
            List<Object> params = new ArrayList<>();
            Stream.of(method.getParameters())
                    .forEach(param -> params.add(queryParams.get(param.getName())));
            return method.invoke(instance);
        } catch (IllegalAccessException | IllegalArgumentException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            e.printStackTrace();
            throw new RuntimeException("Erro dentro do método!", e);
        }
    }
}
