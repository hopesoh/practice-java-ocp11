package encapsulamento;

class Pessoa {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null) nome = "";
        this.nome = nome;
    }
}