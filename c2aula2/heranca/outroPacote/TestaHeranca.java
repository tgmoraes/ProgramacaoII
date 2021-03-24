package c2aula2.heranca.outroPacote;

import c2aula2.heranca.Estudante;
import c2aula2.heranca.Pessoa;

public class TestaHeranca {

	public static void main(String[] args) {
		Pessoa julio = new Pessoa("Julio");
		Estudante carlos = new Estudante("Carlos", "m1829");
		EstudanteSuperior maria = new EstudanteSuperior("Maria Rita", "s8273"); 
		
		System.out.println(julio.quemSou());
		System.out.println(carlos.quemSou());
		System.out.println(maria.quemSou());
		carlos.setNome("Carlos car loss");
		//estas linhas abaixo funcionarão se esta classe estiver no mesmo package de Pessoa (aula6.heranca)
		//System.out.println(julio.nome);	
		//System.out.println(carlos.nome);
	}

}
