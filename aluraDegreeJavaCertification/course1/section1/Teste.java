public class Teste {
	public void m1() {
		int x = 10;

		if(x >= 10) {
			int y = 50;
			System.out.println(y);
		}
		
		//System.out.println(y); NÃO COMPILA
		System.out.println(x);
	}

	public static void main(String[] args) {
		Teste t = new Teste();
		t.m1();
	}

}