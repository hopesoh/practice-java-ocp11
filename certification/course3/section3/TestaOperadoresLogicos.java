class TestaOperadoresLogicos {

    public static boolean metodo(String msg) {
        System.out.println(msg);
        return true;
    }

    public static void main(String[] args) {

        System.out.println(1==1 & 1>2);
        System.out.println(1!=1 && 1>2);
        System.out.println(1==1 | 1>2);
        System.out.println(1==1 || 1>2);
        System.out.println(1==1 ^ 1>2);
        System.out.println(!(1==1));

        System.out.println("-------------");
        System.out.println(1==1 && metodo("primeiro"));
        System.out.println(1!=1 && metodo("segundo"));
        System.out.println(1==1 || metodo("terceiro"));

    }
}