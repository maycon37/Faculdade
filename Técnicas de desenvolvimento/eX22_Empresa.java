import java.util.Scanner;

public class eX22_Empresa {
	public static void main(String[] args) {
		/*
		 * Algoritmo Empresa
		 * real sal[10], soma=0, media, maior
		 * inteiro i,quant = 0
		 * início
		 */
		float sal[] = new float[10];
		float soma = 0, media, maior;
		int i, quant = 0;
		Scanner leia = new Scanner(System.in);

		// Preenchimento do vetor
		// para (i=0; i<10 ; i++)
		for (i = 0; i < 10; i++) {
			// escreva (“Digite o salário do trabalhador ” + (i+1) + “:”)
			System.out.println("Digite o salário do trabalhador " + (i + 1) + ":");
			// leia sal[i]
			// fim para
			sal[i] = leia.nextFloat();
		}

		// Somando valores armazenados no vetor
		// para (i=0; i<10 ; i++)
		for (i = 0; i < 10; i++) {
			// soma += sal[i]
			soma += sal[i];
			// fim para
		}
		// Cálculo da média
		media = soma / 10;
		// escreva (“A média dos salários é R$” + media)
		System.out.println("A média dos salários é R$ " + media);

		// Encontrando o maior valor
		maior = sal[0];
		for (i = 0; i < 10; i++) {
			if (sal[i] > maior)
				maior = sal[i];
			// fim se
		}
		// fim para

		System.out.println("O maior salário é R$" + maior);
		// Quantidade de salários menores que R$850,00

		for (i = 0; i < 10; i++) {
			if (sal[i] < 850) {
				quant++;
			}
			// fim para
		}
		System.out.println("Quant. de salários < R$850: " + quant);
		// fim se
	}
}
