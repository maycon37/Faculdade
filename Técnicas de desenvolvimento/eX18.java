import javax.swing.JOptionPane;

public class eX18 {
public static void main(String[] args) {

	/* Algoritmo Soma de um Intervalo
	 inteiro inicio, fim, soma, i */
	int inicio, fim, soma, i;
	// caracter continua
	char continua;
	
	// faça
	do {
		// escreva(“Início do intervalo”)
	inicio=Integer.parseInt(JOptionPane.showInputDialog(null,"Inicio do intervalo"));	
		// escreva(“Fim do intervalo”)
	fim=Integer.parseInt(JOptionPane.showInputDialog(null,"Fim do intervalo"));
	soma=0;
		for (i=inicio; i<=fim; i++) {
			soma = soma + i;
		}
	JOptionPane.showMessageDialog(null, "A soma deu " + soma);
	continua = JOptionPane.showInputDialog(null,"Quer continuar (S/N)? ").charAt(0);
	} 
	while(continua=='s' || continua == 'S');	
	}
}
