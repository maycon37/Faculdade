
import javax.swing.JOptionPane;

public class eX17 {
	public static void main(String[] args) {
		/* Algoritmo soma_dos_pares_com 'Do While'
		inteiro num, soma
		Inicio
		soma=0
		faça
		escreva(“Digite um número”)
		leia(num)
		se(num%2!=0)
		soma=soma+num
		fim se
		enquanto(num!=0)
		escreva(“A soma dos números ímpares é: “ + soma)
		Fim */
		int num,soma=0;
		
		do {
			num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número"));
		if (num %2!=0) {
			soma=soma+num;
		}}
		while (num!=0);
			JOptionPane.showMessageDialog(null,"A soma dos números ímpares é: "+soma);
			
}
}
