package aulaP1.revisaoJava;

import java.util.Scanner;

public class Condionais {

	public static void main(String[] args) {
		Scanner entrada =  new Scanner(System.in); 
		System.out.println("Você gosta de programação? (sim/nao)");
		String resp = entrada.next();
		if(resp.equals("sim")) {
			System.out.println("Como vc é legal! S2");
		} else if (resp.equals("nao")) {
			System.out.println("Isso não pode ser verdade. :(");
		}
		else {
			System.out.println("Você deve gostar mas "
					+ "não entendi sua resposta");
		}
		entrada.close();
	}
}
