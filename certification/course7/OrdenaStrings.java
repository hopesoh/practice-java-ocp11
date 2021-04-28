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
//        palavras.sort(comparador);
        palavras.sort((s1,s2) -> Integer.compare(s1.length(), s2.length()));
        System.out.println(palavras);

        palavras.forEach(s -> System.out.println(s));

    }
}

class ComparadorPorTamanho implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {
        if (s1.length() < s2.length()) return -1;
        if (s1.length() > s2.length()) return 1;
        return 0;
    }
}