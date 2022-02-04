
public class Alternativa {
	private String descricao;
	private boolean estado;

	public Alternativa(String descricao, boolean estado) {
		this.setDescricao(descricao);
		this.setEstado(estado);
	}
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
}
