class TestaStrings {
    public static void main(String[] args) {
        String texto = "Pretendo fazer a prova de certificação de Java";
        System.out.println(texto.indexOf("Pretendo"));
        System.out.println(texto.indexOf("Pretendia"));
        System.out.println(texto.indexOf("e"));
        System.out.println(texto.indexOf("tendo"));
        System.out.println(texto.indexOf("e", 7));
        System.out.println(texto.lastIndexOf("a"));
        System.out.println(texto.startsWith("Pretendia"));
        System.out.println(texto.endsWith("C#"));
        System.out.println(texto.startsWith("Pretendo"));
        System.out.println(texto.endsWith("Java"));

        System.out.println("Java".equals("java"));
        System.out.println("Java".equalsIgnoreCase("java"));

        System.out.println("Certificado".compareTo("Arnaldo")); //A vem antes do C, então devolve numero positivo
        System.out.println("Certificado".compareTo("Certificado")); //Devolve zero
        System.out.println("Certificado".compareTo("Grécia")); //G vem depois do C, então devolve numero negativo
        System.out.println("Certificado".compareTo("certificado")); //letra maiúscula vem antes da minúscula, então retorna numero positivo
        System.out.println("Certificado".compareToIgnoreCase("certificado")); //retorna zero

        String java = "Java";
        System.out.println(java.substring(1));

        String parseado = "    Quero tirar um certificado oficial de Java!!!     ".toUpperCase().trim();
        System.out.println(parseado);

        String s = "caelum";
        s = s.toUpperCase();
        System.out.println(s);

        System.out.println(s.charAt(0));
        System.out.println(s.charAt(3));
        System.out.println(s.length());
        System.out.println(s.isEmpty());
        System.out.println(" ".isEmpty());
        System.out.println("".isEmpty());

        System.out.println("        sonia     ".trim());
        System.out.println("        s o n i a     ".trim());
        System.out.println(s.replace('A', 'E'));
        System.out.println(s.replace("CAE", "AHA"));

        String nomeDireta = "Java";
        String nomeIndireto = new String("Java");
        char[] nome =  new char[]{'J', 'a', 'v', 'a'};
        String nomePorChar = new String(nome);

        StringBuilder sb1 =  new StringBuilder("Java");
        String nome2 = new String(sb1);

        String nomeNulo = null;
        String nomeDaProva = "certificação" + " " + "Java";
        String nomeDaProvaComNulo = nomeDaProva + " " + nomeNulo;
        System.out.println(nomeDaProva);
        System.out.println(nomeDaProvaComNulo);

        System.out.println("certificação" + 1500);
        System.out.println(1500 + "certificação");
        System.out.println(15 + (0 + (0 + "certificação")));
        System.out.println(1 + (500 + "certificação"));
    }
}