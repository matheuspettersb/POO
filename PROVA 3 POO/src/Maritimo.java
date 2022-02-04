// MATHEUS PETTERS BEVILAQUA E GABRIEL RUPP K LOPES

import java.util.ArrayList;
import java.util.List;

public class Maritimo extends PacoteTuristico {
	private float valorNavio;
	private ArrayList<Opcional> opcionais;

	// construtor
	public Maritimo(String descricao, String identificacao, float valorNavio) {
		super(descricao, identificacao);
		this.valorNavio = valorNavio;
	}

	public float getValorTotalReais() {
		float total = 0;
		total += valorNavio;
		for (Opcional o : this.opcionais) {
			total += o.getValor();
		}
		return total;
	}

	public String toString() {
		if (opcionais.size() > 0) {
			String resultado = "Pacote marítimo " + this.getDescricao() + " (" + this.getIdentificacao() + ") com ";
			for (Opcional o : this.opcionais) {
				resultado += o.getDescricao() + ", ";
			}
			resultado += "pelo valor de R$ " + this.getValorTotalReais();
			return resultado;
		} else {
			return "Pacote marítimo " + this.getDescricao() + " (" + this.getIdentificacao() + ") pelo valor de R$ "
					+ this.getValorTotalReais();
		}
	}

	public void addOpcional(String descricao, float valor) {
		Opcional o = new Opcional(descricao, valor);
		this.opcionais.add(o);
	}
	
	public List<Opcional> quaisOpcionaisFaixa(float limiteInferior, float limiteSuperior) {
		List<Opcional> a = null;
		for (Opcional o : this.opcionais) {
			if ((o.getValor() * Maritimo.getValorDolar()) >= limiteInferior) {
				if ((o.getValor() * Maritimo.getValorDolar()) <= limiteSuperior) {
					a.add(o);
				}
			}
		}
		if (a == null) {
			System.out.print("Nenhum opcional no valor encontrado");
		}
		return a;
		}
}
