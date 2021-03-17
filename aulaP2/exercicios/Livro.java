package aulaP2.exercicios;

public class Livro{
	private String titulo;
	private int paginas;    //paginas do livro
	private int pagLidas;     //paginas lidas do livro
	
	//construtores
	public Livro(String titulo) {
		this.titulo = titulo;
		this.pagLidas=0;
	}
	public Livro(String titulo, int pags) {
		this.titulo = titulo;
		this.pagLidas=0;
		this.paginas= pags;
	}
	public Livro() {
		this.titulo = titulo;
		this.pagLidas=0;
	}
	//getters: retornam os valores de atributos privados
	public String getTitulo() {
		return this.titulo;
	}
	public int getPaginas() {
		return this.paginas;
	}
	public int getPagLidas() {
		return this.pagLidas;
	}
	//setter: alterar os valores de atributos privados
	public void setTitulo (String titulo) {
		this.titulo=titulo;
	}
	public void setPaginas(int pags) {
		this.paginas = pags;
	}
	
	//metodo recomeca:
	public void recomeca(){
	    this.pagLidas= 0;
	}
	//ler
	public boolean ler(int pagLidas) {
	    if(pagLidas+this.pagLidas < this.paginas){
	      this.pagLidas +=  pagLidas;
	      return false;
	    }
	    else{
	      this.pagLidas=this.paginas;
	      return true;
	    }
	  }
	}
