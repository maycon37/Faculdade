import java.util.Scanner;

public class Ex2CalculoTrocoCliente {
	// Calculadora de troco
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // Inicio do programa
		
		System.out.print("Digite o valor do Produto: "); // Informação de valor de produto 
		Double valorProduto = scanner.nextDouble();
		
		System.out.print("Digite o valor informado pelo cliente: "); // Informação de valor recebido do cliente
		Double valorInformadoCliente = scanner.nextDouble();
		
		Double resultado = valorInformadoCliente - valorProduto; // formula de calculo de troco
		
		System.out.println("O seu troco é: " + resultado);
		scanner.close();  // Encerramento do programa 
	}
	
}
