import java.time.LocalDate;
public class Parecer
{	//atributos
	private String name;
	private LocalDate date; //classe do Java que serve pra tratar de datas
	private String content;

	//métodos
	public Parecer(String name, LocalDate date, String content)
	{this.name = name;
	this.date = date;
	this.content = content;
	}
	
	public String getName()
	{return this.name;
	}
	
	public LocalDate getDate()
	{
	return this.date;
	}
	
	public String getContent()
	{
	return this.content;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
}
