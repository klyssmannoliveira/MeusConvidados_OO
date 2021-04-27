package Modelo;

/**
 * Classe denominada Bebida que herda da classe Orcamento, tem como objetivo descrever as informa��es de
 * bebida do evento.
 * 
 * @author HITER E KLYSSMANN
 * @version 1.0 [Maio 2021]
 * 
 */

public class Bebida extends Orcamento {

	private int quantidade; // quantidade de bebidas;
	private double valorUnitario; // valor unitario de cada bebida do evento;
	private boolean alcoolico; // se a bebida for alcoolica ou n�o;
	private boolean bebidaQuente; // se a bebida for quente ou n�o;

	/**
	 * Construtor da Classe Bebida.
	 * 
	 * @param tipo       Inteiro que indica o tipo do or�amento (1 - Bebida, 2 -
	 *                    Comida, 3 - Infraestrutura, 4 - M�sica).
	 * @param descricao  String que realiza a descri��o da bebida.
	 * @param valorTotal Double que indica o valor total das bebidas para o evento.
	 */

	public Bebida(int tipo, String descricao, double valorTotal) {
		super(tipo, descricao, valorTotal);
	}

	/**
	 * Construtor da Classe Bebida realizando uma sobrecarga.
	 * 
	 * @param tipo          Inteiro que indica o tipo do or�amento (1 - Bebida, 2 -
	 *                       Comida, 3 - Infraestrutura, 4 - M�sica).
	 * @param descricao     String que realiza a descri��o da bebida.
	 * @param quantidade    Inteiro que indica a quantidade de bebidas que ser�
	 *                       utilizada no evento.
	 * @param valorUnitario Double que mostra o valor de cada bebida que ser�
	 *                       utilizada no evento.
	 * @param valorTotal    Double que indica o valor total das bebidas para o
	 *                       evento.
	 * @param bebidaQuente  Boolean que indica se a bebida � quente ou n�o.
	 * @param alcoolico     Boolean que indica se a bebida � alcoolica ou n�o.
	 */

	public Bebida(int tipo, String descricao, int quantidade, double valorUnitario, double valorTotal,
			boolean bebidaQuente, boolean alcoolico) {
		super(tipo, descricao, valorTotal);
		this.quantidade = quantidade;
		this.valorUnitario = valorUnitario;
		this.alcoolico = alcoolico;
		this.bebidaQuente = bebidaQuente;
	}

	/**
	 * Construtor padr�o da Classe Bebida. Sem par�metros de entradas.
	 */

	public Bebida() {

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

	// get do boolean alcoolico referente a bebida: True se for alcoolico e false se
	// n�o for ;
	public boolean isAlcoolico() {
		return alcoolico;
	}

	// set do boolean alcoolico referente a bebida;
	public void setAlcoolico(boolean alcoolico) {
		this.alcoolico = alcoolico;
	}

	// get do boolean BebidaQuente referente a bebida: True se for bebida quente e
	// false se n�o for ;
	public boolean isBebidaQuente() {
		return bebidaQuente;
	}

	// set do boolean BebidaQuente referente a bebida;
	public void setBebidaQuente(boolean bebidaQuente) {
		this.bebidaQuente = bebidaQuente;
	}

}
