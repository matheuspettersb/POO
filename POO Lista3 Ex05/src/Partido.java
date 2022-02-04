//Matheus Petters Bevilaqua e Gabriel Rupp K Lopes

import java.util.ArrayList;

public class Partido {
	private String nome;
	private int numero;
	private ArrayList<Vereador> vereadores = new ArrayList<>();
	
	public void addVereador(Vereador vereador) {   	//"addVereador" = nome do metodo > "(Vereador vereador)" chama o objeto vereador da classe vereador 
		this.vereadores.add(vereador);				//Se fosse "(Vereador v)" classe = vereador, objeto = v	
		vereador.setPartido(this);					//adiciona o objeto vereador a lista de vereadores da classe partido
		}											//faz a o partido com o vereador nos dois sentidos (vereador aponta pra partido e partido aponta pra vereador)
		
	
	public double getMediaDesempenho() {
		double desempenho = 0;
		for (Vereador vereador : this.vereadores) {	//modo de usar o ArrayList
			desempenho += vereador.getDesempenho();
		}
		return desempenho / this.vereadores.size();
	}
	
	public int getTotalProjetosApresentados() {
		int projetosApresentados = 0;
		for (Vereador vereador : this.vereadores) {
			projetosApresentados += vereador.getQntProjApres();
		}
		return projetosApresentados;
	}
	
	public int getTotalProjetosAprovados() {
		int projetosAprovados = 0;
		for (Vereador vereador : this.vereadores) {
			projetosAprovados += vereador.getQntProjAprov();
		}
		return projetosAprovados;
	}
	
	public ArrayList<Vereador> getListaVereadores() {
		return new ArrayList<>(this.vereadores);
	}

	public Vereador getMenorDesempenho() {
		Vereador menorDesemp = null;
		for (Vereador vereador: this.vereadores ) {
			if (menorDesemp == null|| vereador.getDesempenho() < menorDesemp.getDesempenho()) {
				menorDesemp=vereador;
			}
		}
		return menorDesemp;
	}
	
	
	//getters e setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		if (numero >=10 && numero<100) { //exigencia do tribunal eleitoral (vida real). O "&&" é o que deixa por mais de uma condição
		this.numero = numero;
		}
		else {
			IllegalArgumentException excessao = new IllegalArgumentException("Número do partido deve ser entre 10 e 99");
		}
	}
	
	public ArrayList<Vereador> getVereadores() {
		return vereadores;
	}
	public void setVereadores(ArrayList<Vereador> vereadores) {
		this.vereadores = vereadores;
	}
}
