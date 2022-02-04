//Matheus Petters Bevilaqua e Gabriel Rupp K Lopes

import java.time.LocalDate;

public class ProjetoDeLeiComplementar extends ProjetoDeLei {
	private int artigoLO;
	private int qtdVotosFavoraveis;
	
	public ProjetoDeLeiComplementar(String titulo, LocalDate dataAprovacao, LocalDate dataApresentacao, int artigoLO, int qtdVotosFavoraveis, Vereador vereador) {
		super(titulo, dataAprovacao, dataApresentacao, vereador);
		this.setArtigoLO(artigoLO);
		this.setQtdVotosFavoraveis(qtdVotosFavoraveis);
	}
	
	public String mostrar() {
			return "O projeto de lei complementar"+this.getTitulo()+", nº "+this.getNumeroProjeto()+" referente ao artigo de Lei Orgânica nº "+this.getArtigoLO()+
					"foi proposto no dia "+this.getDataApresentacao()+", pelo vereador "+this.getVereador()+" e aprovado no dia "+this.getDataAprovacao()+" com "+
					this.getQtdVotosFavoraveis()+" votos favoráveis.";
		}
	
	//get/set
	public int getArtigoLO() {
		return artigoLO;
	}
	public void setArtigoLO(int artigoLO) {
		this.artigoLO = artigoLO;
	}
	public int getQtdVotosFavoraveis() {
		return qtdVotosFavoraveis;
	}
	public void setQtdVotosFavoraveis(int qtdVotosFavoraveis) {
		this.qtdVotosFavoraveis = qtdVotosFavoraveis;
	}
	

}