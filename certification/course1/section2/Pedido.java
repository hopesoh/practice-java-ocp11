package section2;

import section3.*;
import section4.modelo.*;
import section4.dao.*;
import static section2.Util.TAMANHO;
/* NÃO COMPILA
import java.util.Date;
import java.sql.Date;
*/
import java.util.*;
import java.sql.Date; //especifico o import

public class Pedido {
	Quadrado quadrado;
	ProdutoDao dao;

	Pessoa cliente;
	Endereco endereco;
	//Date dataDeCriação = new java.util.Date(); NÃO COMPILA
	java.util.Date dataDeCriação;

	public Pessoa getCliente() {
		return cliente;
	}

	public void calculaTudo() {
		int t = TAMANHO;
		Util.maior(3,10);
	}
}