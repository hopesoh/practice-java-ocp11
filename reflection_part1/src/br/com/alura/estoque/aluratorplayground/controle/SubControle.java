package br.com.alura.estoque.aluratorplayground.controle;

public class SubControle extends Controle{
    public SubControle() {
    }

    private SubControle(String s) {
    }

    public void metodoSubControle1() {
        System.out.println("Executando método SubControle.metodoSubControle1()");
    }

    private String metodoSubControle2() {
        System.out.println("Executando método SubControle.metodoSubControle2()");
        return "retorno do método SubControle.metodoSubControle2()";
    }
}
