package Controle;

/*
Sintese
Objetivo: Classe denominada Controle Comida para controlar a classe Comida do pacote modelo; 
*/

import Modelo.Comida;

/**
 * Classe denominada Controle Comida, tem como fun��o ligar os atributos 
 * da classe comida no pacote modelo
 * com o pacote View.
 * 
 * @author HITER E KLYSSMANN
 * @version 1.0 [Maio 2021]
 * 
 */
public class ControleComida {
	private Comida comida = new Comida(); // Instancia��o da classe comida do pacote modelo

	/**
	 * Construtor da Classe Controle Comida.
	 * @param comida Comida selecionada para adicionar/editar os atributos.
	 */
	public ControleComida(Comida comida) {
		this.comida = comida;
	}

	/**
	 * Retorna a descri��o da comida.
	 * @return Retorna uma String com a descri��o da comida.
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
	 * Insere uma descri��o na comda selecionada.
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
	 * Retorna se a comida � um prato principal ou n�o.
	 * @return Retorna verdadeiro ou false caso a comida seja um prato principal.
	 */
	public boolean isPrincipal() {
		return comida.isPrincipal();
	}

	/**
	 * Insere se a comida � um prato principal ou n�o.
	 * @param bebidaQuente Boolean que configura se a comida � um prato principal ou n�o.
	 */
	public void setPrincipal(boolean principal) {
		comida.setPrincipal(principal);
	}

	/**
	 * Retorna o valor unit�rio da comida selecionada.
	 * @return Retorna um double com o valor unit�rio da comida.
	 */
	public double getValorUnitarioOrcamento() {
		return comida.getValorUnitario();
	}

	/**
	 * Insere o valor unit�ro da comida selecionada.
	 * @param valorUnitario Double com o valor unit�rio da comida.
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
	 * Retorna se a comida � considerada um prato degustativo ou n�o.
	 * @return Retorna verdadeiro se a comida for um prato degustativo e falso se n�o.
	 */
	public boolean isDegustativo() {
		return comida.isDegustativo();
	}

	/**
	 * Insere se a comida � considerada um prato degustativo ou n�o.
	 * @param alcoolico Boolean com verdadeiro se a comida
	 * for um prato degustativo e falso caso contr�rio.
	 */
	public void setDegustativo(boolean degustativo) {
		comida.setDegustativo(degustativo);
	}

	/**
	 * Retorna se a comida � considerada uma sobremesa ou n�o.
	 * @return Retorna verdadeiro se a comida for uma sobremesa e falso se n�o.
	 */
	public boolean isSobremesa() {
		return comida.isSobremesa();
	}

	/**
	 * Insere se a comida � considerada uma sobremesa ou n�o.
	 * @param alcoolico Boolean com verdadeiro se a comida
	 * for uma sobremesa e falso caso contr�rio.
	 */
	public void setSobremesa(boolean sobremesa) {
		comida.setSobremesa(sobremesa);
	}

}
