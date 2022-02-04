
public class Contribuinte
{	//atributos
	private String nome;
	private String cpf;
	private String uf;
	private double rendaAnual;
	
	//métodos
	public String getNome()
		{return nome;
		}
	public void setNome(String nome)
		{this.nome = nome;
		}
	
	public String getCpf() 
		{return cpf;
		}
	public void setCpf(String cpf) 
		{this.cpf = cpf;
		}

	public String getUf()
		{return uf;
		}
	public void setUf(String uf)
		{if (uf.equals("SC") || uf.equals("PR") || uf.equals("RS"))
			{this.uf = uf;
			}
		}

	public double getRendaAnual()
		{return rendaAnual;
		}
	public void setRendaAnual(double rendaAnual)
		{this.rendaAnual = rendaAnual;
		}
	
	public double getImpostoAPagar()
		{return this.rendaAnual * this.getAliquota();
		}
	
	public double getAliquota()
		{if (this.rendaAnual < 4001)
			{return 0; //0%
			}
		if (this.rendaAnual < 9001)
			{return 0.058; //5.8%
			}
		if (this.rendaAnual < 25001)
			{return 0.15; //15%
			}
		if (this.rendaAnual < 35001)
			{return 0.275; //27,5%;
			}
		return 0.3; //30%
		}
}