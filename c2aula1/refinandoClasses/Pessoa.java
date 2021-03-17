package c2aula1.refinandoClasses;

class Pessoa implements Comparable<Pessoa>{
	private final String nome;
	private static int qtdePessoasCriadas=0;
	
	public Pessoa(String nome) {
		this.nome=nome;
		Pessoa.qtdePessoasCriadas++;
	}
	public int getTotalPessoasCriadas() {
		return Pessoa.qtdePessoasCriadas;
	}
	public static int getPessoasCriadas() {
		return Pessoa.qtdePessoasCriadas;
	}
	//anotation @Override--> indica a sobrescrita do método toString 
	//da classe object. Toda classe herda de Object, ou seja, é um Object
	@Override 
	public String toString() {
		return "Pessoa: "+this.nome;
	}
	/*/ setNome não deve ser usado com atributos final
	public void setNome(String nome) {
		this.nome=nome;
	}
	*/
	@Override
	public boolean equals(Object o) {
		//se parâmetro é nulo então não é igual
		if(o==null) return false;
		//se parâmetro é object mas não é Pessoa, não é igual
		if(! (o.getClass().isInstance(this)) ) return false;
		//se a referência é a mesma então igual (é reflexivo)
		if(this==o) return true;
		
		//cast do object para Pessoa
		Pessoa par = (Pessoa)o;
		
		//lógica para verificar se duas pessoas são iguais (verificar se nomes são iguais)
		return this.nome.equals(par.nome);
	}
	@Override
	public int compareTo(Pessoa p) {
		// TODO Auto-generated method stub
		return this.nome.compareTo(p.nome);
	}
}
