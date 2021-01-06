class TestaStringBufferEBuilder {
    public static void main(String[] args) {
//        StringBuffer sb = new StringBuffer();
//        System.out.println(sb.toString());
//
//        StringBuffer sb2 = new StringBuffer("Caelum");
//        sb2.append(" - ");
//        sb2.append("Ensino e Inovação");
//        System.out.println(sb2);
//
//        StringBuffer sb3 = new StringBuffer(50);
//        System.out.println(sb3.toString());
//
//        StringBuffer sb4 = new StringBuffer(sb2);
//        sb4.append(" e Alura e Casa do Código");
//        System.out.println(sb4.toString());

        StringBuilder sb5 = new StringBuilder();
        System.out.println(sb5.toString());

        StringBuilder sb6 = new StringBuilder("Caelum");
        sb6.append(" - ");
        sb6.append("Ensino e Inovação");
        System.out.println(sb6);

        StringBuilder sb7 = new StringBuilder(50);
        System.out.println(sb7.toString());

        StringBuilder sb8 = new StringBuilder(sb6);
        sb8.append(" e Alura e Casa do Código");
        sb8.append("x");
        sb8.append(sb6);
        System.out.println(sb8.toString());

        StringBuilder sb9 = new StringBuilder("Caelum - Inovação");
        sb9.insert(9, "Ensino e ");
        System.out.println(sb9.toString());
        sb9.delete(6,15);
        System.out.println(sb9);

        String valor = sb9.toString();
        System.out.println(new StringBuffer("sonia").reverse());


    }
}