package aulaP3.encapsulamento;

public class Pessoa {
	private int idade;
	private String nome;
	//construtor
	public Pessoa() {
	}
	public Pessoa(int idade, String nome) {
		this.idade=idade;
		this.nome=nome;
	}
	//getters
	public int getIdade() {
		return this.idade;
	}
	public String getNome() {
		return this.nome;
	}
	//setters
	public void setIdade(int idade) {
		this.idade=idade;
	}
	public void setNome(String nome) {
		this.nome=nome;
	}
}
