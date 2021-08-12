package cont3.arquivos;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class GravadorContato {
	private Path arquivo;
	private Charset encode;

	public GravadorContato() {
		Path pasta = Paths.get("arquivos","dados");
		this.arquivo = pasta.resolve("contato.csv");
		this.encode = Charset.forName("UTF-8");
		try{
			if(!Files.exists(pasta)) {
				Files.createDirectory(pasta);
			}
			if(!Files.exists(this.arquivo)) {
				Files.createFile(this.arquivo);
			}
		} catch (IOException e) {
			System.out.println(e);
			throw new RuntimeException("Erro: problemas ao abrir o arquivo:");
		}
	}
	public void insereNoFim(Contato c) {
		//formato: id;nome;email;telefone;dataNascimento
		DateTimeFormatter formater = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String aux = c.getId()+";"+c.getNome()+";"+
				c.getEmail()+";"+c.getTelefone()+";"+
				c.getDataNascimento().format(formater)+"\n";
		try{
			Files.writeString(this.arquivo, aux, StandardOpenOption.APPEND);
		} catch (IOException e) {
			System.out.println(e);
			throw new RuntimeException("Erro: problemas ao abrir o arquivo:");
		}
	}
	public String leUmaLinha()  {
		try{
			BufferedReader leitor = Files.newBufferedReader(this.arquivo);
			return leitor.readLine();
		}catch (IOException e) {
			System.out.println(e);
			throw new RuntimeException("Erro: problemas ao abrir o arquivo:");
		}
	}
	public List<Contato> lista(){
		List<String> dadosArquivo;
		List<Contato> contatos = new ArrayList<>();
		try {
			dadosArquivo = Files.readAllLines(this.arquivo, this.encode);
		}catch (IOException e) {
			System.out.println(e);
			throw new RuntimeException("Erro: problemas ao abrir o arquivo:");
		}
		for(String linha: dadosArquivo) {
			String[] campos = linha.split(";");
			Contato c = new Contato();
			//formato: id;nome;email;telefone;dataNascimento
			c.setId(Integer.parseInt(campos[0]));
			c.setNome(campos[1]);
			c.setEmail(campos[2]);
			c.setTelefone(campos[3]);
			String[] data = campos[4].split("/");
			c.setDataNascimento(LocalDate.of(
					Integer.parseInt(data[2]),
					Integer.parseInt(data[1]),
					Integer.parseInt(data[0])));
			contatos.add(c);
		}
		return contatos;
	}
}
