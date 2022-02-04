// Matheus Petters Bevilaqua e Gabriel Rupp Kosilek Lopes
public class Trabalho extends Avaliacao{
	private char conceito;
	
	public Trabalho (String desc, char conceito) {
		super (desc);
		this.setConceito(conceito);
	}

	public float getNota() {
		float nota = 0;		
		if (this.getConceito() == 'A') { //aparentemente aspas "duplas" (") = string, e aspas "curtas" (') = char
			nota=10.0F;
		} else {
			if (this.getConceito() == 'B') {
				nota=9.0F;
			}
			else { 
				if (this.getConceito() == 'C') {
				nota=7.5F;
				} else {
					if (this.getConceito() == 'D') {
						nota=5.0F;
						} else {
							if (this.getConceito() == 'E') {
								nota=2.0F;
							}
						}
				}
			}
		}
	return nota;
	}
	
	public char getConceito() {
		return conceito;
	}

	public void setConceito(char conceito) {
		if (conceito == 'A'
				|| conceito == 'B'
				|| conceito == 'C'
				|| conceito == 'D'
				|| conceito == 'E') {	
		this.conceito = conceito;
	}
		else { 
			throw new IllegalArgumentException("Conceito inválido");
		}
	}
}
