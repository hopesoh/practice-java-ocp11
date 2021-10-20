package br.com.alura.inventory.alurator.protocol;

import java.util.*;

public class Request {

	private String controllerName;
	private String methodName;
	private Map<String, Object> queryParams;

	public Request(String url) {
		String[] chunks = getChunks(url.replaceFirst("/", ""), "[?]");
		String[] controllerAndMethod = getChunks(chunks[0], "/");

		this.controllerName = getControllerName(controllerAndMethod[0]);
		this.methodName = controllerAndMethod[1];
		this.queryParams = getQueryParams(chunks);
	}

	private String[] getChunks(String chunk, String separator) {
		return chunk.split(separator);
	}

	private String getControllerName(String chunk) {
		return Character.toUpperCase(getFirstCharacterFromControllerName(chunk))
				+ getRemainingControllerName(chunk) + "Controller";
	}

	private Map<String, Object> getQueryParams(String[] chunks) {
		return chunks.length > 1 ? new QueryParamsBuilder().withParams(chunks[1]).build()
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
