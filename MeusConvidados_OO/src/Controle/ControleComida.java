package Controle;

/*
Sintese
Objetivo: Classe denominada Controle Comida para controlar a classe Comida do pacote modelo; 
*/

import Modelo.Comida;

public class ControleComida {
	private Comida comida = new Comida(); // Instanciação da classe comida do pacote modelo

	/*
	 * Objetivo: Construtor da Classe controle Comida. Entrada : Comida comida;
	 * 
	 */
	public ControleComida(Comida comida) {
		this.comida = comida;
	}

	// get Descrição
	public String getDescricao() {
		return comida.getDescricao();
	}

	// get Valor Total Orcamento
	public double getValorTotalOrcamento() {
		return comida.getValorTotal();
	}

	// set Descricao
	public void setDescricao(String descricao) {
		comida.setDescricao(descricao);
	}

	// set Valor total
	public void setValorTotal(double valorTotal) {
		comida.setValorTotal(valorTotal);
	}

	// Is do parto Principal
	public boolean isPrincipal() {
		return comida.isPrincipal();
	}

	// set do prato principal
	public void setPrincipal(boolean principal) {
		comida.setPrincipal(principal);
	}

	// get Valor Unitario Orcamento
	public double getValorUnitarioOrcamento() {
		return comida.getValorUnitario();
	}

	// set do valor Unitario
	public void setValorUnitario(double valorUnitario) {
		comida.setValorUnitario(valorUnitario);
	}

	// get Valor Quantidade Orcamento
	public int getValorQuantidadeOrcamento() {
		return comida.getQuantidade();
	}

	// set Quantidade
	public void setQuantidade(int quantidade) {
		comida.setQuantidade(quantidade);
	}

	// Is do parato desgutativo
	public boolean isDegustativo() {
		return comida.isDegustativo();
	}

	// set do prato degustativo:
	public void setDegustativo(boolean degustativo) {
		comida.setDegustativo(degustativo);
	}

	// Is do parto sobremessa
	public boolean isSobremesa() {
		return comida.isSobremesa();
	}

	// set do prato sobremesa:
	public void setSobremesa(boolean sobremesa) {
		comida.setSobremesa(sobremesa);
	}

}
