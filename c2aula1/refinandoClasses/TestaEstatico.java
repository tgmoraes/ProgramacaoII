package c2aula1.refinandoClasses;

public class TestaEstatico {
	public static void main(String[] args) {
		System.out.println(Pessoa.getPessoasCriadas());
		
		Pessoa p1 = new Pessoa("Iago");
		System.out.println(Pessoa.getPessoasCriadas());
		
		Pessoa p2 = new Pessoa("Iago");
		
		System.out.println(Pessoa.getPessoasCriadas());
		System.out.println(p2.getPessoasCriadas());
		System.out.println(p1.getTotalPessoasCriadas());
	}
}
