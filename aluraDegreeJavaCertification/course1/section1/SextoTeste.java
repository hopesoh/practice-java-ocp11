class Pessoa {
	static int id=1;
	static void metodo() {
		System.out.println(id);
	}
}

public class SextoTeste {

	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		System.out.println(p.id);
		System.out.println(Pessoa.id);

		Pessoa.metodo();
	}

}