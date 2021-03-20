package Trabalho;

public abstract class Gasto {
	protected String descricao;
	protected double valorTotal;
	
	// Construtores
	public Gasto(String descricao, double valorTotal) {
		this.descricao = descricao;
		this.valorTotal = valorTotal;
	}
	
	// To string
	public String toString() {
		return "Gasto: " + descricao + "\nValor total: R$" + valorTotal;
	}

	// getters e setters
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

}

