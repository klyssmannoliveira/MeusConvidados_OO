package Trabalho;

public class Bebida extends Gasto {
	private int quantidade;
	private double valorUnitario;
	
	// Construtor de bebida
	public Bebida(String descricao, double valorTotal) { // Construtor de gasto
		super(descricao, valorTotal);
	}
	// Sobracarga do construtor de bebida
	public Bebida(String descricao, double valorTotal, int quant) {
		super(descricao, valorTotal);
		quantidade = quant;
		valorUnitario = valorTotal / (double) quant;
	}

	public String toString() {
		return "Gasto: " + descricao + "\nQuantidade: " + quantidade + "\nValor unit�rio: R$ " + valorUnitario
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
