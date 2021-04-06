package Modelo;

/*
Sintese
Objetivo: Classe denominada Comida para descrever as informaçoes da comida do evento; 
*/

public class Comida extends Orcamento {
	private int quantidade; // quantidade
	private double valorUnitario; // valor unitario, caso haja mais de um
	private boolean principal; // classificar se a comida se encaixa em prato principal
	private boolean degustativo; // classificar se a comida se encaixa em prato degustativo
	private boolean sobremesa; // classificar se a comida se encaixa em prato sobremesa

	/*
	 * Objetivo: Construtor da Classe Comida; 
	 * Entrada : descricao e valorTotal;
	 * 
	 */
	public Comida(String descricao, double valorTotal) {
		super(descricao, valorTotal);
	}
	
	/*
	 * Objetivo: Construtor da Classe Bebida (sobrecarga); 
	 * Entrada : descricao, quantidade, valorTotal, valorUnitario, principal, degustativo, sobremesa;
	 */
	public Comida(String descricao, double valorTotal, int quantidade, double valorUnitario, boolean principal, boolean degustativo, boolean sobremesa) {
		super(descricao, valorTotal);
		this.quantidade = quantidade;
		this.valorUnitario = valorUnitario;
		this.principal = principal;
		this.degustativo = degustativo;
		this.sobremesa = sobremesa;
	}

	/*
	 * Objetivo: Retorna a uma string; 
	 * Saida: descrição, quantidade, valorUnitario, valorTotal;
	 * 
	 */
	public String toString() {
		return "Orçamento: " + descricao + "\nQuantidade: " + quantidade + "\nValor unitário: R$ " + valorUnitario
				+ "\nValor total: R$ " + valorTotal;
	}

	/*
	 * Objetivo: Getters e Setters referentes a Comida;
	 * 
	 */
	// get da quantidade
	public int getQuantidade() {
		return quantidade;
	}
	
	// set da quantidade
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	// get do valor unitario
	public double getValorUnitario() {
		return valorUnitario;
	}

	// set do valor unitario
	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	// get do prato principal: True se for prato principal e false se não for
	public boolean isPrincipal() {
		return principal;
	}

	// set do prato principal
	public void setPrincipal(boolean principal) {
		this.principal = principal;
	}

	// get do prato degustativo: True se for prato degustativo e false se não for
	public boolean isDegustativo() {
		return degustativo;
	}

	// set do prato degustativo:
	public void setDegustativo(boolean degustativo) {
		this.degustativo = degustativo;
	}

	// get do prato sobremesa: True se for prato sobremesa e false se não for
	public boolean isSobremesa() {
		return sobremesa;
	}

	// set do prato sobremesa:
	public void setSobremesa(boolean sobremesa) {
		this.sobremesa = sobremesa;
	}
	
}
