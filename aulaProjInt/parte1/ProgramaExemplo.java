package aulaProjInt.parte1;

import java.util.Scanner;

class ProgramaExemplo {
	static void printaMenu(String[] opcoes) {
		System.out.println("<-- Menu -->");
		for(int i=0;i<opcoes.length;i++){
			System.out.println("("+i+")"+opcoes[i]);
		}
		System.out.println("Digite a opcao desejada (de 0 a "+opcoes.length+"):");
	}
	static int montaTelaMenu(String[] opcoes) {
		Scanner in = new Scanner(System.in);
		int ret =-1;
		while(ret<0 || ret >=opcoes.length) {
			printaMenu(opcoes);
			ret = in.nextInt();
		}
		return ret;
	}
	static Moto iniciaMoto() {
		Scanner inp = new Scanner(System.in);
		System.out.println("Olá, bem-vindo ao software da sua motocicleta!\n");
		System.out.print("Para começar, informe o modelo de sua moto:");
		Moto m = new Moto();
		m.modelo = inp.nextLine();
		m.velocidade=0;
		m.odometro=0;
		return m;
	}
	static void telaAlteraVelocidade(Moto m, boolean acelerar) {
		Scanner inp = new Scanner(System.in);
		if(acelerar) {
			System.out.print("digite quantos km/h acelerar:");
			m.acelera(inp.nextInt());
		}
		else {
			System.out.print("digite quantos km/h frear:");
			m.freia(inp.nextInt());
		}
	}
	static void telaEstado(Moto m) {
		System.out.println(m.getEstado());
		System.out.println("digite algo para continuar...");
		Scanner inp = new Scanner(System.in);
		inp.nextLine();
	}
	public static void main(String[] args) {
		Moto m = iniciaMoto();
		String[] opcoesPrincipal = {"sair",
				"acelerar a moto",
				"freiar a moto",
				"ver estado da moto",
				"passa turno (1h)"};
		
		int opcaoEscolhida = -1; //inicializa a variavel com qualquer valor diferente de zero
		while (opcaoEscolhida!=0) {
			opcaoEscolhida = montaTelaMenu(opcoesPrincipal);
			switch (opcaoEscolhida) {
				case 1: telaAlteraVelocidade(m, true); break;
				case 2:	telaAlteraVelocidade(m, false); break;
				case 3:	telaEstado(m); break;
				case 4:	m.passaTempo(1); break;
			}		
		}
		System.out.println("Tchau! Até mais!");
	}
}
