import javax.swing.JOptionPane;

public class testeArrayBidimensionais {
	public static void main(String args[]) {
		float notas[][] = new float[3][2];
		int aluno = 0, nota;

		while (aluno < 3) {
			nota = 0;
			while (nota < 2) {
				System.out.println("Aluno" + (aluno + 1) + ", digite a " + (nota + 1) + "' nota:'");
				notas[aluno][nota] = Float.parseFloat(JOptionPane.showInputDialog("Informe a nota do aluno"));
				nota++;
			}
			aluno++;
		}
		System.out.println("Digite o numero do aluno de 1 - 3");
		aluno = Integer.parseInt(JOptionPane.showInputDialog("Digie o Nr. do aluno:"));
		System.out.println("Aluno: " + aluno);
		System.out.println("Nota 1: " + notas[aluno-1][0] + "Nota 2: " + notas[aluno-1][1]);
		System.out.println("Média: " + ((notas[aluno-1][0])+ notas[aluno-1][1])/2);
		
	}
}
