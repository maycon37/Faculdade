import java.util.Scanner;

public class Ex01CalculoDeMassaCorporal {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // Calculadora de IMC = Peso ÷ (Altura × Altura)
		
		System.out.println("CÁLCULO DO ÍNDICE DE MASSA CORPORAL");
		
		System.out.println("Digite o seu peso (em Kg): "); // Informação de valor de Peso.
		Double valorPeso = scanner.nextDouble();
		
		System.out.println("Digite o valor de sua altura (em metros): "); // Informação de valor de altura.
		Double valorAltura = scanner.nextDouble();
		
		Double resultado = valorPeso / (valorAltura * valorAltura);  // formula de calculo de troco
		
		System.out.println("O seu IMC é " + resultado);
		
		scanner.close();  // Encerramento do programa 
	}
}
