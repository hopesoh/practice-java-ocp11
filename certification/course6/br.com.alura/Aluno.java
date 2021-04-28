import java.lang.*;

public class Aluno {

    private String nome;
    private int numeroMatricula;

    public Aluno(String nome, int numeroMatricula) {
        this.nome = nome;
        this.numeroMatricula = numeroMatricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(int numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    @Override
    public java.lang.String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", numeroMatricula=" + numeroMatricula +
                '}';
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Aluno)) return false;
        if (!super.equals(object)) return false;
        Aluno aluno = (Aluno) object;
        return getNumeroMatricula() == aluno.getNumeroMatricula() && java.util.Objects.equals(getNome(), aluno.getNome());
    }

    public int hashCode() {
        return java.util.Objects.hash(super.hashCode(), getNome(), getNumeroMatricula());
    }
}