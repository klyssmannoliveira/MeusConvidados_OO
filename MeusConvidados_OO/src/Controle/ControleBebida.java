package Controle;

/*
Sintese
Objetivo: Classe denominada Controle Bebida para controlar a classe bebida do pacote modelo; 
*/

import Modelo.Bebida;

/**
 * Classe denominada Controle Bebida, tem como função ligar os atributos 
 * da classe bebida no pacote modelo
 * com o pacote View.
 * 
 * @author HITER E KLYSSMANN
 * @version 1.0 [Maio 2021]
 * 
 */

public class ControleBebida {

	private Bebida bebida = new Bebida(); // Instanciação da classe bebida do pacote modelo

	/**
	 * Construtor da Classe Controle Bebida.
	 * @param bebida Bebida selecionada para adicionar/editar os atributos.
	 */
	public ControleBebida(Bebida bebida) {
		this.bebida = bebida;
	}

	/**
	 * Retorna a descrição da bebida.
	 * @return Retorna uma String com a descrição da bebida.
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
	 * Insere uma descrição na bebida selecionada.
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
	 * Retorna se a bebida é quente ou não.
	 * @return Retorna verdadeiro ou false caso a bebida seja quente.
	 */
	public boolean isBebidaQuente() {
		return bebida.isBebidaQuente();
	}

	/**
	 * Insere se a bebida é quente ou não.
	 * @param bebidaQuente Boolean que configura se a bebida é quente ou não.
	 */
	public void setBebidaQuente(boolean bebidaQuente) {
		bebida.setBebidaQuente(bebidaQuente);
	}

	/**
	 * Retorna o valor unitário da bebida selecionada.
	 * @return Retorna um double com o valor unitário da bebida.
	 */
	public double getValorUnitarioOrcamento() {
		return bebida.getValorUnitario();
	}

	/**
	 * Insere o valor unitáro da bebida selecionada.
	 * @param valorUnitario Double com o valor unitário da bebida.
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
	 * Retorna se a bebida é considerada alcoólica ou não.
	 * @return Retorna verdadeiro se a bebida for alcoólica e falso se não.
	 */
	public boolean isAlcoolico() {
		return bebida.isAlcoolico();
	}

	/**
	 * Insere se a bebida é alcoólica ou não.
	 * @param alcoolico Boolean com verdadeiro se a bebida for alcoólica e falso caso contrário.
	 */
	public void setAlcoolico(boolean alcoolico) {
		bebida.setAlcoolico(alcoolico);
	}
}
