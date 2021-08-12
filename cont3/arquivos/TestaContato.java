package cont3.arquivos;

import java.time.LocalDate;
import java.util.List;

public class TestaContato {
	public static void main(String[] args) {
		Contato c1 = new Contato(3,"Lázaro","lazinho@hotmail.com",
				"55 934486678", LocalDate.of(2005, 11, 19));
		Contato c2 = new Contato(4,"Luisa Sem Posse","semfama@gmail.com",
				"54 678586471", LocalDate.of(1995, 3, 1));
		
		GravadorContato pc = new GravadorContato();
		pc.insereNoFim(c1);
		pc.insereNoFim(c2);
		
		List<Contato> contatos = pc.lista();
		for(Contato c:contatos) {
			System.out.println(c);
		}
		
		
	}
}
