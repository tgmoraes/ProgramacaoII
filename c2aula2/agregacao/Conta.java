package c2aula2.agregacao;

public class Conta {
	private int limite;
	private double saldo;
	//agregacao entre conta e cliente um para um
	private Cliente titular;
	
	
	//construtores
	public Conta(int limite, double saldo, Cliente titular) {
		this.setTitular(titular);
		this.setLimite(limite);
		this.saldo = saldo;
	}
	public Conta(int limite) {
		this.setTitular(null);
		this.setLimite(limite);
		this.saldo = 0;
	}
	//getters e setters
	public Cliente getTitular() {
		return this.titular;
	}
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	public int getLimite() {
		return this.limite;
	}
	public void setLimite(int limite) {
		this.limite = limite;
	}
	public double getSaldo() {
		return this.saldo;
	}
	public double getSaldoDisponivel() {
		return this.saldo+this.limite;
	}
	//outros métodos
	public void deposita(double valor) {
		this.saldo += valor;
	}
	public void saca(double valor) {
		if(valor<=(this.getSaldoDisponivel())) {
			this.saldo -= valor;
		}
	}
}
