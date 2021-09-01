package view;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaAlterar extends JFrame{
	JLabel nomeLabel, tamanhoLabel, precoLabel, quantidadeLabel, codigoLabel;
	JTextField nomeField, tamanhoField, precoField, quantidadeField, codigoField;
	JButton alterarButton, buscarButton, voltarButton;
	
	public TelaAlterar() {
		
		setSize(300,500);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		getContentPane().setBackground(Color.pink);
		
		nomeLabel = new JLabel("Nome:");
		nomeLabel.setVisible(false);
		tamanhoLabel = new JLabel("Tamanho:");
		tamanhoLabel.setVisible(false);
		precoLabel = new JLabel("Preço:");
		precoLabel.setVisible(false);
		quantidadeLabel = new JLabel("Quantidade:");
		quantidadeLabel.setVisible(false);
		codigoLabel = new JLabel("Código:");
		
		nomeField = new JTextField(10);
		nomeField.setVisible(false);
		tamanhoField = new JTextField(10);
		tamanhoField.setVisible(false);
		precoField = new JTextField(10);
		precoField.setVisible(false);
		quantidadeField = new JTextField(10);
		quantidadeField.setVisible(false);
		codigoField = new JTextField(10);
		
		
		alterarButton = new JButton("Alterar");
		alterarButton.setVisible(false);
		buscarButton = new JButton("Buscar");
		voltarButton = new JButton("Voltar");
		
		add(codigoLabel);
		add(codigoField);
		add(buscarButton);
		add(nomeLabel);
		add(nomeField);
		add(precoLabel);
		add(precoField);
		add(quantidadeLabel);
		add(quantidadeField);
		add(tamanhoLabel);
		add(tamanhoField);
		add(alterarButton);
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

	public JButton getAlterarButton() {
		return alterarButton;
	}

	public JButton getBuscarButton() {
		return buscarButton;
	}

	public JButton getVoltarButton() {
		return voltarButton;
	}

}
