// MATHEUS PETTERS BEVILAQUA E GABRIEL RUPP K LOPES

public abstract class PacoteTuristico {
	private String descricao;
	private String identificacao;
	private static float valorDolar = 5.2f;

	// construtor

	public PacoteTuristico(String descricao, String identificacao) {
		this.descricao = descricao;
		this.identificacao = identificacao;
	}
	
	// métodos
	public abstract float getValorTotalReais();

	// get/set
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		if (descricao == null || descricao.isEmpty()) {
			throw new IllegalArgumentException("Descrição vazia");
		}
		this.descricao = descricao;
	}

	public String getIdentificacao() {
		return identificacao;
	}

	public void setIdentificacao(String identificacao) {
		if (identificacao == null || identificacao.isEmpty()) {
			throw new IllegalArgumentException("identificacao vazia");
		}
		this.identificacao = identificacao;
	}

	public static float getValorDolar() {
		return valorDolar;
	}

	public static void setValorDolar(float valorDolar) {
		if (valorDolar < 0 || valorDolar > 10) {
			throw new IllegalArgumentException("Valor inválido");
		}
	}

}
