package br.com.alura.inventory.api.repository;

import java.util.Arrays;
import java.util.List;

import br.com.alura.inventory.api.model.Product;

public class ProductRepositoryMock implements ProductRepository {
	private static final List<Product> PRODUCT_LIST =
			Arrays.asList(new Product("Produto 1", 20.0, "Marca 1"),
					new Product("Produto 2", 30.0, "Marca 1"),
					new Product("Produto 3", 40.0, "Marca 2"));
	
	public List<Product> list() {
		return PRODUCT_LIST;
	}
	
	public Product getProduct(Integer id) {
		return PRODUCT_LIST.get(id);
	}
}
