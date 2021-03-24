package c2aula2.agregacao;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Cliente {
	private String nome;
	private LocalDate dataNascimento;
	private double rendaMensal;

	//construtores
	public Cliente () {
	}
	public Cliente(String nome, double rendaMensal) {
		this.nome = nome;
		this.rendaMensal = rendaMensal;
	}
	//getters e setters
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getRendaMensal() {
		return this.rendaMensal;
	}
	public void setRendaMensal(double rendaMensal) {
		this.rendaMensal = rendaMensal;
	}
	public void setDataNascimento(int dia, int mes, int ano) {
		this.dataNascimento= LocalDate.of(ano, mes, dia);
	}
	public String getDataNascimento() {
		//10 de fevereiro de 2021
		DateTimeFormatter f = DateTimeFormatter.ofPattern("dd 'de' LLLL 'de' YYYY");
		return this.dataNascimento.format(f);
	}
	public int getIdade() {
		LocalDate hoje = LocalDate.now();
		Period p = Period.between(this.dataNascimento,hoje);
		return p.getYears();
	}
}
