package c2aula1.refinandoClasses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TestaComparacao {
	static void printa(String[] nomes) {
		for(String nome:nomes) {
			System.out.print(nome+" ");
		}
	}
	
	public static void main(String[] args) {
		//ordenando vetor
		String[] nomes1 = {"bba","aab","aa"};
		System.out.println("vetor string desordenado:");
		printa(nomes1);
		//ordenando array
		Arrays.sort(nomes1);
		System.out.println("\nvetor string ordenado:");
		printa(nomes1);

		//ordena pois sabe comparar! A classe String assina o contrato de comparação!
		System.out.println("\ncomparacao de "+nomes1[0]+" com "+nomes1[1]+":"+
		nomes1[0].compareTo(nomes1[1]));
		System.out.println("comparacao de "+nomes1[0]+" com "+nomes1[2]+":"+
				nomes1[0].compareTo(nomes1[2]));
		System.out.println("comparacao de "+nomes1[2]+" com "+nomes1[0]+":"+
				nomes1[2].compareTo(nomes1[0]));
		System.out.println("comparacao de "+nomes1[2]+" com "+nomes1[2]+":"+
				nomes1[2].compareTo(nomes1[2]));

		//ordenando lista
		//tipo de nomes é obtido de maneira implícita, já se cria objeto do tipo ArrayList<String>
		var nomes2 = new ArrayList<String>();
		nomes2.add("bba");
		nomes2.add("aab");
		nomes2.add("aa");
		System.out.println("\nLista string desordenado:");
		System.out.println(nomes2);
		
		//ordenando array
		Collections.sort(nomes2);
		System.out.println("Lista string ordenado:");
		System.out.println(nomes2);
		
		
		var pessoas = new ArrayList<Pessoa>();
		pessoas.add(new Pessoa("Arlindo"));
		pessoas.add(new Pessoa("Aarão"));
		pessoas.add(new Pessoa("Ziraldo"));

		System.out.println("\nLista Pessoa desordenado:");
		System.out.println(pessoas);
		//ordenando array
		Collections.sort(pessoas);
		System.out.println("Lista Pessoa ordenado:");
		System.out.println(pessoas);
		
	}

}
