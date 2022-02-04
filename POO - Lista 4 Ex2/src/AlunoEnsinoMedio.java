import java.time.LocalDate;

public class AlunoEnsinoMedio extends Aluno {
private int ano;

//construtor
public AlunoEnsinoMedio (String nome, LocalDate dataNascimento, int ano) {
	this.setNome(nome);
	this.setDataNascimento(dataNascimento);
	this.setAno(ano);
	}
//Destrutor
	protected void finalize() throws Throwable {
		System.out.println("Passando pelo destrutor de Aluno Ensino Médio:"+this.nome);
		super.finalize();  // chama o destrutor da superclasse
	}

public String mostra() {
	return this.getNome() + " está cursando o " + this.getAno() + "º ano do ensino médio e tem " + this.getIdade() + " anos.";
}


//get/set
public int getAno() {
	if (ano>=1 && ano<=3) {
		return ano;
	}
	else {
		throw new IllegalArgumentException("Ano deve estar entre 1 e 3");
	}
}

public void setAno(int ano) {
	this.ano = ano;
}


}
