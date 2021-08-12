package cont3.arquivos;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class TestaArquivo{
	public static void main(String[] args) throws IOException {
		
		System.out.println(File.separatorChar);
		// linux /
		// windows \
		Path diretorio = Paths.get("/home","tgm");
		System.out.println(Files.exists(diretorio));
		
		GerenciaArquivo gerArq = new GerenciaArquivo();
		
		gerArq.criaDiretorio("novo dir");
		System.out.println(gerArq.listaDiretorio());
		
		gerArq.criaArquivo("temp.jpg");
		gerArq.criaArquivo("temp2.csv");
		gerArq.copiaParaInterna("temp.jpg");
		gerArq.moveParaInterna("temp2.csv");
		gerArq.apagaArquivo("arquivo.txt");
		System.out.println(gerArq.listaDiretorio());
		
	}
}
