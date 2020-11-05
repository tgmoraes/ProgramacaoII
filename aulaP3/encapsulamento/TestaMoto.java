package aulaP3.encapsulamento;

public class TestaMoto {

	public static void main(String[] args) {
		//cria objeto
		Moto moto1 = new Moto("CG Titan");
		
		moto1.acelera(60);
		System.out.println(moto1.getVelocidade()==60);
		moto1.acelera(60);
		moto1.acelera(60);
		System.out.println(moto1.getVelocidade()==150);
		
		moto1.freia(80);
		System.out.println(moto1.getVelocidade()==70);
		
		moto1.freia(80);
		System.out.println(moto1.getVelocidade()==0);
		
		Pessoa pes1 = new Pessoa(25,"Joao");

		System.out.println("Teste motorista1 (sem motorista):"+(moto1.exiteMotorista()==false));
		moto1.setMotorista(pes1);
		System.out.println("Teste motorista1 (com motorista):"+(moto1.exiteMotorista()==true));

	}

}
