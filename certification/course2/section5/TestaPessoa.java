class TestaPessoa {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.setNome("Sonia", 26);

        String nome = p.getNome();
        System.out.println(nome);

        p.getNome();
        System.out.println(p.getNome());
    }
}