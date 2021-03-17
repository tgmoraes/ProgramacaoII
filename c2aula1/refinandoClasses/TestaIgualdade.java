package c2aula1.refinandoClasses;

public class TestaIgualdade {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Iago");
		Pessoa p2 = new Pessoa("Iago");
		String nome1 = new String("teste");
		String nome2 = new String("teste");
				
		//equals herdado
		System.out.println("teste Pessoa equals:"+p2.equals(p1));
		System.out.println("teste Pessoa equals null:"+p2.equals(null));
		System.out.println("teste Pessoa ==:"+(p2==p1));
		
		//identidade String
		System.out.println("teste string ==:"+ (nome1 == nome2));
		//igualdade de strings
		System.out.println("teste string equals:"+nome1.equals(nome2));
	}
}
