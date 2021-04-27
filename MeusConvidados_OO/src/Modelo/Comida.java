package Modelo;

/**
 * Classe denominada Comida. Tem como objetivo descrever as informações da
 * comida do evento. Uma classe que herda da classe Orçamento.
 * 
 * @author HITER E KLYSSMANN
 * @version 1.0 [Maio 2021]
 * 
 */

public class Comida extends Orcamento {
	private int quantidade; // quantidade
	private double valorUnitario; // valor unitario, caso haja mais de um
	private boolean principal; // classificar se a comida se encaixa em prato principal
	private boolean degustativo; // classificar se a comida se encaixa em prato degustativo
	private boolean sobremesa; // classificar se a comida se encaixa em prato sobremesa

	/**
	 * Construtor da Classe Comida.
	 * 
	 * @param tipo.       Inteiro que indica o tipo do orçamento (1 - Bebida, 2 -
	 *                    Comida, 3 - Infraestrutura, 4 - Música).
	 * @param descricao.  String que realiza a descrição da comida.
	 * @param valorTotal. Double que indica o valor total das comidas para o evento.
	 */

	public Comida(int tipo, String descricao, double valorTotal) {
		super(tipo, descricao, valorTotal);
	}

	/**
	 * Construtor da Classe Comida com sobrecarga
	 * 
	 * @param tipo.          Inteiro que indica o tipo do orçamento (1 - Bebida, 2 -
	 *                       Comida, 3 - Infraestrutura, 4 - Música).
	 * @param descricao.     String que realiza a descrição da comida.
	 * @param quantidade.    Inteiro que indica a quantidade de comidas que será
	 *                       utilizada no evento.
	 * @param valorUnitario. Double que mostra o valor de cada comida que será
	 *                       utilizada no evento.
	 * @param valorTotal.    Double que indica o valor total das comidas para o
	 *                       evento.
	 * @param principal.     Boolean que indica se a comida é o prato principal ou
	 *                       não.
	 * @param degustativo.   Boolean que indica se a comida é um prato degustativo
	 *                       ou não.
	 * @param sobremesa.     Boolean que indica se a comida é uma sobremessa ou não.
	 */

	public Comida(int tipo, String descricao, int quantidade, double valorUnitario, double valorTotal,
			boolean principal, boolean degustativo, boolean sobremesa) {
		super(tipo, descricao, valorTotal);
		this.quantidade = quantidade;
		this.valorUnitario = valorUnitario;
		this.principal = principal;
		this.degustativo = degustativo;
		this.sobremesa = sobremesa;
	}

	/**
	 * Construtor padrão da Classe Comida. Sem parâmetros de entradas.
	 */
	
	public Comida() {
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
