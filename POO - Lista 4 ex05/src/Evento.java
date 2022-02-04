import java.time.LocalDate;
public class Evento {
	private String titulo;
	private double valor;
	private LocalDate data;
	private Avaliacao aval;
	
public Evento (String t, double v, LocalDate d) {
	this.setTitulo(t);
	this.setData(d);
	this.setValor(v);
}
	
	public String exibir() {
		if (aval != null) {
			return this.getClass().getName() ": " + this.getTitulo() +", no dia " + this.getData() + " ingressos a " + this.getValor() + //getClass().getName() retorna evento (o nome da classe)
					" teve " + this.getAval().getQntPagantes() + " "
		}
	}
	
	//get/set
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	
	
}
