package aulaP1.revisaoJava;

import java.util.Scanner;

public class Vetores {

	public static void main(String[] args) {
		Scanner ent =  new Scanner(System.in); 
		String[] vet = new String[5];
		for(int i=0;i<vet.length;i++) {
			System.out.println("Digite um nome:");
			vet[i] = ent.next();
		}
		//exemplo foreach: iterando em objeto iteravel
		for (String nome : vet) {
			System.out.println(nome);
		}
		ent.close();
	}
}
