package br.com.alura.inventory.playground.model;

import br.com.alura.inventory.playground.annotations.XMLTagName;
import lombok.*;

@Getter
@AllArgsConstructor
@XMLTagName("product")
public class Product extends SuperProduct {

	private String name;
	private double value;
	private String brand;

	@Override
	public String toString() {
		return "Produto [nome=" + name + ", valor=" + value + ", marca=" + brand + "]";
	}
}
