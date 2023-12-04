import java.util.Scanner;

public class Ex13Switch {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe o dia da semana ");
		Integer Diasemana = scanner.nextInt();
		
		String semana = null;
	
		switch (Diasemana) {
			case 1: semana = "Domingo";
			break;
			case 2: semana = "Segunda-feira";
			break;
			case 3: semana = "Terça-feira";
			break;
			case 4: semana = "Quarta-feira";
			break;
			case 5: semana = "Quinta-feira";
			break;
			case 6: semana = "Sexta-feira";
			break;
			case 7: semana = "Sábado";
			break;
			default:System.out.println("Dia inválido");
		}
		System.out.println("O dia da semana é "+semana);
	scanner.close();
	}
}
