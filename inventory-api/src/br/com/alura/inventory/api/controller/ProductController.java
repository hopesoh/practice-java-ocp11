package br.com.alura.inventory.api.controller;

import br.com.alura.inventory.api.model.Product;
import br.com.alura.inventory.api.repository.ProductRepository;
import lombok.AllArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
public class ProductController {
	
	private final ProductRepository productRepository;
	
	public List<Product> list() {
		return productRepository.list();
	}
	
	public List<Product> filter(String name) {
		return productRepository.list().stream()
							.filter(product -> product.hasSameName(name))
							.collect(Collectors.toList());
	}

	public List<Product> filter(String name, String brand) {
		return productRepository.list()
							.stream()
							.filter(product -> product.isSame(name, brand))
							.collect(Collectors.toList());
	}
}
