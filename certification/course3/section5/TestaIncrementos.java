class TestaIncrementos {
    public static void main(String[] args) {

        int a = 10;
        a += ++a + a + ++a;
        System.out.println(a);
//        a = a + ++a + a + ++a;
//        a = 10 + ++a + a + ++a;
//        a = 10 + 11 + a + ++a;
//        a = 10 + 11 + 11 + ++a;
//        a = 10 + 11 + 11 + 12;
//        a = 44;

        int i = 5;
        System.out.println(i--); //5
        System.out.println(i); //4
        System.out.println(i++); //4
        System.out.println(i); //5
        System.out.println(--i); //4
        System.out.println(i); //4
        System.out.println(++i); //5
        System.out.println(i); //5

        i += 2;
        i -= 2;
        i *= 100;
        i /= 10;
        i %= 5;
        System.out.println(i += 5); //5

        byte b = 10;
        b += 200;
        System.out.println(b);
//        System.out.println(b = b + 300); NÃO COMPILA


    }
}