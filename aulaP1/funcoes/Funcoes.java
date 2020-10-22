package aulaP1.funcoes;

public class Funcoes {
	static int soma(int a, int b) {
		return a+b;
	}
	static int multi(int a, int b) {
		int res = a;
		for(int i=b;i>1;i--) res= soma(a,res);
		return res;
	}
	public static void main(String[] args) {
		//testes de soma
		System.out.println(soma(5,10)==15);
		System.out.println(soma(5,-10)==-5);

		//teste de multi
		System.out.println(multi(5,10)==50);
		System.out.println(multi(10,5)==50);

		//System.out.println(multi(10,0)==0);
		//System.out.println(multi(0,5)==0);

	}
}
