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
		if (descricao == null || descricao.isEmpty()) {  //excessão pra n fazer c descrição vaiza
			throw new IllegalArgumentException("Descrição da avaliação é necessária");
		}
		this.descricao = descricao;
	}
	
	
	
	
}
