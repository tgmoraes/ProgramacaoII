package aulaP2.exercicios;

public class TestaLivro {

	public static void main(String[] args) {
		Livro l = new Livro("O senhor dos Anéis", 1000);
		
		
		System.out.println("teste:"+(l.getPagLidas()==0));
		
		boolean foiLido = l.ler(200);
		System.out.println("teste:"+(l.getPagLidas()==200));
		System.out.println("teste:"+(foiLido==false));
			
		foiLido=l.ler(900);
		System.out.println("teste:"+(l.getPagLidas()==1000));
		System.out.println("teste:"+(foiLido==true));
		
		l.recomeca();
		System.out.println("teste:"+(l.getPagLidas()==0));
		foiLido=l.ler(30);
		System.out.println("teste:"+(l.getPagLidas()==30));
		System.out.println("teste:"+(foiLido==false));
		
		l.ler(2000);
		
		System.out.println("teste:"+(l.getPagLidas()));
	}

}
