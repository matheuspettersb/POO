
public class Curso {
	private String sigla;
	private String nome;
	
	public Curso(String sigla, String nome) {
		super();
		this.setSigla(sigla);
		this.setNome(nome);
	}
	
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		if (sigla == null || sigla.length()!=3) {
			throw new IllegalArgumentException("Sigla inv�lida");
		}
		this.sigla = sigla.toUpperCase();
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if (nome == null || nome.isEmpty()) {
			throw new IllegalArgumentException("Nome do curso inv�lido");
		}
		this.nome = nome;
	}
}