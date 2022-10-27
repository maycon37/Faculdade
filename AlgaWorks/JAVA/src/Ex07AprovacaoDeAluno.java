import java.util.Scanner;

public class Ex07AprovacaoDeAluno {
	public static void main(String[] args) {

		Boolean variavelVerdadeiro = true;
		System.out.println("Variável verdadeira: " + variavelVerdadeiro);

		Boolean variavelFalsa = false;
		System.out.println("Variável falsa: " + variavelFalsa);
		System.out.println("------------------------------------------");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Olá, digite o nome do Aluno: ");
		
		String nome = scanner.nextLine();

		System.out.println("Informa a nota do Aluno: ");
		
		Integer nota = scanner.nextInt();
		
		Boolean notaAluno = nota >= 70;
		
		if (notaAluno) {
			System.out.println("O aluno " + nome + " foi aprovado com a nota: "+nota+", Parabéns!");
		} else {
			System.out.println("O aluno não foi aprovado!");
			
		}
		scanner.close();
		
	}

}
