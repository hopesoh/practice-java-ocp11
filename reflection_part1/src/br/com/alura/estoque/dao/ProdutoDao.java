package br.com.alura.estoque.dao;

import java.util.List;

import br.com.alura.estoque.modelo.Produto;

public interface ProdutoDao {
	public List<Produto> lista();
	public Produto getProduto(Integer id);
}
