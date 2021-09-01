package view;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaRemover extends JFrame{
	JLabel codigoLabel;
	JTextField codigoField;
	JButton removerButton, voltarButton;
	
	public TelaRemover() {
		
		setSize(300,100);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		getContentPane().setBackground(Color.pink);
	
		codigoLabel = new JLabel("Código:");
		
		
		codigoField = new JTextField(10);
		
		removerButton = new JButton("Remover");
		voltarButton = new JButton("Voltar");
		
		add(codigoLabel);
		add(codigoField);
		add(removerButton);
		add(voltarButton);
		
		setVisible(false);
	}

	public JTextField getCodigoField() {
		return codigoField;
	}

	public JButton getRemoverButton() {
		return removerButton;
	}

	public JButton getVoltarButton() {
		return voltarButton;
	}
	
}
