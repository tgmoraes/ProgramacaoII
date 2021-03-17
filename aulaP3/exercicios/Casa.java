package aulaP3.exercicios;

public class Casa {
	private String cor;
	private Porta[] listaPortas;
	private int qtdePortas;
	private final int maxPortas;
	
	public Casa(String cor) {
		this.pinta(cor);
		this.qtdePortas=0;
		this.maxPortas=10;
		this.listaPortas = new Porta[this.maxPortas];
	}
	public void pinta(String cor) {
		this.cor=cor;
	}
	public String getCor() {
		return this.cor;
	}
	public void inserePorta(Porta p) {
		if(this.qtdePortas<this.maxPortas) {
			this.listaPortas[this.qtdePortas] = p;
			this.qtdePortas++;
		}
	}
	public int totalPortas() {
		return this.qtdePortas;
	}
	public int quantasPortasEstaoAbertas() {
		int total=0;
		for(int i=0; i<this.qtdePortas;i++) {
			if (this.listaPortas[i].estaAberta()) total++;
		}
		return total;
	}
	public Porta getPorta(int pos) {
		if(pos>this.qtdePortas) pos=this.qtdePortas-1;
		return this.listaPortas[pos];
	}
}
