//Matheus Petters Bevilaqua e Gabriel Rupp K Lopes

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Camara {
	private String municipio;
	private HashMap<Integer,Partido> partidos = new HashMap<>(); //Construção do HashMap >> HashMap<Chave,Oq gurada> Handler. Chave é o tipo de 
	
	//construtor
	public Camara(String municipio) {
		this.setMunicipio(municipio);
	
	}
	
	
	public int getTotalProjApres() {
		int totalProjApres = 0;
		for (Partido p : partidos.values()) { 		//percorre o Hashmap declarado ali em cima
			totalProjApres += p.getTotalProjetosApresentados();
		}
		return totalProjApres;
	}

	public int getTotalProjAprov() {
		int TotalProjAprov = 0;
		for (Partido p :partidos.values()) {
			TotalProjAprov += p.getTotalProjetosAprovados();
		}
		return TotalProjAprov;
	}

	public void addPartido (Partido p){
		this.partidos.put(p.getNumero(), p);
	}

	public Vereador getVereadorMaisProjAprov() {
		Vereador vereadorMaisAprov = null;
		for (Partido p : partidos.values()) {
			ArrayList<Vereador> listaDoPartido = p.getListaVereadores();
			for (Vereador v : listaDoPartido) {
				if (vereadorMaisAprov == null || v.getQntProjAprov() > vereadorMaisAprov.getQntProjAprov()) {
					vereadorMaisAprov = v;
				}
			}
		}
		return vereadorMaisAprov;
	}
	
	public Vereador getVereadorMenorDesempenho() {
		Vereador vereadorMenorDesempenho = null;
		Vereador piorDoPartido = null;
		for (Partido p : partidos.values()) {
			piorDoPartido  = p.getMenorDesempenho();
					if (vereadorMenorDesempenho == null || piorDoPartido.getDesempenho() < vereadorMenorDesempenho.getDesempenho()) {
						vereadorMenorDesempenho = piorDoPartido;
					}
		}
		return vereadorMenorDesempenho;
	}
	
	public List<Vereador> getVereadoresAcimaMedia() {
		ArrayList<Vereador> AcimaMedia = new ArrayList<>();
		for (Partido p : partidos.values()) {
			ArrayList<Vereador> listaDoPartido = p.getListaVereadores();
			for (Vereador v : listaDoPartido) {
				if (v.getDesempenho() > this.getDesempenhoCamara()) {
				AcimaMedia.add(v);
				}
			}
		}
		return AcimaMedia;
	}
	
	
	public double getDesempenhoCamara() {
		double desemp = 0;
		int qtd=0;
		for (Partido p : partidos.values()) {
			ArrayList<Vereador> listaPartido = p.getListaVereadores();
			for (Vereador v : listaPartido) {
				desemp += v.getDesempenho();
				qtd++;	
			}
		}
		return desemp/qtd;
	}
	
	public Partido getPartido(int numero) {
		return this.partidos.get(numero);
	}
	
	
	//get e set
	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}	
}