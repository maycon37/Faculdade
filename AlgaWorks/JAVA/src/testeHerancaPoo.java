
public class testeHerancaPoo {
	private String nome;
	private float velocidade;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setVelocidade(float velocidade) {
		this.velocidade = velocidade;
	}
	public void acelera() {
		if (velocidade<=10) {
			velocidade++;
		}
	}
	public void frea() {
		if (velocidade > 0)
			velocidade--;
			}
}
