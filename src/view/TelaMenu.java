package view;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TelaMenu extends JFrame{
	JButton cadastrarProdutoButton, removerProdutoButton, buscarProdutoButton, alterarProdutoButton, sairButton;
	
	public TelaMenu() {
		super("Loja da Mari");
		
		setSize(300,180);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());
		getContentPane().setBackground(Color.pink);
		
		cadastrarProdutoButton = new JButton("Cadastrar Produto");
		removerProdutoButton = new JButton("Remover Produto");
		buscarProdutoButton = new JButton("Buscar Produto");
		alterarProdutoButton = new JButton("Alterar Produto");
		sairButton = new JButton("Sair");
		
		
		add(cadastrarProdutoButton);
		add(removerProdutoButton);
		add(buscarProdutoButton);
		add(alterarProdutoButton);
		add(sairButton);
		
		setVisible(true);
		
	}

	public JButton getCadastrarProdutoButton() {
		return cadastrarProdutoButton;
	}

	public void setCadastrarProdutoButton(JButton cadastrarProdutoButton) {
		this.cadastrarProdutoButton = cadastrarProdutoButton;
	}

	public JButton getRemoverProdutoButton() {
		return removerProdutoButton;
	}

	public void setRemoverProdutoButton(JButton removerProdutoButton) {
		this.removerProdutoButton = removerProdutoButton;
	}

	public JButton getBuscarProdutoButton() {
		return buscarProdutoButton;
	}

	public void setBuscarProdutoButton(JButton buscarProdutoButton) {
		this.buscarProdutoButton = buscarProdutoButton;
	}

	public JButton getAlterarProdutoButton() {
		return alterarProdutoButton;
	}

	public void setAlterarProdutoButton(JButton alterarProdutoButton) {
		this.alterarProdutoButton = alterarProdutoButton;
	}

	public JButton getSairButton() {
		return sairButton;
	}

	public void setSairButton(JButton sairButton) {
		this.sairButton = sairButton;
	}
	
}
