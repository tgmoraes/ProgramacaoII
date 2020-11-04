package aulaProjInt.parte1;

class Moto {
	//atributos
	String modelo;
	int velocidade;
	int odometro;		//kms rodados
	
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
	//retorna uma string com os parâmetros da moto
	String getEstado() {
		String s = "Moto--> modelo: "+this.modelo+
				"\nvelocidade: "+this.velocidade+" km/h ("+this.odometro+" km rodados)";
		return s;
	}
	void passaTempo(int horas) {
		int distancia = horas*this.velocidade; //formula da velocidade v=Dx/Dt
		this.odometro+=distancia;
	}
}
