package c2aula2.composicao;

import java.time.LocalDateTime;
import java.util.ArrayList;
public class NotaFiscal {
	private LocalDateTime dataHoraVenda;
	//associacao entre as classes (composição) NotaFiscal e ItemNF => um para muitos (1..*)
	private ArrayList<ItemNF> itens;	

	//construtor
	public NotaFiscal() {
		this.setDataHoraVenda(LocalDateTime.now());
		this.itens = new ArrayList<>();
	}
	
	//getters e setters
	public LocalDateTime getDataHoraVenda() {
		return dataHoraVenda;
	}
	
	public void setDataHoraVenda(LocalDateTime dataHoraVenda) {
		this.dataHoraVenda = dataHoraVenda;
	}
	
	//métodos que manipulam a lista de itens
	public void addItem(String desc, int qtde, double preco) {
		//os itens da nota são criados pela nota, só existem existindo uma nota 
		ItemNF i = new ItemNF(desc,qtde,preco);
		this.itens.add(i);
	}
	//total de itens na nota
	public int getTotalItens() {
		return this.itens.size();
	}
	//valor total da nota
	public double getTotalNota() {
		double sum=0;
		for(ItemNF elem: itens) sum+= elem.getValorTotal();
		return sum;
	}
}
