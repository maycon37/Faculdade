
public class EstruturaIf {
	public static void main(String[] args) {
		
		Double emprestimo = 4000.0;
		Double MovimentaMedia = 2000.0;
		
		Boolean movimentoPeloMenosMetadeValor = (MovimentaMedia*2) >= emprestimo;
		Boolean aContaTemTempoSuficienteAbertura = true;
		Boolean NomeLimpo = true;

		Boolean LiberarEmprestimo = movimentoPeloMenosMetadeValor && aContaTemTempoSuficienteAbertura 
				&& NomeLimpo;
		
		if (LiberarEmprestimo) {
			System.out.println("Sim, pode liberar empréstimo.");}
		else {
			System.out.println("Não, empréstimo negado!");}
	}
}
