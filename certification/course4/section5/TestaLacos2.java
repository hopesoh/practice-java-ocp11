class TestaLacos2 {
    public static void main(String[] args) {

//        externo: for (int i = 1; i < 10; i++) {
//            for (int j = 1; j<10; j++) {
//                if (i*j == 25) break externo;
//                System.out.println(i + " * " + j + " = " + (i*j));
//            }
//        }

        for(int i=0; i<4; i++) {
            System.out.println("Estou antes do switch");
            switch (i) {
                case 0:
                case 1:
                    System.out.println("Caso " + i);
                    break;
                case 2:
                    System.out.println("Legal, " + i);
                    continue;
                case 3:
                    System.out.println("Cheguei no 3");
                    break;
                default:
                    System.out.println("Estranho...");
                    break;
            }
            System.out.println("Estou após o switch");
        }

//        NÃO COMPILA, POIS NÃO EXISTE UM LAÇO MAIS PRÓXIMO PARA SER DADO O CONTINUE.
//        switch (i) {
//            case 0:
//            case 1:
//                System.out.println("Caso " + i);
//                break;
//            case 2:
//                System.out.println("Legal, " + i);
//                continue;
//            case 3:
//                System.out.println("Cheguei no 3");
//                break;
//            default:
//                System.out.println("Estranho...");
//                break;
//        }

        System.out.println();

        for (int j=1; j<10; j++) {
            if (j==8) break;
            if(j==5) continue;
            System.out.println(j);
        }

        System.out.println();

        int i = 0;
        lacoWhile: while (i<10) {
            i++;
            if (i == 5) continue;
            System.out.println("i = " + i);
        }

//        COMPILA E RODA NORMALMENTE
//        int i = 0;
//        while (true) {
//            i++;
//            if (i == 5) break;
//            System.out.println("i = " + i);
//        }

//        DÁ ERRO DE COMPILAÇÃO
//        int i = 0;
//        while (true) {
//            i++;
//            if (i == 5) continue;
//            System.out.println("i = " + i);
//        }

//        int i = 0;
//        while (i<10) {
//            i++;
//            if (i == 5) break;
//            System.out.println("i = " + i);
//        }
        System.out.println("Fora do while");
    }
}