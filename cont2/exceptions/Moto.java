package aula9.exceptions;

class Moto {
	private final String nome;
	private int velocidade;

	public Moto(String nome) {
		this.nome=nome;
		this.velocidade = 0;
	}
	public String getNome() {
		return this.nome;
	}
	public int getVelocidade() {
		return this.velocidade;
	}
	public void acelera(int vel) {
		if(vel<0) throw new IllegalArgumentException("vel deveria ser positivo, valor vel:"+vel);
		this.velocidade+= vel;
	}
	public void freia(int vel) {
		if(vel<0) throw new VelocidadeException("velocidade deveria ser positivo");
		if (this.velocidade - vel >=0) this.velocidade = 0;
		else this.velocidade -= vel;
	}
}
