package dao;

import java.util.List;
import diminio.Produto;

public class DaoProduto {

	public void salvar(Produto produto) {
		System.out.println("Salvando produto");
	}
	
	public void excluir(Integer id) {
		System.out.println("Excluindo produto");
	}
	
	public List<Produto> listar(String nome) {
		System.out.println("Listando produtos");
		return null;
	}
}
