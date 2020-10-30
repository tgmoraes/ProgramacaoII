package aulaP1.exercicios;

import java.util.Scanner;

public class Exercicios {
	static int soma(int a, int b) {
		return a+b;
	}
	//1.a
	static int multi(int a, int b) {
		if(a==0 || b==0) {
			return 0;
		}
		int auxB,res = a;
		//se b negativo inverte
		if(b<0) auxB=-b;
		else	auxB=b;
		while ( auxB > 1) {
			res = soma(a, res);
			auxB = soma(auxB, -1);
		}
		//se b negativo inverte resposta
		if(b<0) res=-res;
		return res;
	}
	//1.c pot de naturais 
	static int pot(int base, int exp) {
		if (exp==0) return 1;
		int res = base;
		for(int i=exp;i>1;i=soma(i,-1)) {
			res= multi(res,base); // 5³ = 5*5*5
		}
		return res;
	}
	//2
	static int maior(int a, int b) {
		if(a>b) {
			return a;
		}
		else {
			return b;
		}
	}
	//3
	static int mmc(int a, int b) {
		if(a==0||b==0) return 0;
		int maior = maior(a,b);
		int res=maior;
		//procurando um valor que seja divisivel pelos dois... comecando com o maior
		while(res%a!=0 || res%b!=0) {
			res=soma(res,maior);
		}
		return res;
	}
	//4
	static void printaVet(int[] vet) {
		//implementacao da funcao
		System.out.print("vetor:");
		for (int elemento : vet) {
			System.out.print(elemento+" ");
		}
		System.out.println("");
	}
	//5
	static int[] leVet(int tam) {
		Scanner in = new Scanner(System.in);
		int[] vet = new int[tam];
		for(int i=0;i<tam;i++) {
			System.out.print("digite o valor da pos "+i+":");
			vet[i] = in.nextInt();
		}
		return vet;
	}
	//6
	static int maiorVet(int[] vet) {
		int maior = vet[0];
		for (int i=0;i<vet.length;i++ ) {
			if (vet[i]>maior) maior = vet[i];
		}
		return maior;
	}
	static void trocaVet(int[] vet, int posa, int posb) {
		int aux = vet[posa];
		vet[posa] = vet[posb];
		vet[posb] = aux;
	}
	//7
	static void inverteVet(int[] vet) {
		for(int i=0;i<vet.length/2;i++) {
			trocaVet(vet, i, vet.length-1-i);
		}
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Digite a base:");
		int base = in.nextInt();
		System.out.println("Digite o expoente:");
		int expoente = in.nextInt();
		int res = pot(base,expoente);
		System.out.println("A potencia é:"+res);
		
		int[] vet = leVet(5);
		printaVet(vet);
		inverteVet(vet);
		System.out.println("o valor maior e:"+maiorVet(vet));
		printaVet(vet);
	}

}


