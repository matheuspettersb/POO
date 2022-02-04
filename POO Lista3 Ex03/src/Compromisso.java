import java.time.LocalTime;
public class Compromisso
{//Atributes:
	private LocalTime hora;
	private String descricao;
	private int tempo;
	private char prioridade;

//Construtor:
	public Compromisso(LocalTime hora, String descricao, int tempo, char prioridade) {
		this.setHora(hora);
		this.setDescricao(descricao);
		this.setTempo(tempo);
		this.setPrioridade(prioridade);
	}
		
	public LocalTime getHora() {
		return hora;
	}

	public String getDescricao() {
		return descricao;
	}

	public int getTempo() {
		return tempo;
	}

	public char getPrioridade() {
		return prioridade;
	}

	public void setHora(LocalTime hora) {
		this.hora = hora;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void setTempo(int tempo) {
		this.tempo = tempo;
	}

	public void setPrioridade(char prioridade) {
		this.prioridade = prioridade;
	}
	
	public void AddCompromisso(){
		
	}
}
