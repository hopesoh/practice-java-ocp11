import java.util.*;

public class TestandoListas {
    public static void main(String[] args) {

        String aula1 = "Conhecendo mais de listas";
        String aula2 = "Modelando a classe Aula";
        String aula3 = "Trabalhando com Cursos e Sets";

        //adicionar itens na lista
        ArrayList<String> aulas = new ArrayList<>();
        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);

        System.out.println(aulas);

        //remover itens da minha lista
        aulas.remove(0);
        System.out.println(aulas);

        //for each
        for (String aula : aulas) {
            System.out.println("Aula: " + aula);
        }

        //percorrendo por índice
        String primeiraAula = aulas.get(0);
        System.out.println("A primeira aula é " + primeiraAula);

        //As coleções sempre terão esse método size()
        for (int i = 0; i < aulas.size(); i++) {
            System.out.println("aula: " + aulas.get(i));
        }

        //método forEach
        aulas.forEach(aula -> {
            System.out.println("Percorrendo: ");
            System.out.println(aula);
        });

        aulas.add("Aumentando nosso conhecimento");
        System.out.println(aulas);

        //Ordena de acordo coma  String (lexicográfica), ordem alfabética
        Collections.sort(aulas);
        System.out.println(aulas);
    }
}