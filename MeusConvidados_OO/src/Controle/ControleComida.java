package Controle;

/*
Sintese
Objetivo: Classe denominada Controle Comida para controlar a classe Comida do pacote modelo; 
*/

import Modelo.Comida;


/**
 * Classe denominada Controle Comida, tem como função ligar os atributos 
 * da classe comida no pacote modelo
 * com o pacote View.
 * 
 * @author HITER E KLYSSMANN
 * @version 1.0 [Maio 2021]
 * 
 */
public class ControleComida {
	private Comida comida = new Comida(); // Instanciação da classe comida do pacote modelo

	/**
	 * Construtor da Classe Controle Comida.
	 * @param comida Comida selecionada para adicionar/editar os atributos.
	 */
	public ControleComida(Comida comida) {
		this.comida = comida;
	}

	/**
	 * Retorna a descrição da comida.
	 * @return Retorna uma String com a descrição da comida.
	 */
	public String getDescricao() {
		return comida.getDescricao();
	}

	/**
	 * Retorna o valor total da comida.
	 * @return Retorna um double com a o valor total da comida.
	 */
	public double getValorTotalOrcamento() {
		return comida.getValorTotal();
	}

	/**
	 * Insere uma descrição na comda selecionada.
	 * @param descricao String que descreve a comida.
	 */
	public void setDescricao(String descricao) {
		comida.setDescricao(descricao);
	}

	/**
	 * Insere o valor total da comida selecionada.
	 * @param valorTotal Double com o valor total da comida.
	 */
	public void setValorTotal(double valorTotal) {
		comida.setValorTotal(valorTotal);
	}

	/**
	 * Retorna se a comida é um prato principal ou não.
	 * @return Retorna verdadeiro ou false caso a comida seja um prato principal.
	 */
	public boolean isPrincipal() {
		return comida.isPrincipal();
	}

	/**
	 * Insere se a comida é um prato principal ou não.
	 * @param principal Boolean que configura se a comida é um prato principal ou não.
	 */
	public void setPrincipal(boolean principal) {
		comida.setPrincipal(principal);
	}

	/**
	 * Retorna o valor unitário da comida selecionada.
	 * @return Retorna um double com o valor unitário da comida.
	 */
	public double getValorUnitarioOrcamento() {
		return comida.getValorUnitario();
	}

	/**
	 * Insere o valor unitáro da comida selecionada.
	 * @param valorUnitario Double com o valor unitário da comida.
	 */
	public void setValorUnitario(double valorUnitario) {
		comida.setValorUnitario(valorUnitario);
	}

	/**
	 * Retorna a quantidade da comida selecionada.
	 * @return Retorna um inteiro com a quantidade da comida selecionada.
	 */
	public int getValorQuantidadeOrcamento() {
		return comida.getQuantidade();
	}

	/**
	 * Insere a quantidade da comida selecionada.
	 * @param quantidade Inteiro com a quantidade de comida.
	 */
	public void setQuantidade(int quantidade) {
		comida.setQuantidade(quantidade);
	}

	/**
	 * Retorna se a comida é considerada um prato degustativo ou não.
	 * @return Retorna verdadeiro se a comida for um prato degustativo e falso se não.
	 */
	public boolean isDegustativo() {
		return comida.isDegustativo();
	}

	/**
	 * Insere se a comida é considerada um prato degustativo ou não.
	 * @param degustativo Boolean com verdadeiro se a comida
	 * for um prato degustativo e falso caso contrário.
	 */
	public void setDegustativo(boolean degustativo) {
		comida.setDegustativo(degustativo);
	}

	/**
	 * Retorna se a comida é considerada uma sobremesa ou não.
	 * @return Retorna verdadeiro se a comida for uma sobremesa e falso se não.
	 */
	public boolean isSobremesa() {
		return comida.isSobremesa();
	}

	/**
	 * Insere se a comida é considerada uma sobremesa ou não.
	 * @param sobremesa Boolean com verdadeiro se a comida
	 * for uma sobremesa e falso caso contrário.
	 */
	public void setSobremesa(boolean sobremesa) {
		comida.setSobremesa(sobremesa);
	}

}
