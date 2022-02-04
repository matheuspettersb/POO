
public class Trabalho extends Avaliacao {
	private char conceito;

	// construtor
	public Trabalho(String descricao, char conceito) {
		super(descricao);
		this.conceito = conceito;
	}

	// metodos
	public String exibir() {
		String exibicao = this.getDescricao() + " (" + this.getNota() + ")";
		return exibicao;
	}

	public float getNota() {
		float nota=0;
		if (this.getConceito()== 'A') {
			nota = 10f;
		}
		else {
			if (this.getConceito()== 'B') {
				nota = 9f;
			}
			else {
				if (this.getConceito()== 'C') {
					nota = 7.5f;
				}
				else {
					if (this.getConceito()== 'D') {
						nota = 5f;
				}
					else {
						if (this.getConceito()== 'E') {
							nota =2f;
						}
					}
				}
			}
		}		
		return nota;
	}

	// get /set
	public char getConceito() {
		return conceito;
	}

	public void setConceito(char conceito) {
		if ("ABCDE".contains(String.valueOf(conceito))) { // verifica se é umas dessas letras
			this.conceito = conceito;
		} else {
			throw new IllegalArgumentException("O conceito deve ser uma letra válida: A B C D E");
		}
	}
}