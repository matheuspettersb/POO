
public class Obra
//atributo
{	private String autor;
	private String titulo;
	private Parecer[] pareceres = new Parecer[3];
	private byte idxPareceres = 0;

	public Obra(String titulo, String autor) {
		this.setAuthor(autor);
		this.setTitulo(titulo);
		}

	public String getTitulo() {
		return this.titulo;
		}	
	public String getAuthor() {
		return this.autor;
		}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
		}
	
	public void setAuthor(String autor) {
		this.autor = autor;
		}
	
	public boolean AddParecer(Parecer parecer)
	{
	if (idxPareceres < this.parecer.length)
	{
	parecer[idxPareceres] = parecer;
	++idxPareceres;
	return true;
	}
	return false;
	}
}