class B {
	//mesmo sem especificar
	int B;
	void B() {}
	B() {
		//A.TAMANHO = 15; NÃO COMPILA
	}
}

interface A {
	final int TAMANHO = 5;
	void autentica(String nome, String senha);
}


class SegundoTeste {
	
	static int totalDePessoas = 0;
	public int getTotalDePessoas() {
		return totalDePessoas;
	}

	String nome;

	SegundoTeste(String nome) {
		if (nome == null) {
			nome = "Sonia";
			return;
		}
		this.nome = nome;
	}

	public String getNome() {
		String sobrenome = "Sonia";
		return nome + sobrenome;
	}
}
