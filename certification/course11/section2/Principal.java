public class Principal {
    public static void main(String[] args) {
        String name = "Jon";

        Thread threadAssinaturas1 = new Thread(new TarefaBuscaTextual("assinaturas1.txt", name));
        Thread threadAssinaturas2 = new Thread(new TarefaBuscaTextual("assinaturas2.txt", name));
        Thread threadAutores = new Thread(new TarefaBuscaTextual("autores.txt", name));

        threadAssinaturas1.start();
        threadAssinaturas2.start();
        threadAutores.start();
    }
}