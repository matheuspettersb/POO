// MATHEUS PETTERS BEVILAQUA E GABRIEL RUPP K LOPES

public class Aereo extends PacoteTuristico {
	private float valorAereo;
	private float valorTerrestre;

	// construtor
	public Aereo(String descricao, String identificacao, float valorAereo, float valorTerrestre) {
		super(descricao, identificacao);
		this.valorAereo = valorAereo;
		this.valorTerrestre = valorTerrestre;
	}

	// métodos

	public float getValorTotalReais() {
		return ((this.getValorAereo() + this.getValorTerrestre()) * PacoteTuristico.getValorDolar());
	}

	public String toString() {
		return "Pacote aéreo " +this.getDescricao()+ " ("+this.getIdentificacao()+") pelo valor de R$ "+this.getValorTotalReais();
	}

	// get/set
	public float getValorAereo() {
		return valorAereo;
	}

	public void setValorAereo(float valorAereo) {
		if (valorAereo < 0) {
			throw new IllegalArgumentException("O valor precisa ser maior que 0");
		}
		this.valorAereo = valorAereo;
	}

	public float getValorTerrestre() {
		return valorTerrestre;
	}

	public void setValorTerrestre(float valorTerrestre) {
		if (valorTerrestre < 0) {
			throw new IllegalArgumentException("O valor terrestre precisa ser maior que 0");
		}
		this.valorTerrestre = valorTerrestre;
	}

}
