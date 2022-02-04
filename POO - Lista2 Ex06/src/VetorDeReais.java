
public class VetorDeReais
	//atributo
	{private double[] vetor;
	//construtor
	public VetorDeReais(int tamanho)
		{vetor = new double[tamanho];
		}
	//métodos
	//item a:
	public void setValor(double valor, int posicao)
		{this.vetor[posicao] = valor;
		}
	
	public double getValor(int posicao)
		{return this.vetor[posicao];
		}
	
	// item b:
	public int getQtdPares()
		{int contador=0;
		for (int i=0; i < this.vetor.length; i++)
			{int numero = (int)this.vetor[i]; //conversão do numero double pra int, a divisão quer só a parte inteira do número.
			if (numero%2==0)
				{contador++;
				}
			}
		return contador;
		}
	
	//item c:
	public VetorDeReais divisao(VetorDeReais outro)
		{if (this.getTamanho() != outro.getTamanho())
			{return null; //compara o tamanho dos 2 vetores, se n for igual não há como executar
			}
		VetorDeReais novo = new VetorDeReais(this.vetor.length);
		double temp;
		for (int i=0; i<this.vetor.length; i++)
			{temp = this.vetor[i]/outro.getValor(i);
			novo.setValor(temp, i);
			}
		return novo;
		}
	public int getTamanho()
		{return this.vetor.length;
		}
	
	//item d:
	public double multiplicacao(VetorDeReais outro)
		{double m = 0;
		if (this.vetor.length!=outro.getTamanho())
			{return 0.0;
			}
		int n = outro.getTamanho()-1;
		for (int i=0; i<this.vetor.length; i++,n--)
			{m = m + vetor[i]*outro.getValor(n);
			}
		return m;
		}
	
	//item e:
	public void inverter()
		{int i=0;
		int n=this.getTamanho()-1;
		double aux;
		
		for (i=0; i<this.vetor.length/2; i++,n--)
			{aux=vetor[i];
			vetor[i]=vetor[n];
			vetor[n]= aux;
			}
		}
	//método pra ver o vetor (REVER AULA PRA FAZER)
	public String toString() {
		
		}
	//item f 
	public double calcularMaiorDiferenca() {
		double diferenca = 0;
		for (int i = 0, j = 1; j < this.getTamanho()-1; i++, j++)
			{if (vetor[i]-vetor[j] > diferenca)
				{diferenca = vetor[i]-vetor[j];
				}
			}
		return diferenca;
		}
	}



































