import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ExemploSerializer implements Serializable {
	private static final long serialVersionUID = 1L;
	{
		String filename = "serializacao";
		// serialização
		try {
			// salvando em um arquivo
			FileOutputStream fileOut = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			// método de serialização
			out.writeObject(a); // a = NOME DO OBJETO
			out.close();
			fileOut.close();
			System.out.println("Objeto serializado");

		} catch (IOException i) {
			System.out.print(i.getMessage());

		}

		// Desserialização
		try {
			// Lendo o objeto do arquivo
			FileInputStream fileIn = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(fileIn);
			// Método de desserialização
			a = (A) in.readObject(); // a = NOME DO OBJETO/ A = *CLASSE* DO OBJETO
			in.close();
			fileIn.close();
		} catch (IOException i) {
			System.out.print(i.getMessage());
		} catch (ClassNotFoundException c) {
			System.out.println("class not found");
		}
	}
}
