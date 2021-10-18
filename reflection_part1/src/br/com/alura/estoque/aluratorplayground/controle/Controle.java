package br.com.alura.estoque.aluratorplayground.controle;

import java.util.List;

public class Controle {
	private List<String> lista = List.of("item 1", "item 2", "item 3");

	public Controle()  {
	}

	private Controle(String s, String t) {

	}

	public List<String> getLista() {
		return lista;
	}

	private void metodoControle1() {}

	public void metodoControle2(String p1) {
		System.out.println("Controle.metodoControle2(String p1)");
		System.out.println("Parâmetro obtido: " + p1);

	}

	public void metodoControle2(String p1, String p2) {
		System.out.println("Controle.metodoControle2(String p1, String p2)");
		System.out.println("Parâmetro obtido p1: " + p1);
		System.out.println("Parâmetro obtido p2: " + p2);

	}

	public void metodoControle2(String p1, Integer p2) {
		System.out.println("Controle.metodoControle2(String p1, Integer p2)");
		System.out.println("Parâmetro obtido p1: " + p1);
		System.out.println("Parâmetro obtido p2: " + p2);

	}
}
