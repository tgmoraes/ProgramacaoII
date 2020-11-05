package aulaP3.encapsulamento;

public class Moto {
	//atributos
	private String modelo;
	private int velocidade;
	private Pessoa motorista;
	private final int velFinal = 150;
	//construtores
	public Moto() {
		this.velocidade=0;
		this.motorista=null;
	}
	public Moto(String modelo) {
		this.velocidade=0;
		this.modelo=modelo;
		this.motorista=null;
	}
	//getters
	public String getModelo() {
		return this.modelo;
	}
	public int getVelocidade() {
		return this.velocidade;
	}
	public Pessoa getMotorista() {
		return this.motorista;
	}
	//setters
	public void setModelo(String modelo) {
		this.modelo=modelo;
	}
	public void setMotorista(Pessoa p) {
		this.motorista=p;
	}
	//aumenta a velocidade até a velocidade máxima
	public void acelera(int vel) {
		if(this.velocidade+vel> this.velFinal) this.velocidade=this.velFinal;
		else this.velocidade+=vel;
	}
	//diminui velocidade até parar 
	public void freia(int vel) {
		if(this.velocidade-vel<0) this.velocidade = 0;
		else this.velocidade-=vel;
	}
	public boolean exiteMotorista() {
		return this.motorista!=null;
	}
}
