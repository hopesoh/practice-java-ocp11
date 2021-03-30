import java.util.ArrayList;

public class TestaArrayList {
    public static void main(String[] args) {

//        ArrayList nomes = new ArrayList();
        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("java");
        nomes.add("ruby");
        nomes.add("java");

        System.out.println(nomes.contains("java"));
        System.out.println(nomes.contains("c#"));

        System.out.println("------------");

        boolean removido = nomes.remove("java");
        System.out.println(removido);
        System.out.println(nomes.contains("java"));

        System.out.println(nomes.size());

        System.out.println("------------");

        Object[] obj = nomes.toArray();
        String[] newObj = nomes.toArray(new String[nomes.size()]);
        String[] newObj2 = nomes.toArray(new String[0]);

        System.out.println("------------");

        ArrayList<String> paises = new ArrayList<>();
        paises.add("Brasil");
        paises.add("Coreia");

        ArrayList<String> tudo = new ArrayList<>();
        tudo.addAll(nomes);
        tudo.addAll(paises);
        System.out.println(tudo.size());

        System.out.println("------------");
    }
}