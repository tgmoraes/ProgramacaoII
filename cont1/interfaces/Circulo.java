package aula8.interfaces;

public class Circulo extends Forma2d{
	private final int raio;
	
	public Circulo(int raio) {
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
