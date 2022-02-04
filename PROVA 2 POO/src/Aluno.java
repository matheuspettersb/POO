import java.util.ArrayList;

// Matheus Petters Bevilaqua e Gabriel Rupp Kosilek Lopes

public class Aluno {
    private String nome;
    private ArrayList<Avaliacao> avaliacoes = new ArrayList<>(); //melhor usar array list do que hashmap. 1- pq vê as notas de forma sequencial e 2- pq não tem uma chave mto boa no hash

    public Aluno (String nome) {
    	this.setNome(nome);
    }
    
    private void addAvaliacao(Avaliacao a) {
    	if (a == null) { 										//validação
    		throw new IllegalArgumentException("Avaliação não pode ser nulo");
    	}
    	this.avaliacoes.add(a); 			//adiciona a avaliação no arraylist 
    }
    
    private float getMedia() {
    	if (this.avaliacoes.isEmpty()) {
    		return 0;
    	}
    	float somaNotas = 0;
    	int contador = 0;
    	for (Avaliacao a : this.avaliacoes) { //percorre o arraylist - "para cada 'Avaliação a' existente em 'this.avaliações'
    		somaNotas += a.getNota();
    		contador++;
    	}
    	return somaNotas/contador;
    	//ou, melhor ainda, deleta o contador e faz
    	// return somaNotas/this.avaliacoes.size()
    }
    
    private String exibeBoletim() {
    	String boletim = this.getNome() + " obteve a média final " + this.getMedia() + "em função das avaliações: \n";
    	for (Avaliacao a : this.avaliacoes) {
    		boletim += "\n" a.exibir();
    	}
    	return boletim;
    }
    
    //get/set
    public String getNome() {
        return nome;
    } 

    public void setNome(String nome) {
        this.nome = nome;
    }
}