public class Principal
{	public static void main(String[] args) {
		String entrada[] = new String [3];
		
		entrada[0] = "João Aparecido da Silva";
		entrada[1] = "Dores";
		entrada[2] = "Blumenau";
		String nome = NameGenerator.generateStarWarsName(entrada);
		System.out.println(nome);
		
		String[] entrada2 = {"Ana Maria Soares", "Gregório", "Gaspar"};
		nome = NameGenerator.generateStarWarsName(entrada2);
		System.out.println(nome);
	}

}
