package c2aula2.composicao;

public class ItemNF {
	private String descricao;
	private double preco;
	private int quantidade;
	//construtor
	public ItemNF(String desc, int qtde, double preco) {
		this.descricao = desc;
		this.preco = preco;
		this.quantidade =qtde;
	}
	//getters e setters
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public double getValorTotal() {
		return this.quantidade*this.preco;
	}
}
