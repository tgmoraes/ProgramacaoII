package c2aula3.classesAbstratas;

public class Quadrado extends Forma2d{
	private final double lado;
	//construtor
	public Quadrado(double lado) {
		this.lado=lado;
	}
	@Override
	public double getArea() {
		return this.lado*this.lado;
	}

	@Override
	public double getPerimetro() {
		return this.lado*4;
	}
	@Override
	public String toString() {
		//"Quadrado - lado: 4
		return super.toString()+" - lado: "+this.lado;
	}

}
