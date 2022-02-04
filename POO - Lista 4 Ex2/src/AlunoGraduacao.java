import java.time.LocalDate;

public class AlunoGraduacao extends Aluno{
	private char formaIngresso;
	private Curso curso;
	
	//construtor
	public AlunoGraduacao(String nome, LocalDate dataNascimento, char formaIngresso, Curso curso) {
		this.setNome(nome);
		this.setDataNascimento(dataNascimento);
		this.setFormaIngresso(formaIngresso);
		this.setCurso(curso);
		}


		// Destrutor
		protected void finalize() throws Throwable {
			System.out.println("Passando pelo destrutor de Aluno Universit�rio:"+this.nome);
			super.finalize();  // chama o destrutor da superclass
		}
		
		public String mostra() {
			return this.getNome() + "� aluno universit�rio do curso de " + this.curso.getSigla() + " - " +this.curso.getNome() + ", ingressando por " + this.getFormaIngresso();
			}
		
			
	//get/set
		public String getFormaIngresso() {
			switch (this.formaIngresso){
				case 'V' : return "Vestibular";
				case 'E' : return "ENEM";
				case 'S' : return "Seletivo especial";
				case 'T' : return "Transf. Externa";
				case 'I' : return "Transf. Interna";
				default  : return "N�o identificado";
			}
		}
		
	public void setFormaIngresso(char formaIngresso) {
		if ("VESTI".contains(String.valueOf(formaIngresso))) { //verifica se a letra inserida � uma das que est� na string
			this.formaIngresso = formaIngresso;
		}
		else {
			throw new IllegalArgumentException ("N�o entrou uma letra v�lida: V E S T I");
			}
		}	
	
	public Curso getCurso() {
		return curso;
		}
	public void setCurso(Curso curso) {
		this.curso = curso;
		}
}