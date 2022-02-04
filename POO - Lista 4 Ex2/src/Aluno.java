import java.time.LocalDate;
import java.time.Period;

public abstract class Aluno {
protected String nome;
private LocalDate dataNascimento;


public int getIdade() {
	Period p = Period.between(dataNascimento,LocalDate.now());
	return p.getYears();
	}

// Destrutor
protected void finalize() throws Throwable {
	System.out.println("Passando pelo destrutor de ALUNO:"+this.nome);
	super.finalize();  // chama o destrutor da superclasse Object
}

public int compareTo(Aluno outro) {
	// int deve ser positivo caso esse objeto seja maior que o outro
	// int será zero se os dois objetos forem iguais
	// int deve ser negativo caso esse objeto seja menor que o outro
	return (this.nome.compareTo(outro.getNome()));
}

public abstract String mostra();

//getters/setters
public String getNome() {
	return nome;
	}

public void setNome(String nome) {
	this.nome = nome;
	}

public LocalDate getDataNascimento() {
	return dataNascimento;
	}

public void setDataNascimento(LocalDate dataNascimento) {
	this.dataNascimento = dataNascimento;
	}

}
