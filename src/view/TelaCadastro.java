package view;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaCadastro extends JFrame{
	JLabel nomeLabel, tamanhoLabel, precoLabel, quantidadeLabel, codigoLabel;
	JTextField nomeField, tamanhoField, precoField, quantidadeField, codigoField;
	JButton cadastrarButton, voltarButton;
	
	public TelaCadastro() {
		
		setSize(170,310);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		getContentPane().setBackground(Color.pink);
		
		nomeLabel = new JLabel("Nome:");
		tamanhoLabel = new JLabel("Tamanho:");
		precoLabel = new JLabel("Preço:");
		quantidadeLabel = new JLabel("Quantidade:");
		codigoLabel = new JLabel("Código:");
		
		nomeField = new JTextField(10);
		tamanhoField = new JTextField(10);
		precoField = new JTextField(10);
		quantidadeField = new JTextField(10);
		codigoField = new JTextField(10);
		
		cadastrarButton = new JButton("Cadastrar");
		voltarButton = new JButton("Voltar");
		
		add(codigoLabel);
		add(codigoField);
		add(nomeLabel);
		add(nomeField);
		add(precoLabel);
		add(precoField);
		add(quantidadeLabel);
		add(quantidadeField);
		add(tamanhoLabel);
		add(tamanhoField);
		add(cadastrarButton);
		add(voltarButton);
		
		setVisible(false);
	}

	public JTextField getNomeField() {
		return nomeField;
	}

	public JTextField getTamanhoField() {
		return tamanhoField;
	}

	public JTextField getPrecoField() {
		return precoField;
	}

	public JTextField getQuantidadeField() {
		return quantidadeField;
	}

	public JTextField getCodigoField() {
		return codigoField;
	}

	public JButton getCadastrarButton() {
		return cadastrarButton;
	}

	public JButton getVoltarButton() {
		return voltarButton;
	}
	
}
