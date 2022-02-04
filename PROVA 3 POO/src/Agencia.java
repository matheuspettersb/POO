// MATHEUS PETTERS BEVILAQUA E GABRIEL RUPP K LOPES

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Agencia {
	private ArrayList<PacoteTuristico> pacotes;

	// construtor
	public Agencia() {
	}

	// métodos
	public void addPacote(PacoteTuristico p) {
		this.pacotes.add(p);
	}

	public void filtrar(String nomeArq, List<String> ListaID) {
		try {
		FileOutputStream fileOut = new FileOutputStream(nomeArq);
		ObjectOutputStream out = new ObjectOutputStream(fileOut);
		for (PacoteTuristico p : this.pacotes) {
			for (String s : ListaID) {
				if(s == p.getIdentificacao()) {
				out.writeObject(p);
				}
			}
		}
		out.close();
		fileOut.close();
		System.out.println("Arquivo gerado");
		} catch (IOException i) {
		System.out.print(i.getMessage());
		}
	}
}
