import java.util.ArrayList;

public class Aluno {
	private String nome;
	private ArrayList<Avaliacao> avaliacoes;

	// construtor
	public Aluno(String nome, ArrayList<Avaliacao> avaliacoes) {
		this.nome = nome;
		this.avaliacoes = avaliacoes;
	}

	// metodos
	public void addAvaliacao(Avaliacao a) {
		if (a == null) {
			throw new IllegalArgumentException("Precisa ter avalia��o");
		}
		this.avaliacoes.add(a);
	}

	public float getMedia() {
		if (avaliacoes == null || avaliacoes.isEmpty()) {
			throw new IllegalArgumentException("Precisa cadastrar avalia��es para c�lculo da m�dia");
		}
		float somaNotas = 0;
		for (Avaliacao a : this.avaliacoes) { // percorre o arraylist - "para cada 'Avalia��o a' existente em
												// 'this.avalia��es'
			somaNotas += a.getNota();
		}
		return somaNotas / avaliacoes.size();
	}

	public String exibeBoletim() {
		String boletim = this.getNome() + " Obteve m�dia final " + this.getMedia()
				+ " em fun��o das seguintes avalia��es: \n\n";
		for (Avaliacao a : this.avaliacoes) {
			boletim += a.exibir();
		}
		return boletim;
	}

	// get/set
	public ArrayList<Avaliacao> getAvaliacoes() {
		return avaliacoes;
	}

	public void setAvaliacoes(ArrayList<Avaliacao> avaliacoes) {
		this.avaliacoes = avaliacoes;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome == null || nome.isEmpty()) {
			throw new IllegalArgumentException("Aluno precisa de nome");
		}
		this.nome = nome;
	}

}
