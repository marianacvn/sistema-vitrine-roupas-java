package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.BaseDados;
import model.ExceptionExistente;
import model.ExceptionNull;
import model.Produto;
import view.TelaAlterar;
import view.TelaBuscar;
import view.TelaCadastro;
import view.TelaMenu;
import view.TelaRemover;

public class Controle implements ActionListener {
	TelaMenu menu;
	TelaCadastro cadastro;
	TelaAlterar alterar;
	TelaBuscar busca;
	TelaRemover remove;
	

	
	public Controle() {
		 menu = new TelaMenu();
		 cadastro = new TelaCadastro();
		 alterar = new TelaAlterar();
		 busca = new TelaBuscar();
		 remove = new TelaRemover();
		 
		 
		 menu.getCadastrarProdutoButton().addActionListener(this);
		 menu.getAlterarProdutoButton().addActionListener(this);
		 menu.getBuscarProdutoButton().addActionListener(this);
		 menu.getRemoverProdutoButton().addActionListener(this);
		 menu.getSairButton().addActionListener(this);
		 cadastro.getCadastrarButton().addActionListener(this);
		 cadastro.getVoltarButton().addActionListener(this);
		 remove.getRemoverButton().addActionListener(this);
		 remove.getVoltarButton().addActionListener(this);
		 busca.getBuscarButton().addActionListener(this);
		 busca.getVoltarButton().addActionListener(this);
		 alterar.getBuscarButton().addActionListener(this);
		 alterar.getAlterarButton().addActionListener(this);
		 alterar.getVoltarButton().addActionListener(this);
		 
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == menu.getCadastrarProdutoButton()) {
			menu.setVisible(false);
			cadastro.setVisible(true);
			
		}
		if(e.getSource() == menu.getRemoverProdutoButton()) {
			menu.setVisible(false);
			remove.setVisible(true);
		}
		if(e.getSource() == menu.getBuscarProdutoButton()) {
			menu.setVisible(false);
			busca.setVisible(true);
		}
		if(e.getSource() == menu.getAlterarProdutoButton()) {
			menu.setVisible(false);
			alterar.setVisible(true);
		}
		if(e.getSource() == menu.getSairButton()) {
			System.exit(0);
		}
		
		if(e.getSource() == cadastro.getVoltarButton()) {
			menu.setVisible(true);
			cadastro.setVisible(false);
		}
		
		if(e.getSource() == remove.getVoltarButton()) {
			menu.setVisible(true);
			remove.setVisible(false);
		}
		
		if(e.getSource() == busca.getVoltarButton()) {
			menu.setVisible(true);
			busca.setVisible(false);
		}
		
		if(e.getSource() == alterar.getVoltarButton()) {
			menu.setVisible(true);
			alterar.setVisible(false);
		}
		
		if(e.getSource() == cadastro.getCadastrarButton()) {
			String nome = cadastro.getNomeField().getText();
			String tamanho = cadastro.getTamanhoField().getText();
			
			int codigo = 0;
			int quantidade = 0;
			double preco = 0;
			if (!cadastro.getCodigoField().getText().equals("")) {
				codigo = Integer.parseInt(cadastro.getCodigoField().getText());
			}
			if (!cadastro.getQuantidadeField().getText().equals("")) {
				quantidade = Integer.parseInt(cadastro.getQuantidadeField().getText());
			}
			if (!cadastro.getPrecoField().getText().equals("")) {
				preco = Double.parseDouble(cadastro.getPrecoField().getText());
			}
			
			
			Produto produto = new Produto(codigo, nome, tamanho, preco, quantidade);
			
			try {
				BaseDados.addProduto(produto);
			} catch (ExceptionExistente e1) {
			} catch (ExceptionNull e1) {}
			
		}
		
		if(e.getSource() == remove.getRemoverButton()) {
			int codigo = 0;
			
			if(!remove.getCodigoField().getText().equals("")) {
				codigo = Integer.parseInt(remove.getCodigoField().getText());
			}
			
			Produto produto = new Produto(codigo, "", "", 0, 0);
			
			try {
				BaseDados.removerProduto(produto);
			} catch (ExceptionNull e1) {
				
			}
		}
	}
}
