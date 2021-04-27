package Modelo;

/**
 * Classe denominada Orcamento. Tem como objetivo descrever os or�amentos
 * (gastos) do evento. Uma classe que pai das classes Musica, Infraestrutura,
 * Bebida e Comida.
 * 
 * @author HITER E KLYSSMANN
 * @version 1.0 [Maio 2021]
 * 
 */

public class Orcamento {
	protected String descricao; // descricao do gasto
	protected double valorTotal; // valor total do gasto
	protected int tipo; // se tipo == 1: bebida, tipo == 2: comida; tipo == 3: infraestrutura; tipo ==
						// 4: musica;

	/**
	 * Construtor da Classe Orcamento.
	 * 
	 * @param tipo.       Inteiro que indica o tipo do or�amento (1 - Bebida, 2 -
	 *                    Comida, 3 - Infraestrutura, 4 - M�sica).
	 * @param descricao.  String que realiza a descri��o do or�amento.
	 * @param valorTotal. Double que indica o valor total em reais do or�amento do
	 *                    evento.
	 */

	public Orcamento(int tipo, String descricao, double valorTotal) {
		this.descricao = descricao;
		this.valorTotal = valorTotal;
		this.tipo = tipo;
	}

	/**
	 * Construtor padr�o da Classe Orcamento. Sem par�metros de entradas.
	 */

	public Orcamento() {

	}

	/*
	 * Objetivo: Getters e Setters referentes ao evento;
	 */

	// get da descricao
	public String getDescricao() {
		return descricao;
	}

	// set da descricao
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	// get do valor total
	public double getValorTotal() {
		return valorTotal;
	}

	// set do valor total
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	// get tipo
	public int getTipo() {
		return tipo;
	}

	// set tipo
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

}
