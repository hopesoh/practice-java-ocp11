package br.com.alura.estoque.alurator.protocolo;

import java.util.*;

public class QueryParamsBuilder {
	private Map<String, Object> queryParams = new HashMap<>();

	public QueryParamsBuilder withParams(String stringQueryParams) {
		String[] stringParams = stringQueryParams.split("&");
		
		for (String stringParam : stringParams) {
			String[] chaveEValor = stringParam.split("=");
			
			String chave = chaveEValor[0];
			Object valor = chaveEValor[1];
			
			queryParams.put(chave, valor);
		}
		
		return this;
	}
	
	public Map<String, Object> build() {
		return this.queryParams;
	}

}
