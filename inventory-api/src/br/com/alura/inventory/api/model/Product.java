package br.com.alura.inventory.api.model;

import br.com.alura.inventory.alurator.converter.annotation.XMLTagName;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@XMLTagName("product")
public class Product {

	@XMLTagName("name")
	private String name;

	@XMLTagName("value")
	private double value;

	@XMLTagName("brand")
	private String brand;

	public boolean hasSameName(String name) {
		return this.getName().toLowerCase().startsWith(name.toLowerCase());
	}

	public boolean hasSameBrand(String brand) {
		return this.getBrand().equalsIgnoreCase(brand);
	}

	public boolean isSame(String name, String brand) {
		return hasSameName(name) && hasSameBrand(brand);
	}

	@Override
	public String toString() {
		return "Produto [nome=" + name + ", valor=" + value + ", marca=" + brand + "]";
	}
}
