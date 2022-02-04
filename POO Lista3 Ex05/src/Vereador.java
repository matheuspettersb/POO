import java.util.ArrayList;

//Matheus Petters Bevilaqua e Gabriel Rupp K Lopes

public class Vereador
//atributos
{private String nome;
private Partido partido;
private ArrayList<ProjetoDeLei> projetos = new ArrayList<>();

//construtor
public Vereador (String nome) {
	this.setNome(nome);
	}

//getters e setters
public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public Partido getPartido() {
	return partido;
}

public void setPartido(Partido partido) {
	this.partido = partido;
}

public int getQntProjApres() {
	return this.projetos.size();
}

public void setQntProjApres(int qntProjApres) {
	if (qntProjApres >=0)
	this.getQntProjApres() = qntProjApres;
}

public int getQntProjAprov() {
	int contador=0;
	for (ProjetoDeLei pl : projetos) {
		if(pl.isAprovado()) {
		contador++;
		}
	}
	return contador;
}

public void setQntProjAprov(int qntProjAprov) {
	if (qntProjAprov >= 0)
	this.getQntProjAprov() = qntProjAprov;
}

//métodos:
public double getDesempenho() {
	double desempenho;
	desempenho = ((double)this.getQntProjAprov()/this.getQntProjApres()); // O (double) na frente transforma o valor em double pra essa operação. Necessário pois int/int = int (erro na conta).
	if (qntProjApres > 0) {
		return desempenho*this.getIndiceTrabalho();
		}
	else { return 0;}
	}
	
public double getIndiceTrabalho() {
	if (qntProjApres <6) {
		return 0.8;
		}
	else if (qntProjApres <11) {
		return 1;
			}
	else if (qntProjApres <18) {
		return 1.08;
	}
	else {
		return 1.22;
		}
	}

public void addProjeto(ProjetoDeLei projeto) {
	this.projetos.add(projeto);
}

}

