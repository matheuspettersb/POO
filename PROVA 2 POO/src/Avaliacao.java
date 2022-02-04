// Matheus Petters Bevilaqua e Gabriel Rupp Kosilek Lopes
public abstract class Avaliacao {
	private String descricao;
	
	//construtor
	public Avaliacao(String desc) {
		this.setDescricao(desc);
	}
	
	abstract float getNota();
	abstract String exibir();

	//get/set
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		if (descricao == null || descricao.isEmpty()) {  //excess�o pra n fazer c descri��o vaiza
			throw new IllegalArgumentException("Descri��o da avalia��o � necess�ria");
		}
		this.descricao = descricao;
	}
	
	
	
	
}
