import java.util.ArrayList;

public class Selecao {
	private String pais;
	private String tecnico;
	private int ranking; 
	private ArrayList<Jogador> jogadores = new ArrayList<>();
	
	//construtor
	public Selecao (String pais, String tecnico, int ranking) {
		this.setPais(pais);
		this.setTecnico(tecnico);
		this.setRanking(ranking);
	}

	//metodos
	
	public void addJogador(Jogador jogador) {
		if (jogadores.size()<12)
		this.jogadores.add(jogador);
		}
	
	public float getIdadeMedia() {
		float idadeMedia = 0;
		for (Jogador jogador : this.jogadores) {
			idadeMedia += jogador.getIdade();
		}
		return idadeMedia/this.jogadores.size();
	}
	
	public int getQuantosAbaixo(double alturaX) {
		int abaixo=0;
		for (Jogador jogador : this.jogadores) {
			if (jogador.getAltura() < alturaX) {
				abaixo++;
			}
		}
		return abaixo;
	}
	
	public Jogador getJogadorMaisAlto() {
		Jogador jogadorAlto = null;
		double altura = 0;
		for (Jogador jogador : this.jogadores) {
			if (jogador.getAltura() > altura) {
				altura = jogador.getAltura();
				jogadorAlto = jogador;
			}
		}
		return jogadorAlto;
	}
	
	public ArrayList<Jogador> getJogadores(String posicao) {
		ArrayList<Jogador> jogadoresPosicao = new ArrayList<>();
		String posicaoX = posicao;
		for (Jogador jogador : this.jogadores) {
			if (jogador.getPosicao() == posicaoX) {
				jogadoresPosicao.add(jogador);
			}
		}
		return jogadoresPosicao;
	}
	
	
	//getters/setters
	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getTecnico() {
		return tecnico;
	}

	public void setTecnico(String tecnico) {
		this.tecnico = tecnico;
	}

	public int getRanking() {
		return ranking;
	}

	public void setRanking(int ranking) {
		this.ranking = ranking;
	}

	public ArrayList<Jogador> getJogadoresSelecao() {
		return jogadores;
	}

	public void setJogadoresSelecao(ArrayList<Jogador> jogadores) {
		this.jogadores = jogadores;
	}
}
