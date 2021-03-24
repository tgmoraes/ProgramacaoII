package c2aula2.heranca;

public class Estudante extends Pessoa {
	private String matricula; //maneira mais indicada para tributos sempre é private

	public Estudante(String nome, String matricula) {
		//usando constrututor da superclasse (Pessoa)
		super(nome);
		this.matricula = matricula;
	}

	@Override
	public String quemSou() {
		//usando metodo da superclasse (Pessoa)
		return super.quemSou() + " Também sou um estudante.";
	}
}
