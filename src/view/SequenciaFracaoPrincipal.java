package view;

import javax.swing.JOptionPane;

import controller.SequenciaFracaoController;

public class SequenciaFracaoPrincipal {
	public static void main (String[] args) {
		SequenciaFracaoController seqCon = new SequenciaFracaoController();
		int num = 13 ;
		//Limitar a 12, para não quebrar o Fatorial.
		
		while (num > 12 || num < 0) {
			num = Integer.parseInt(JOptionPane.showInputDialog("Insira um número (1 a 12): "));
			if (num > 12 || num < 0) {
				JOptionPane.showMessageDialog(null, "Número inválido, tente novamente.");
			}
		}
		
		
		System.out.println("O resultado da sequência com esse número é: " + seqCon.sequenciaFracao(num));
	}
}
