package aulaP3.exercicios;

public class Porta {
	private boolean aberta;
	private String cor;
	private double dimensaoX;
	private double dimensaoY;
	
	public Porta(String cor, double x, double y) {
		this.pinta(cor);
		this.fecha();
	}
	
	public void abre() {
		this.aberta=true;
	}
	public void fecha() {
		this.aberta=false;
	}
	public void pinta(String cor) {
		this.cor = cor;
	}
	public boolean estaAberta() {
		return this.aberta;
	}
	public String getCor() {
		return this.cor;
	}

	public double getDimensaoX() {
		return dimensaoX;
	}

	public void setDimensaoX(double dimensaoX) {
		if(dimensaoX>0) this.dimensaoX = dimensaoX;
	}

	public double getDimensaoY() {
		return dimensaoY;
	}

	public void setDimensaoY(double dimensaoY) {
		if(dimensaoY>0) this.dimensaoY = dimensaoY;
	}
}
