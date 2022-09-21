import java.util.Scanner;

public class Ex3CalculadoraAoQuadrado {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Ola! Digite o número ao qual deseja calcular: ");
		Integer numeroQuadrado = scanner.nextInt();

		Integer resultado = numeroQuadrado * numeroQuadrado;

		System.out.print("O valor Quadrado de "+ numeroQuadrado + " é : " + resultado);
		
		scanner.close();

	}
}
