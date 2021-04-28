import java.util.*;
import java.lang.*;
import java.util.stream.Collectors;

class Curso {

    private String nome;
    private int alunos;

    public Curso(String nome, int alunos) {
        this.nome = nome;
        this.alunos = alunos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAlunos() {
        return alunos;
    }

    public void setAlunos(int alunos) {
        this.alunos = alunos;
    }
}

public class ExemploCursos {
    public static void main(String[] args) {
        List<Curso> cursos = new ArrayList<Curso>();
        cursos.add(new Curso("Python", 45));
        cursos.add(new Curso("JavaScript", 150));
        cursos.add(new Curso("Java 8", 113));
        cursos.add(new Curso("C", 55));

        cursos.sort(Comparator.comparing(Curso::getAlunos));
//        cursos.forEach(c -> System.out.println(c.getNome()));
        cursos.stream().filter(c -> c.getAlunos() >= 100)
                .forEach(c -> System.out.println(c.getNome()));

        cursos.stream().filter(c -> c.getAlunos() >= 100)
                .map(Curso::getAlunos)
                .forEach(System.out::println);

        int sum = cursos.stream().filter(c -> c.getAlunos() >= 100)
                .mapToInt(Curso::getAlunos)
                .sum();

        OptionalDouble media = cursos.stream().filter(c -> c.getAlunos() >= 100)
                .mapToInt(Curso::getAlunos)
                .average();

        System.out.println(sum);

        Optional<Curso> possivelCurso = cursos.stream().filter(c -> c.getAlunos() >= 100)
                .findAny();

        Curso curso = possivelCurso.orElse(null);
        System.out.println(curso.getNome());

        possivelCurso.ifPresent(c -> System.out.println(c.getNome()));

//        cursos = cursos.stream()
//                .filter(c -> c.getAlunos() >= 100)
//                .collect(Collectors.toList());

        cursos.stream()
                .filter(c -> c.getAlunos() >= 100)
                .collect(Collectors.toMap(
                        c -> c.getNome(),
                        c -> c.getAlunos()
                ))
                .forEach((nome, alunos) -> System.out.println(nome + " tem " + alunos + " alunos."));

    }

}