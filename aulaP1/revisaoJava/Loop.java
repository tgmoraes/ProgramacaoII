package aulaP1.revisaoJava;

import java.util.Scanner;

public class Loop {

	public static void main(String[] args) {
		// prog que diz se o número é par ou ímpar
		String msg = "Digite um número ou 0 para sair:";
		Scanner ent =  new Scanner(System.in); 
		int num=0;
		do {
			System.out.println(msg);
			num = ent.nextInt();
			if(num==0) break;
			if (num%2 == 0) {
				System.out.println(num+" é par!");
			}else {
				System.out.println(num+" é ímpar!");
			}
		} while (num!=0);
		System.out.println("Até mais, tchau!");
		ent.close();
	}
}
