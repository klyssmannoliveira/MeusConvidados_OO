package Controle;

import Modelo.*;

public class ControleOrcamento {

	private Orcamento orcamento = new Orcamento();

	public ControleOrcamento(Orcamento orcamento) {
		this.orcamento = orcamento;
	}

	public Orcamento getOrcamento() {

		return orcamento;

	}

	public String getDescricao() {

		return orcamento.getDescricao();
	}

	// set da descricao
	public void setDescricao(String descricao) {
		orcamento.setDescricao(descricao);
	}

	public double getValorTotalOrcamento() {

		return orcamento.getValorTotal();
	}

	// set do valor total
	public void setValorTotal(double valorTotal) {
		orcamento.setValorTotal(valorTotal);
	}

	public int getTipoOrcamento() {
		return orcamento.getTipo();
	}

}
