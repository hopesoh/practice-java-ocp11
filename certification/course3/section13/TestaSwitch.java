class TestaSwitch {
    public static void main(String[] args) {

        int opcao = 4;
        final int variavel = 1;
        switch (opcao) {
            case variavel:
                System.out.println("primeira opção");
                break;
            default:
                System.out.println("default");
            case 2:
                System.out.println("segunda opção");
            case 3:
                System.out.println("terceira opção");
        }

    }
}