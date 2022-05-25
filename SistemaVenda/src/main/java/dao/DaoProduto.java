package dao;

import java.util.List;
import diminio.Produto;

public class DaoProduto {

	public void salvar(Produto produto) {
		
		DaoProduto daoProduto = new DaoProduto();
		daoProduto.salvar(produto);
	}
	
	public void excluir(Integer id) {
		DaoProduto daoProduto = new DaoProduto();
		daoProduto.excluir(id);
	}
	
	public List<Produto> listar(String nome) {
		DaoProduto daoProduto = new DaoProduto();
		return daoProduto.listar(nome);

	}
}
