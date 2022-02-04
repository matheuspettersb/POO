//Matheus Petters Bevilaqua e Gabriel Rupp K Lopes

import java.time.LocalDate;

public class ProjetoDeLei {
	private String titulo;
	private LocalDate dataApresentacao;
	private LocalDate dataAprovacao;
	private int numeroProjeto;
	private Vereador vereador;

	//construtor
	public ProjetoDeLei(String titulo, LocalDate dataApresentacao, Vereador vereador) {
		this.setTitulo(titulo);
		this.setDataApresentacao(dataApresentacao);
		this.setVereador(vereador);
	}
	
	public String mostrar() {
		if (dataAprovacao != null) {
			return "O projeto de lei "+this.getTitulo()+", nº "+this.getNumeroProjeto()+" foi proposto no dia "+this.getDataApresentacao()+", pelo vereador "+this.getVereador()+
					" e aprovado no dia "+this.getDataAprovacao();
		}
		else {return "O projeto de lei "+this.getTitulo()+", nº "+this.getNumeroProjeto()+" foi proposto no dia "+this.getDataApresentacao()+", pelo vereador "+this.getVereador();
		}
		
	}

	//get/set
	public String getTitulo() {
	return titulo;
	}
	public void setTitulo(String titulo) {
	this.titulo = titulo;
	}

	public LocalDate getDataApresentacao() {
	return dataApresentacao;
	}
	public void setDataApresentacao(LocalDate dataApresentacao) {
	this.dataApresentacao = dataApresentacao;
	}

	public LocalDate getDataAprovacao() {
	return dataAprovacao;
	}
	public void setDataAprovacao(LocalDate dataAprovacao) {
	this.dataAprovacao = dataAprovacao;
	}

	public int getNumeroProjeto() {
	return numeroProjeto;
	}
	public void setNumeroProjeto(int numeroProjeto) {	
	this.numeroProjeto = numeroProjeto;
	}

	public Vereador getVereador() {
		return vereador;
	}
	public void setVereador(Vereador vereador) {
		this.vereador = vereador;
	}

}
