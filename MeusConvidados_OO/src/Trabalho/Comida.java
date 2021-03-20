package Trabalho;

public class Comida extends Gasto {
	private int quantidade;
	private double valorUnitario;

	// Construtores
	public Comida(String descricao, double valorTotal) {
		super(descricao, valorTotal);
		// TODO Auto-generated constructor stub
	}
	
	// Sobracarga do construtor de comida
	public Comida(String descricao, double valorTotal, int quant) {
		super(descricao, valorTotal);
		quantidade = quant;
		valorUnitario = valorTotal / (double) quant;
	}

	public String toString() {
		return "Gasto: " + descricao + "\nQuantidade: " + quantidade + "\nValor unitário: R$ " + valorUnitario
				+ "\nValor total: R$ " + valorTotal;
	}

	// getters e setters
	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

}
