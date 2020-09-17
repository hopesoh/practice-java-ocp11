public class SegundoTeste {
	public void m1() {
		
		for(int i=0, j=0; i<10; i++) j++;

		//System.out.println(j); NÃO COMPILA
		//System.out.println(i); NÃO COMPILA
	}

	public static void main(String[] args) {
		SegundoTeste t = new SegundoTeste();
		t.m1();
	}

}