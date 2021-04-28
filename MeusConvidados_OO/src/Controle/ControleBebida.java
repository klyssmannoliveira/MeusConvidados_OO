package Controle;

/*
Sintese
Objetivo: Classe denominada Controle Bebida para controlar a classe bebida do pacote modelo; 
*/

import Modelo.Bebida;

/**
 * Classe denominada Controle Bebida, tem como fun��o ligar os atributos 
 * da classe bebida no pacote modelo
 * com o pacote View.
 * 
 * @author HITER E KLYSSMANN
 * @version 1.0 [Maio 2021]
 * 
 */

public class ControleBebida {

	private Bebida bebida = new Bebida(); // Instancia��o da classe bebida do pacote modelo

	/**
	 * Construtor da Classe Controle Bebida.
	 * @param bebida Bebida selecionada para adicionar/editar os atributos.
	 */
	public ControleBebida(Bebida bebida) {
		this.bebida = bebida;
	}

	/**
	 * Retorna a descri��o da bebida.
	 * @return Retorna uma String com a descri��o da bebida.
	 */
	public String getDescricao() {
		return bebida.getDescricao();
	}

	/**
	 * Retorna o valor total da bebida.
	 * @return Retorna um double com a o valor total da bebida.
	 */
	public double getValorTotalOrcamento() {
		return bebida.getValorTotal();
	}

	/**
	 * Insere uma descri��o na bebida selecionada.
	 * @param descricao String que descreve a bebida.
	 */
	public void setDescricao(String descricao) {
		bebida.setDescricao(descricao);
	}

	/**
	 * Insere o valor total da bebida selecionada.
	 * @param valorTotal Double com o valor total da bebida.
	 */
	public void setValorTotal(double valorTotal) {
		bebida.setValorTotal(valorTotal);
	}

	/**
	 * Retorna se a bebida � quente ou n�o.
	 * @return Retorna verdadeiro ou false caso a bebida seja quente.
	 */
	public boolean isBebidaQuente() {
		return bebida.isBebidaQuente();
	}

	/**
	 * Insere se a bebida � quente ou n�o.
	 * @param bebidaQuente Boolean que configura se a bebida � quente ou n�o.
	 */
	public void setBebidaQuente(boolean bebidaQuente) {
		bebida.setBebidaQuente(bebidaQuente);
	}

	/**
	 * Retorna o valor unit�rio da bebida selecionada.
	 * @return Retorna um double com o valor unit�rio da bebida.
	 */
	public double getValorUnitarioOrcamento() {
		return bebida.getValorUnitario();
	}

	/**
	 * Insere o valor unit�ro da bebida selecionada.
	 * @param valorUnitario Double com o valor unit�rio da bebida.
	 */
	public void setValorUnitario(double valorUnitario) {
		bebida.setValorUnitario(valorUnitario);
	}

	/**
	 * Retorna a quantidade da bebida selecionada.
	 * @return Retorna um inteiro com a quantidade da bebida selecionada.
	 */
	public int getValorQuantidadeOrcamento() {
		return bebida.getQuantidade();
	}

	/**
	 * Insere a quantidade da bebida selecionada.
	 * @param quantidade Inteiro com a quantidade de bebida.
	 */
	public void setQuantidade(int quantidade) {
		bebida.setQuantidade(quantidade);
	}

	/**
	 * Retorna se a bebida � considerada alco�lica ou n�o.
	 * @return Retorna verdadeiro se a bebida for alco�lica e falso se n�o.
	 */
	public boolean isAlcoolico() {
		return bebida.isAlcoolico();
	}

	/**
	 * Insere se a bebida � alco�lica ou n�o.
	 * @param alcoolico Boolean com verdadeiro se a bebida for alco�lica e falso caso contr�rio.
	 */
	public void setAlcoolico(boolean alcoolico) {
		bebida.setAlcoolico(alcoolico);
	}
}
