package c2aula3.classesAbstratas;

public class Circulo extends Forma2d{
	private final double raio;
	
	public Circulo(double raio) {
		this.raio = raio;
	}

	@Override
	public double getArea() {
		return Math.PI*this.raio*this.raio;
	}

	@Override
	public double getPerimetro() {
		return 2*Math.PI*this.raio;
	}
	
}
