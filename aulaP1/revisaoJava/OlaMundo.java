package aulaP1.revisaoJava;

import java.util.Scanner;

public class OlaMundo {

	public static void main(String[] args) {
		Scanner input =  new Scanner(System.in); 
		System.out.println("Olá, informe o seu nome");
		
		String nome = "";
		nome = input.next();
		
		System.out.println("Valor: "+nome);
		input.close();
	}

}
