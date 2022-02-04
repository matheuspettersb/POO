
public abstract class Avaliacao {
	private String descricao;

	// construtor
	public Avaliacao(String descricao) {
		this.descricao = descricao;
	}

	// metodos
	public abstract float getNota();

	public abstract String exibir();

	// get/set
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		if (descricao == null || descricao.isEmpty()) {
			throw new IllegalArgumentException("Descrição não pode ser vazia");
		}
		this.descricao = descricao;
	}
}