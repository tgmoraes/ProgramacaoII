package aulaP2.introOO;

public class TestaMoto {

	public static void main(String[] args) {
		//cria objeto
		Moto moto1 = new Moto();
		//inicializa parâmetros
		moto1.modelo = "CG Titan";
		moto1.velocidade = 0;
		moto1.motorista=null;
		
		moto1.acelera(60);
		System.out.println(moto1.velocidade==60);
		moto1.acelera(60);
		moto1.acelera(60);
		System.out.println(moto1.velocidade==150);
		
		moto1.freia(80);
		System.out.println(moto1.velocidade==70);
		
		moto1.freia(80);
		System.out.println(moto1.velocidade==0);
		
		Pessoa pes1 = new Pessoa();
		pes1.nome = "João";
		pes1.idade=25;
		System.out.println("Teste motorista1 (sem motorista):"+(moto1.exiteMotorista()==false));
		moto1.motorista=pes1;
		System.out.println("Teste motorista1 (com motorista):"+(moto1.exiteMotorista()==true));

	}

}
