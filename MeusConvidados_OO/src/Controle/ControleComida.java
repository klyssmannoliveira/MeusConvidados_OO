package Controle;

import Modelo.Comida;

public class ControleComida {
	private Comida comida = new Comida();

	public ControleComida(Comida comida) {
		this.comida = comida;
	}

	public String getDescricao() {
		return comida.getDescricao();
	}

	public double getValorTotalOrcamento() {
		return comida.getValorTotal();
	}

	// set da descricao
	public void setDescricao(String descricao) {
		comida.setDescricao(descricao);
	}

	// set do valor total
	public void setValorTotal(double valorTotal) {
		comida.setValorTotal(valorTotal);
	}

	public boolean isPrincipal() {

		return comida.isPrincipal();
	}

	// set do prato principal
	public void setPrincipal(boolean principal) {
		comida.setPrincipal(principal);
	}

	public double getValorUnitarioOrcamento() {

		return comida.getValorUnitario();
	}

	// set do valor unitario
	public void setValorUnitario(double valorUnitario) {
		comida.setValorUnitario(valorUnitario);
	}

	public int getValorQuantidadeOrcamento() {

		return comida.getQuantidade();
	}

	// set da quantidade
	public void setQuantidade(int quantidade) {
		comida.setQuantidade(quantidade);
	}

	public boolean isDegustativo() {
		return comida.isDegustativo();
	}

	// set do prato degustativo:
	public void setDegustativo(boolean degustativo) {
		comida.setDegustativo(degustativo);
	}

	public boolean isSobremesa() {
		return comida.isSobremesa();
	}

	// set do prato sobremesa:
	public void setSobremesa(boolean sobremesa) {
		comida.setSobremesa(sobremesa);
	}

}
