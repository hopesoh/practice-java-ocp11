import java.util.*;
import java.lang.*;

public class OrdenaStrings {
    public static void main(String[] args) {

        List<String> palavras = new ArrayList<>();
        palavras.add("Alura Online");
        palavras.add("Editora Casa do Código");
        palavras.add("Caelum");

        Comparator<String> comparador = new ComparadorPorTamanho();
//        Collections.sort(palavras, comparador);
        palavras.sort(comparador);
        System.out.println(palavras);

//        Consumer<String> consumidor = new ImprimeNaLinha();
        palavras.forEach(s -> System.out.println(s));

    }
}

//class ImprimeNaLinha implements Consumer<String> {
//
//    @Override
//    public void accept(String s) {
//        System.out.println(s);
//    }
//}

class ComparadorPorTamanho implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {
        if (s1.length() < s2.length()) return -1;
        if (s1.length() > s2.length()) return 1;
        return 0;
    }
}