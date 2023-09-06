

import javax.swing.JOptionPane;

public class eX16 {

	public static void main(String[] args) {
	
		// Algoritmo media_com_enquanto
		// real media, soma
		// inteiro num, qtde
		double media,soma;
		int num,qtde;
		// caracter resp
		char resp;
		soma = 0;
		qtde = 0;
		resp = 's';
		
		while (resp=='s' || resp == 'S') {
		// leia(num)
		num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
		soma+=num;
		qtde++;
		// escreva(“Deseja continuar?”)
		// leia(resp)
		resp = JOptionPane.showInputDialog("Deseja continuar? ").charAt(0);
		// fim enquanto
		}
		// media=soma/qtde
		media=soma/qtde;
		// escreva(“A média dos números digitados é: “ + media)
		JOptionPane.showMessageDialog(null,"A média dos números digitados é: "+media);		
	}
}