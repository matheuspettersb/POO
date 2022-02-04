// MATHEUS PETTERS BEVILAQUA E GABRIEL RUPP K LOPES

public class Opcional {
	private String descricao;
	private float valor;

	// construtor
	public Opcional(String descricao, float valor) {
		super();
		this.descricao = descricao;
		this.valor = valor;
	}

	// get/set
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		if (descricao == null || descricao.isEmpty()) {
			throw new IllegalArgumentException("Descri��o vazia");
		}
		this.descricao = descricao;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		if (valor < 0) {
			throw new IllegalArgumentException("valor n�o pode ser menor que 0");
		}
		this.valor = valor;
	}

}
