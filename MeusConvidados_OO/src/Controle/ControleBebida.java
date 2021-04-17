package Controle;

import Modelo.Bebida;

public class ControleBebida {

	private Bebida bebida = new Bebida();

	public ControleBebida(Bebida bebida) {
		this.bebida = bebida;
	}

	public String getDescricao() {
		return bebida.getDescricao();
	}

	public double getValorTotalOrcamento() {
		return bebida.getValorTotal();
	}
	
	// set da descricao
	public void setDescricao(String descricao) {
		bebida.setDescricao(descricao);
	}

	// set do valor total
	public void setValorTotal(double valorTotal) {
		bebida.setValorTotal(valorTotal);
	}

	public boolean isBebidaQuente() {
		return bebida.isBebidaQuente();
	}

	public void setBebidaQuente(boolean bebidaQuente) {
		bebida.setBebidaQuente(bebidaQuente);
	}

	public double getValorUnitarioOrcamento() {
		return bebida.getValorUnitario();
	}

	// set do valor unitario de cada bebida;
	public void setValorUnitario(double valorUnitario) {
		bebida.setValorUnitario(valorUnitario);
	}

	public int getValorQuantidadeOrcamento() {
		return bebida.getQuantidade();
	}

	// set da quantidade de bebida;
	public void setQuantidade(int quantidade) {
		bebida.setQuantidade(quantidade);
	}

	public boolean isAlcoolico() {
		return bebida.isAlcoolico();
	}

	// set do boolean alcoolico referente a bebida;
	public void setAlcoolico(boolean alcoolico) {
		bebida.setAlcoolico(alcoolico);
	}
}
