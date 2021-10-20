package br.com.alura.inventory.api.repository;

import java.util.List;

import br.com.alura.inventory.api.model.Product;

public interface ProductRepository {
	List<Product> list();
	Product getProduct(Integer id);
}
