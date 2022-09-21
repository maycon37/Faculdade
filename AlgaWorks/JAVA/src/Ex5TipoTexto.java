import java.util.Scanner;

public class Ex5TipoTexto {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o seu nome ");
		String nome = scanner.nextLine();
		
		System.out.println("Digite o seu Sobrenome ");
		String sobreNome = scanner.nextLine();
		
		System.out.println("Olá " + nome +" "+ sobreNome +"!");
		
		scanner.close();
	}
}
