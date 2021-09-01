package model;

public class Produto {
	private int codigo;
	private String nome;
	private String tamanho;
	private double preco;
	private int quantidade;
	
	public Produto(int codigo, String nome, String tamanho, double preco, int quantidade) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.tamanho = tamanho;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	
	

}
