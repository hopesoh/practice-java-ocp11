public class PrintConsole {

    public static void main(String[] args) {

        Runnable print = new PrintAction("Sonia");
        Thread thread = new Thread(print);
        thread.start();

    }
}