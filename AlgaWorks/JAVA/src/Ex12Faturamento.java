import java.util.Scanner;

public class Ex12Faturamento {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Informe a meta de faturamento anual: ");
		Double metaFaturamentoAno = scanner.nextDouble();

		System.out.println("Informe o faturamento real da empresa no ano: ");
		Double faturamentoRealAno = scanner.nextDouble();

		System.out.println("Informe o média salarial do funcionario(a): ");
		Double mediaSalarioColaborador = scanner.nextDouble();
		
		
		Double mediaSalarioSemMeta = mediaSalarioColaborador*0.8;
		

		if (faturamentoRealAno >= metaFaturamentoAno) {System.out.println(
					"Parabens! a meta foi batida e os funcionarios recebem o "
					+ "bônus de 100% R$" + mediaSalarioColaborador);
		}
		else	{System.out.println("A meta não foi batida e os funcionarios recebem o "
						+ "bônus de R$" + mediaSalarioSemMeta);
			}
		
		scanner.close();
		}

	}
