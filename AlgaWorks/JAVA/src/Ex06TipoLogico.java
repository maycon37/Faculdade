
public class Ex06TipoLogico {
	public static void main(String[] args) {

		Boolean variavelVerdadeiro = true;
		System.out.println("Variável verdadeira: " + variavelVerdadeiro);

		Boolean variavelFalsa = false;
		System.out.println("Variável falsa: " + variavelFalsa);

		System.out.println("------------------------------------------");

		Integer idade = 20;

		Boolean podeTirarCarteira = idade >= 18;

		System.out.println("Pode tirar carteira? " + podeTirarCarteira);

		if (podeTirarCarteira) {
			System.out.println("Sim! pode tirar carteira.");
		} else {
			System.out.println("Não pode tirar carteira!");
		}

	}

}
