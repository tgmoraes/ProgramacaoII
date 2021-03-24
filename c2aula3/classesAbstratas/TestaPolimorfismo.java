package c2aula3.classesAbstratas;

import java.util.ArrayList;
import java.util.Scanner;

public class TestaPolimorfismo {
	public static final Scanner INP = new Scanner(System.in);
	public static Quadrado criaQuadrado() {
		System.out.println("Digite o tamanho do lado do quadrado:");
		return new Quadrado(INP.nextDouble());
	}
	public static Circulo criaCirculo() {
		System.out.println("Digite o raio do círculo:");
		return new Circulo(INP.nextDouble());
	}
	public static Retangulo criaRetangulo() {
		System.out.println("Digite a base do retângulo:");
		double base = INP.nextDouble();
		System.out.println("Digite a altura do retângulo:");
		double altura = INP.nextDouble();
		return new Retangulo(base,altura);
	}
	public static Forma2d criaForma() {
		StringBuilder msg = new StringBuilder("Olá, que formato você deseja criar? Digite:\n");
		msg.append("(q) para criar um quadrado\n");
		msg.append("(c) para criar um círculo\n");
		msg.append("(r) para criar um retângulo\n");
		msg.append("(qualquer caractere) para sair");
		System.out.println(msg);
		
		char menu = INP.next().charAt(0);
		
		if(menu=='q') return criaQuadrado();
		else if(menu=='r') return criaRetangulo();
		else if(menu=='c') return criaCirculo();
		else return null;
	}
	public static void main(String[] args) {
		var listaFiguras = new ArrayList<Forma2d>();
		
		//var lFiguras = new Forma2d[10];
		//lFiguras[0] = new Quadrado(2);
		//lFiguras[1] = new Circulo(2);
		//lFiguras[2] = new Retangulo(2,5);
		
		Forma2d figura; 
		while(true){
			figura = criaForma();
			if(figura==null) {
				break;
			}else{
				listaFiguras.add(figura);
			}
		}
		System.out.println("----------------\n printando formas: \n----------------");
		for(Forma2d item: listaFiguras) {
			System.out.println(item);
			System.out.println("--> área:"+item.getArea());
			System.out.println("--> perímetro:"+item.getPerimetro()+"\n----------------\n");
		}
	}

}
