class Carro {
    String modelo;
    String ano;

    Carro() {
        ano = "2014"; //posso retirar o this pois não existe outra variável com este nome aqui dentro
    }

    void reseta() {
        ano = "2014";
    }

    public String getDadosDeImpressao() {
        return modelo + "::" + ano;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo; //aqui o this. é necessário
    }
}