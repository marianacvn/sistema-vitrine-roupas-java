package view;

import javax.swing.JOptionPane;

public class Mensagem {
	
	public static void mensagemNull(String mensagem) {
		JOptionPane.showConfirmDialog(null, mensagem, "", 0);
	}
	
	public static void mensagemExistente() {
		JOptionPane.showConfirmDialog(null, "Produto já existente!", "", 0);
	}

	
	public static void produtoCadastrado() {
		JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso!");
	}
}

