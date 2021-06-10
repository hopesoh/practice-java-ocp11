import java.util.*;

class Conta {
    int id;
    void liga() {}
}

class ContaJuridica extends Conta {
    String cnpj;
    void fecha() {}
}

class ContaFisica extends Conta {

}

class TestaTipoDeReferenciaEObjeto {
    public static void main(String[] args) {
        Conta c = new ContaJuridica();
        c.liga();
//        c.fecha();
        c.id = 15;
//        c.cnpj = "5000";

        (new ContaJuridica().id) = 15;
        (new ContaJuridica().cnpj) = "15";
//        ContaJuridica c = d;

        List lista = new ArrayList();
    }
}

