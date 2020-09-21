public class HelloWorld {
	
	public static void main(String[] args) {
		System.out.println("rodando o programa");
		System.out.println(args.length);
		
		for(int i=0; i<args.length; i++) {
			System.out.println(i + " => " + args[i]);
		}
	}

	/*RODA
	public static void main(String... args) {
		System.out.println("rodando o programa");
	}
	*/

	/*RODA
	public static void main(String[] params) {
		System.out.println("rodando o programa");
	}
	*/

	/*NÃO RODA
	static void main(String[] args) {
		System.out.println("Não roda o programa");
	}
	*/

	/*NÃO RODA
	public void main(String[] args) {
		System.out.println("Não roda o programa");
	}
	*/

	/*NÃO RODA
	public static int main(String[] args) {
		System.out.println("Não roda o programa");
	}
	*/

	/*NÃO RODA
	public static void teste(String[] args) {
		System.out.println("Não roda o programa");
	}
	*/
}