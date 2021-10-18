package br.com.alura.estoque.alurator.protocolo;

import java.util.*;

public class Request {

	private String controllerName;
	private String methodName;
	private Map<String, Object> queryParams;

	public Request(String url) {
		String[] chunks = url.replaceFirst("/", "")
				.split("[?]");
		String[] controllerAndMethod = chunks[0].split("/");

		this.controllerName = Character.toUpperCase(getFirstCharacterFromControllerName(controllerAndMethod[0]))
				+ getRemainingControllerName(controllerAndMethod[0]) + "Controller";
		this.methodName = controllerAndMethod[1];
		this.queryParams = chunks.length > 1 ? new QueryParamsBuilder().withParams(chunks[1]).build()
				: new HashMap<>();
	}
	private Character getFirstCharacterFromControllerName(String chunk) {
		return chunk.charAt(0);
	}

	private String getRemainingControllerName(String chunk) {
		return chunk.substring(1).toLowerCase();
	}

	public String getControllerName() {
		return controllerName;
	}

	public String getMethodName() {
		return methodName;
	}

	public Map<String, Object> getQueryParams() {
		return queryParams;
	}
}
