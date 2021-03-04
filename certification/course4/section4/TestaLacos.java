class TestaLacos {
    public static void main(String[] args) {

        for (int i = 1; i < 10; i++) {
            System.out.println(i);
        }

        for(;j<10;) {
            System.out.println(i);
            j++;
        }

        int j = 9;
        while (j<10) {
            System.out.println("while " + j);
            j++;
        }

        do {
            System.out.println("do...while " + j);
            j++;
        } while (j < 10);

    }
}