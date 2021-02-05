class TestaTernario {
    public static void main(String[] args) {

        //(condicao) ? caso_verdadeira : caso_falsa

        int i = 5;
        int resultado = (i == 5) ? 100 : 0;
        System.out.println(resultado);
        System.out.println(i == 5 ? "100" : 0);

        Object resultado_2 = i == 5 ? "100" : 0;
        System.out.println(resultado_2);

    }
}