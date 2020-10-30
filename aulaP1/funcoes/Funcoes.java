package aulaP1.funcoes;


public class Funcoes {
	static int soma(int a, int b) {
		return a+b;
	}
	//multi realiza a multiplicacao inteira de a por b
	//a é um inteiro
	//b é um inteiro
	static int multi(int a, int b) {
		if(a==0 || b==0) {
			return 0;
		}
		int res = a;
		for (int i = b; i > 1; i = soma(i, -1)) {
			res = soma(a, res);
		}
		return res;
	}
	static String ola() {
		return "ola mundo";
	}
	
	static void printaVet(int[] vet) {
		//implementacao da funcao
		//foreach// para cada elemento de vet faça
		for (int elemento : vet) {
			System.out.print(elemento+" ");
		}
	}
	
	public static void main(String[] args) {
		String frase = ola();
		System.out.println(frase);
		//testes de soma
		System.out.println(soma(5,10)==15);
		System.out.println(soma(5,-10)==-5);
		System.out.println(soma(5,0)==5);
		System.out.println(soma(-5,0)==-5);

		//teste de multi
		System.out.println(multi(5,10)==50);
		System.out.println(multi(10,5)==50);
		System.out.println(multi(10,0)==0);
		System.out.println(multi(0,5)==0);
		System.out.println(multi(10,-5)==-50);
		System.out.println(multi(-10,-5)==50);
		System.out.println(multi(-10,5)==-50);
		
		int[] vetor = {3,56,7,8,3,23,43,11,98};
		printaVet(vetor);		
	}
}



