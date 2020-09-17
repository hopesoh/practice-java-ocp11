public class QuintoTeste {

	String nome = "Sonia";
	String nomeCompleto = nome + " Alves";

	public QuintoTeste() {
		System.out.println(nome);
		m2();
	}

	public void m2() {
		System.out.println(nomeCompleto);
	}

	public static void main(String[] args) {
		QuintoTeste t = new QuintoTeste();
		t.nome = "Maria";
		System.out.println(t.nome);
	}

}