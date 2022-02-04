import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;
public class DataAgenda
{	private LocalDate data;
	private String efemeride;
	private HashMap<LocalTime, Compromisso> compromissos = new HashMap;
	private ArrayList<Compromisso> lista = new ArrayList<>();
	
	public boolean addCompromisso(Compromisso c)
	{	if (compromissos.containsKey(c.getHora())) {
			return false;
		}
		else {
			compromissos.put(c.getHora(), c);
			return true;
		}
		lista.add(c);
	}
	
	public boolean addCompromisso1(Compromisso c) {
		for (Compromisso comp:lista) {//for-each
			if (comp.getHora().equals(c.getHora())) {
				return false;
			}
		}
		lista.add(c);
		return true;
	}
	
	public DataAgenda(LocalDate data, String efemeride)
	{	this.setData(data);
		this.setEfemeride(efemeride);
	}
	
	public LocalDate getData() {
		return data;
	}

	public String getEfemeride() {
		return efemeride;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public void setEfemeride(String efemeride) {
		this.efemeride = efemeride;
	}
	
	

}
