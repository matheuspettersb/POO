// Matheus Petters Bevilaqua e Gabriel Rupp Kosilek Lopes
public class Prova extends Avaliacao{
	private float nota;
	
	public Prova (String desc, float nota) {
		super (desc);
		this.setNota(nota);
	}
	public 
	
	public float getNota() {
		return nota;
	}

	public void setNota(float nota) {
		if (nota < 0 || nota > 10) {
			throw new IllegalArgumentException("Nota deve ser uma valor entre 0 e 10");
			}
		this.nota = nota;
	}

}
