class TestaAtribuicaoMultipla {
    public static void main(String[] args) {

        int a = 15, b = 20, c = 30;
        a = (b = c) + 1;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }
}