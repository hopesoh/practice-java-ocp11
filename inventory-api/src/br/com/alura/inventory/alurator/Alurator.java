package br.com.alura.inventory.alurator;

import br.com.alura.inventory.alurator.converter.XMLConverter;
import br.com.alura.inventory.alurator.ioc.ContainerIOC;
import br.com.alura.inventory.alurator.protocol.*;

import java.util.Map;

public class Alurator {

	private String basePackage;
	private ContainerIOC container;

	public Alurator(String basePackage) {
		this.basePackage = basePackage;
		this.container = new ContainerIOC();
	}

	public Object execute(String url) {
		Request request = new Request(url);

		String controllerName = request.getControllerName();
		String methodName = request.getMethodName();
		Map<String, Object> queryParams = request.getQueryParams();

		Class<?> controllerClass = new Reflection().getClass(basePackage + controllerName);
		Object controllerInstance = container.getInstance(controllerClass);

		Object reflected = new ObjectManipulator(controllerInstance)
				.getMethod(methodName, queryParams)
				.invoke();

		reflected = new XMLConverter().convert(reflected);
		return reflected;
	}

	public <T, K extends T> void register(Class<T> originalType, Class<K> destinyType) {
		container.register(originalType, destinyType);
	}
}
