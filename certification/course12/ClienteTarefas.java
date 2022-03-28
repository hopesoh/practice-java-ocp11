import java.net.Socket;
import java.util.Scanner;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.IOException;

public class ClienteTarefas {
    public static void main(String[] args) throws Exception {

        Socket socket = new Socket("localhost", 12345);
        System.out.println("Conexão estabelecida!");

        Thread threadEnviaComando = new Thread(new Runnable() {

            @Override
            public void run() {
                try {
                    PrintStream saida = new PrintStream(socket.getOutputStream());
                    Scanner teclado = new Scanner(System.in);
                    while(teclado.hasNextLine()) {
                        String linha = teclado.nextLine();
                        if (linha.trim().equals("")) break;
                        saida.println(linha);
                    }
                    saida.close();
                    teclado.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

        });

        Thread threadRecebeResposta = new Thread(new Runnable() {

            @Override
            public void run() {
                try {
                    Scanner respostaServidor = new Scanner(socket.getInputStream());
                    while (respostaServidor.hasNextLine()) {
                        String linha = respostaServidor.nextLine();
                        System.out.println(linha);
                    }

                    respostaServidor.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        threadEnviaComando.start();
        threadRecebeResposta.start();

        threadEnviaComando.join();
        socket.close();
    }
}