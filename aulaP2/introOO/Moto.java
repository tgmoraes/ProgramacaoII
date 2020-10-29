package aulaP2.introOO;

class Moto {
	//atributos
	String modelo;
	int velocidade;
	Pessoa motorista;
	
	//aumenta a velocidade até a velocidade máxima
	void acelera(int vel) {
		int velFinal = 150;
		if(this.velocidade+vel> velFinal) this.velocidade=velFinal;
		else this.velocidade+=vel;
	}
	//diminui velocidade até parar 
	void freia(int vel) {
		if(this.velocidade-vel<0) this.velocidade = 0;
		else this.velocidade-=vel;
	}
	boolean exiteMotorista() {
		return this.motorista!=null;
	}
	
	
}
