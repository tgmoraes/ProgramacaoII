package aulaP3.exercicios;

public class TestaCasa {
	public static void main(String[] args) {
		Casa casa1 = new Casa("branco");
		casa1.pinta("Amarelo");
		Porta p1 = new Porta("branco",0.80,2);
		Porta p2 = new Porta("cinza",0.80,2);
		Porta p3 = new Porta("cinza",0.80,2);
		Porta p4 = new Porta("marrom",1.20,2);
		p1.abre();
		p2.fecha();
		p3.abre();
		p4.abre();
		casa1.inserePorta(p1);
		casa1.inserePorta(p2);
		casa1.inserePorta(p3);
		casa1.inserePorta(p4);
		System.out.println("total portas:"+casa1.totalPortas());
		System.out.println("total portas abertas:"+casa1.quantasPortasEstaoAbertas());
		int fechadas = casa1.totalPortas()-casa1.quantasPortasEstaoAbertas();
		System.out.println("total portas fechadas:"+fechadas);
		
	}
}
