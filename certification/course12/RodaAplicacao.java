import java.io.IOException;
import java.net.Socket;

public class RodaAplicacao {

	public static void main(String[] args){

		try(Socket socket = new Socket("localhost", 12345)){
			
			InterfaceGrafica ig = new InterfaceGrafica(socket);
			ig.montaTela();
			ig.imprime("Conexão estabelicada com sucesso");
			initializaThreadQueRecebeAResposta(socket, ig);
			ig.imprime("Servidor fechado");
			
		} catch (IOException | InterruptedException e) {
			throw new RuntimeException(e);
		} 

	}

	private static void initializaThreadQueRecebeAResposta(Socket socket, InterfaceGrafica ig)
			throws InterruptedException {
		
		Runnable threadRecebeResposta = new TarefaRecebeResposta(socket, ig);
		Thread threadResposta = new Thread(threadRecebeResposta);
		threadResposta.start();
		threadResposta.join(); //MAIN vai espearar a threadResposta terminar
	}

}
