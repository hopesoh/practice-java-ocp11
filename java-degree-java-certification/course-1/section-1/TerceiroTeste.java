public class TerceiroTeste {
	public void m1(String nome) {
		System.out.println(nome);
		m2();
		System.out.println(nome);
	}

	public void m2() {
	}

	/*
	NÃO COMPILA

	public void m1(String nome) {
		m2();
	}
	public void m2() {
		System.out.println(nome);
	}
	*/

	public static void main(String[] args) {
		TerceiroTeste t = new TerceiroTeste();
		t.m1("Sonia");
	}

}