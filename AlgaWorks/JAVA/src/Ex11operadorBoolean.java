import java.util.Scanner;

public class Ex11operadorBoolean {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Boolean tresMaiorqueDois = 3 > 2;	
		System.out.println("O resultado da condição Boolean de 3 > 2 é: "+tresMaiorqueDois);
		
		Boolean tresMaiorqueQuatro = 3 > 4;	
		System.out.println("Resultado da condição Boolean de 3> 4 é: "+tresMaiorqueQuatro);
		
		//Crie um programa que receba o valor de um produto e exiba o valor final da compra. 
		//Esse valor final será o valor do produto mais o valor do frete - use o valor do frete como R$15,00. 
		//Uma compra de, por exemplo, R$80,00, teria um valor final de R$95,00.
		//Agora, caso a compra seja maior ou igual a R$100,00, então não cobre o frete.
		
		
		Integer valorDeFrete = 15;
		
		System.out.print("Informe o valor total da compra: \n");
		Integer valorCompra = scanner.nextInt();
		
		boolean calculoFrete = valorCompra >= 100;
		
		if (calculoFrete) {
			System.out.print("O valor de sua compra é "+valorCompra);
		} else {
			System.out.print("O valor de sua compra é "+(valorCompra+valorDeFrete));
		}
		scanner.close();
	
		
		
		
		
		
	}
}
