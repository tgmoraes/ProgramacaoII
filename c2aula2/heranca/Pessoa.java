package c2aula2.heranca;

public class Pessoa {
	//poderia ser private para um melhor encapsulamento (inclusive é a maneira mais indicada!)
	protected String nome;	
	public Pessoa(String nome) {
		this.nome = nome;
	}
	public String quemSou() {
		return "Sou "+this.nome+", uma pessoa.";
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}
