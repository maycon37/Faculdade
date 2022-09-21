import java.util.Scanner;

public class Ex9sistemaDeProdutos {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Olá , informe o valor dos produtos: ");
		Double valorProduto = scanner.nextDouble();

		System.out.print("Digite a quantidade total de produtos: ");
		Double quantidadeProduto = scanner.nextDouble();

		Double desconto = valorProduto*quantidadeProduto/10;
		
		Double resultadoDesconto = valorProduto * quantidadeProduto - desconto;

		boolean calculoDesconto = quantidadeProduto >= 10;
		if (calculoDesconto) {
			System.out.println("O valor total com desconto de 10% é: "+resultadoDesconto);
		} else {
			System.out.println("O valor total é: " + valorProduto * quantidadeProduto);
		}
		scanner.close();
	}
}
