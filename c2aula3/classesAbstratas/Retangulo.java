package c2aula3.classesAbstratas;

public class Retangulo extends Forma2d{
	private final double base;
	private final double altura;
	public Retangulo(double base, double altura) {
		this.base=base;
		this.altura=altura;
	}
	@Override
	public double getArea() {
		return this.base*this.altura;
	}
	@Override
	public double getPerimetro() {
		return this.base*2+this.altura*2;
	}

}
