
public class Prova extends Avaliacao {
	private float nota;

	// construtor
	public Prova(String descricao, float nota) {
		super(descricao);
		this.nota = nota;
	}

	// metodos
	public String exibir() {
		String exibicao = this.getDescricao() + " (" + this.getNota() + ")";
		return exibicao;
	}

	// get/set
	public float getNota() {
		return nota;
	}

	public void setNota(float nota) {
		if (nota < 0 || nota > 10) {
			throw new IllegalArgumentException("Nota precisa ser um valor entre 0 e 10");
		}
		this.nota = nota;
	}

}
