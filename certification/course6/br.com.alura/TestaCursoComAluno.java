import java.lang.*;
import java.util.*;

public class TestaCursoComAluno {
    public static void main(String[] args) {

        Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
        javaColecoes.adiciona(new Aula("Modelando com coleções", 24));

        Aluno a1 = new Aluno("Sonia Ribeiro", 123456);
        Aluno a2 = new Aluno("Guilherme Silveira", 48465);
        Aluno a3 = new Aluno("Mauricio Aniche", 74894);

        javaColecoes.matricula(a1);
        javaColecoes.matricula(a2);
        javaColecoes.matricula(a3);

        System.out.println("Todos os alunos matriculados: ");
        javaColecoes.getAlunos().forEach(a -> System.out.println(a));

        Set<Aluno> alunos = javaColecoes.getAlunos();
        Iterator<Aluno> iterador = alunos.iterator();
        while (iterador.hasNext()) {
            Aluno proximo = iterador.next();
            System.out.println(proximo);
        }

        System.out.println("O aluno " + a1.getNome() + " está matriculado?");
        System.out.println(javaColecoes.estaMatriculado(a1));

        Aluno sonia = new Aluno("Sonia Ribeiro", 123456);
        System.out.println(javaColecoes.estaMatriculado(sonia));

        System.out.println(sonia.equals(a1));
        System.out.println(sonia == a1);

    }
}