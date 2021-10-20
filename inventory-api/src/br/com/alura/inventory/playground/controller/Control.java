package br.com.alura.inventory.playground.controller;

import lombok.*;

import java.util.List;

@NoArgsConstructor
@Getter
public class Control {
	private List<String> list = List.of("item 1", "item 2", "item 3");

	private Control(String s, String t) { }

	private void firstControlMethod() {}

	public void secondControlMethod(String p1) {
		System.out.println("Controle.secondControlMethod(String p1)");
		System.out.println("Parâmetro obtido: " + p1);

	}

	public void secondControlMethod(String p1, String p2) {
		System.out.println("Controle.metodoControle2(String p1, String p2)");
		System.out.println("Parâmetro obtido p1: " + p1);
		System.out.println("Parâmetro obtido p2: " + p2);

	}

	public void secondControlMethod(String p1, Integer p2) {
		System.out.println("Controle.secondControlMethod(String p1, Integer p2)");
		System.out.println("Parâmetro obtido p1: " + p1);
		System.out.println("Parâmetro obtido p2: " + p2);

	}
}
