package br.com.alura.estoque.alurator;

import br.com.alura.estoque.alurator.protocolo.*;

import java.lang.reflect.*;
import java.util.Map;

public class Alurator {

	private String basepackage;

	public Alurator(String basepackage) {
		this.basepackage = basepackage;
	}

	public Object execute(String url) throws NoSuchMethodException {
		Request request = new Request(url);
		String controllerName = request.getControllerName();
		String methodName = request.getMethodName();
		Map<String, Object> queryParams = request.getQueryParams();

		Object controllerInstance = new Reflection()
				.reflect(basepackage + controllerName)
				.getDefaultConstructor()
				.invoke();

		return new Reflection()
				.reflect(basepackage + controllerName)
				.createInstance()
				.getMethod(methodName, queryParams)
				.invoke();
	}
}
