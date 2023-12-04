import java.util.Scanner;

public class switchCase {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite um mês: ");
		Integer mes = scanner.nextInt();

		Double desconto = 0.0;

		switch (mes) {
		case 1:
			desconto = 0.0;
			break;
		case 2:
			desconto = 20.0;
			break;
		case 3:
			desconto = 30.0;
			break;
		case 4:
			desconto = 10.0;
			break;
		case 5:
			desconto = 10.0;
			break;
		case 6:
			desconto = 0.0;
			break;
		case 7:
			desconto = 0.0;
			break;
		case 8:
			desconto = 10.0;
			break;
		case 9:
			desconto = 0.0;
			break;
		case 10:
			desconto = 10.0;
			break;
		case 11:
			desconto = 0.0;
			break;
		case 12:
			desconto = 0.0;
			break;
			
		default: System.out.println("Digite um mês valido: ");
		System.exit(1);	
	}
		System.out.println("Seu desconto será de " + desconto + "%");
		scanner.close();
			
		}
		
	}		

