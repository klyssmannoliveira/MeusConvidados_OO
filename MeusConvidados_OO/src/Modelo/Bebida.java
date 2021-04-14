package Modelo;

/*
Sintese
Objetivo: Classe denominada Bebida para descrever as informaçoes de bebida do evento; 
*/

public class Bebida extends Orcamento {
	private int quantidade; // quantidade de bebidas;
	private double valorUnitario; // valor unitario de cada bebida do evento;
	private boolean alcoolico; // se a bebida for alcoolica ou não;
	private boolean bebidaQuente; // se a bebida for quente ou não;

	/*
	 * Objetivo: Construtor da Classe Bebida; 
	 * Entrada : descricao e valorTotal;
	 * 
	 */
	public Bebida(int tipo, String descricao, double valorTotal) {
		super(tipo, descricao, valorTotal);
	}

	/*
	 * Objetivo: Construtor da Classe Bebida (sobrecarga); 
	 * Entrada : descricao, quantidade, valorTotal, valorUnitario, alcoolico, bebidaQuente;
	 */
	public Bebida(int tipo, String descricao, int quantidade, double valorTotal, double valorUnitario, boolean alcoolico,
			boolean bebidaQuente) {
		super(tipo, descricao, valorTotal);
		this.quantidade = quantidade;
		this.valorUnitario = valorUnitario;
		this.alcoolico = alcoolico;
		this.bebidaQuente = bebidaQuente;
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
	 * Objetivo: Getters e Setters referentes a Bebida;
	 * 
	 */

	// get da quantidade de bebida;
	public int getQuantidade() {
		return quantidade;
	}

	// set da quantidade de bebida;
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	// get do valor unitario de cada bebida;
	public double getValorUnitario() {
		return valorUnitario;
	}

	// set do valor unitario de cada bebida;
	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	// get do boolean alcoolico referente a bebida: True se for alcoolico e false se não for ;
	public boolean isAlcoolico() {
		return alcoolico;
	}

	// set do boolean alcoolico referente a bebida;
	public void setAlcoolico(boolean alcoolico) {
		this.alcoolico = alcoolico;
	}

	// get do boolean BebidaQuente referente a bebida: True se for bebida quente e false se não for ;
	public boolean isBebidaQuente() {
		return bebidaQuente;
	}

	// set do boolean BebidaQuente referente a bebida;
	public void setBebidaQuente(boolean bebidaQuente) {
		this.bebidaQuente = bebidaQuente;
	}

}
