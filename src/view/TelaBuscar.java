package view;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaBuscar extends JFrame{
	JLabel codigoLabel;
	JTextField codigoField;
	JButton buscarButton, voltarButton;
	
	public TelaBuscar() {
		
		setSize(180,125);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		getContentPane().setBackground(Color.pink);
	
		codigoLabel = new JLabel("Código:");
		
		
		codigoField = new JTextField(10);
		
		buscarButton = new JButton("Buscar");
		voltarButton = new JButton("Voltar");
		
		add(codigoLabel);
		add(codigoField);
		add(buscarButton);
		add(voltarButton);
		
		setVisible(false);
	}

	public JTextField getCodigoField() {
		return codigoField;
	}

	public JButton getBuscarButton() {
		return buscarButton;
	}

	public JButton getVoltarButton() {
		return voltarButton;
	}
	
}
