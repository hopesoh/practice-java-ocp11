package br.com.alura.inventory;

import br.com.alura.inventory.alurator.Alurator;
import br.com.alura.inventory.api.repository.*;

import java.util.Scanner;

public class Main {

	public static final String CONTROLLER_PACKAGE = "br.com.alura.inventory.api.controller.";

	/**
	 * Simula o navegador.
	 * 
	 */
	public static void main(String[] args) {
		
		/*
		 * Casos possiveis:
		 * /controlador/metodo
		 * /produto/lista
		 * /controlador/metodo?param1=valor1&param2=valor2
		 */
		
		try (Scanner s = new Scanner(System.in)) {
			String url = s.nextLine();
			
			Alurator alurator = new Alurator(CONTROLLER_PACKAGE);
			alurator.register(ProductRepository.class, ProductRepositoryMock.class);

			while (!url.equals("exit")) {
				Object response = alurator.execute(url);
				System.out.println("Response: " + response);
				url = s.nextLine();
			}
		}
	}

}
