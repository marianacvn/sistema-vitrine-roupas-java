package model;

import java.util.ArrayList;

import view.Mensagem;

public class BaseDados {
	private static ArrayList<Produto> produtos = new ArrayList<>();

	
	public static void addProduto(Produto produto) throws ExceptionExistente, ExceptionNull{
		if(produto.getNome().equals("") || produto.getCodigo() == 0 || produto.getPreco() == 0 || produto.getQuantidade() == 0 || produto.getTamanho().equals("")) {
			throw new ExceptionNull("Todos os campos precisam ser preenchidos!");
		}
		for (Produto p : produtos) {
			if(p.getCodigo() == produto.getCodigo()) {
				throw new ExceptionExistente();
			}
		}
		produtos.add(produto);
		Mensagem.produtoCadastrado();
	}
	
	
	public static void removerProduto(Produto produto) throws ExceptionNull {
		for (Produto p : produtos) {
			if(p.getCodigo() == produto.getCodigo()) {
				produtos.remove(p);
			}
		}
		throw new ExceptionNull("Produto não existe, então não pode ser removido!");
		
	}
	
	public static Produto buscarProduto(String nome) throws ExceptionNull {
		for (Produto p : produtos) {
			if(p.getNome().equalsIgnoreCase(nome)) {
				return p;
			}
		}
		throw new ExceptionNull("Produto não encontrado!");
		
	}
	
	public static void alterarProduto(int codigo, String nome, double preco, String tamanho, int quantidade) throws ExceptionNull{
		for (Produto p : produtos) {
			if(p.getCodigo() == codigo ) {
				p.setNome(nome);
				p.setPreco(preco);
				p.setQuantidade(quantidade);
				p.setTamanho(tamanho);
			}
		}
		throw new ExceptionNull("Produto não existe!");
	}
	
	public static boolean IsProduto(Produto produto) {
		try {
			buscarProduto(produto.getNome());
			return true;
		} catch (ExceptionNull e) {
			return false;
		}
			
	}
}
