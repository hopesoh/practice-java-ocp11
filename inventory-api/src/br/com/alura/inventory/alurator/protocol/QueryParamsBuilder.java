package br.com.alura.inventory.alurator.protocol;

import java.util.*;

public class QueryParamsBuilder {
	private Map<String, Object> queryParams = new HashMap<>();

	public QueryParamsBuilder withParams(String stringQueryParams) {
		for (String stringParam : stringQueryParams.split("&")) extract(stringParam);
		return this;
	}

	private void extract(String stringParam) {
		String[] split = stringParam.split("=");
		String key = split[0];
		Object value = split[1];

		queryParams.put(key, value);
	}

	public Map<String, Object> build() {
		return this.queryParams;
	}

}
