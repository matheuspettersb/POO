public class Principal
{	public static void main(String[] args) {
		String entrada[] = new String [3];
		
		entrada[0] = "Jo�o Aparecido da Silva";
		entrada[1] = "Dores";
		entrada[2] = "Blumenau";
		String nome = NameGenerator.generateStarWarsName(entrada);
		System.out.println(nome);
		
		String[] entrada2 = {"Ana Maria Soares", "Greg�rio", "Gaspar"};
		nome = NameGenerator.generateStarWarsName(entrada2);
		System.out.println(nome);
	}

}
