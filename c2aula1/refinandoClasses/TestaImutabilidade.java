package c2aula1.refinandoClasses;

public class TestaImutabilidade {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Iago");
		Pessoa p2 = new Pessoa("Iago");
		
		//testando o final -- imutabilidade do objeto
		//p.setNome("Julio");
		
		//testando o toString herdado de object
		System.out.println(p1);
		System.out.println(p2);			
		}
}
