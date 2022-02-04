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
		// serializa��o
		try {
			// salvando em um arquivo
			FileOutputStream fileOut = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			// m�todo de serializa��o
			out.writeObject(a); // a = NOME DO OBJETO
			out.close();
			fileOut.close();
			System.out.println("Objeto serializado");

		} catch (IOException i) {
			System.out.print(i.getMessage());

		}

		// Desserializa��o
		try {
			// Lendo o objeto do arquivo
			FileInputStream fileIn = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(fileIn);
			// M�todo de desserializa��o
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
