public class QuartoTeste {
	public QuartoTeste(String nome) {
		System.out.println(nome);
		m2();
		System.out.println(nome);
	}

	public void m2() {
		//System.out.println(nome); NÃO COMPILA
	}

	public static void main(String[] args) {
		QuartoTeste t = new QuartoTeste("Sonia");
	}

}