package br.com.alura.inventory.alurator.ioc;

import java.lang.reflect.*;
import java.util.*;
import java.util.stream.Stream;

public class ContainerIOC {

    private Map<Class<?>, Class<?>> typesMap = new HashMap<>();

    public Object getInstance(Class<?> originalType) {
        Class<?> destinyType = typesMap.get(originalType);
        if (destinyType != null) return getInstance(destinyType);

        Stream<Constructor<?>> declaredConstructors = Stream.of(originalType.getDeclaredConstructors());
        Optional<Constructor<?>> defaultConstructor = declaredConstructors
                .filter(constructor -> constructor.getParameterCount() == 0)
                .findFirst();

        try {
            if (defaultConstructor.isPresent()) return defaultConstructor.get().newInstance();

            Constructor<?> declaredConstructor = originalType.getDeclaredConstructors()[0];
            List<Object> params =  new ArrayList<>();
            for (Parameter param : declaredConstructor.getParameters()) params.add(getInstance(param.getType()));

            return  declaredConstructor.newInstance(params.toArray());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public <T, K extends T> void register(Class<T> originalType, Class<K> destinyType) {
        typesMap.put(originalType, destinyType);
    }
}
