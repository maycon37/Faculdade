import java.util.Scanner;

public class EstruturaIfEncadeado {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o peso do lutador(a); ");
		Double peso = scanner.nextDouble();
		
		Boolean pesoLeve = (peso > 0)&&(peso <= 60);
		Boolean pesoMedio = (peso > 60)&&(peso <= 0);
		Boolean pesoPesado = peso >90;
		
		if (pesoLeve) {
			System.out.println("O lutador(a) é peso leve.");
		} else if (pesoMedio) {
			System.out.println("O lutador(a) é peso médio.");
		} else if (pesoPesado) {
			System.out.println("O lutador(a) é peso pesado.");
		} else {
			System.out.println("O lutador não se encaixa em categoria alguma.");
		}
		
		scanner.close();
	}
}
