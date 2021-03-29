public class TesteArray2 {
    public static void main(String[] args) {
        Cliente[] clientes = new Cliente[10];
//        System.out.println(clientes[0]);
//        System.out.println(clientes[0].nome); //NPE

        for (int i = 0; i < clientes.length; i++) {
            clientes[i] = new Cliente();
            clientes[i].nome = "Sonia";
        }

        for (Cliente cliente : clientes) System.out.println(cliente.nome);

        Cliente novosClientes[] = new Cliente[5];
        novosClientes[0] = new Cliente();
        novosClientes[1] = new ClienteEspecial();

        Cliente guilherme = new Cliente();
        guilherme.nome = "Guilherme";

        novosClientes[0] = guilherme;
        System.out.println(guilherme.nome);
        System.out.println(novosClientes[0].nome);

        guilherme.nome = "Silveira";
        System.out.println(guilherme.nome);
        System.out.println(novosClientes[0].nome);

        String[] nomes = {"Mario", "Silveira"};
        Object[] objetos;

        objetos = nomes;
        for (Object objeto : objetos) System.out.println(objeto);

    }
}

class Cliente {
    String nome;
}

class ClienteEspecial extends Cliente {

}