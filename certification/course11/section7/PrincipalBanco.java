public class PrincipalBanco {

    public static void main(String[] args) {

        GerenciadorDeTransacao tx = new GerenciadorDeTransacao();
        PoolDeConexao pool = new PoolDeConexao();

        new Thread(new TarefaAcessaBanco(pool, tx)).start();
        new Thread(new TarefaAcessaBancoProcedimento(pool, tx)).start();

    }
}