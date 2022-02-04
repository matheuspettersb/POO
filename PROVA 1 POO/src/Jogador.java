
public class Jogador {
	private String nome;
	private String posicao;
	private double altura;
	private int idade;
	
	//construtor:
	public Jogador (String nome, String posicao, double altura, int idade) {
		this.setNome(nome);
		this.setPosicao(posicao);
		this.setAltura(altura);
		this.setIdade(idade);
	}
	
	//metodos:
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getPosicao() {
		return posicao;
	}
	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
}
