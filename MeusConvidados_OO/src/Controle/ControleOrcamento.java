package Controle;

import Modelo.*;

public class ControleOrcamento {

	private Orcamento orcamento = new Orcamento();
	private Bebida bebida = new Bebida();

	public ControleOrcamento(Orcamento orcamento) {
		this.orcamento = orcamento;
	}
	
	public void setBebida(Bebida bebida) {
		this.bebida = bebida;
		
	}
	
public Orcamento getOrcamento() {

	return orcamento;
	
}
	public String getDescricao() {

		return orcamento.getDescricao();
	}

	public double getValorTotalOrcamento() {

		return orcamento.getValorTotal();
	}

	public double getValorUnitarioOrcamento() {

		return bebida.getValorUnitario();
	}

	public int getValorQuantidadeOrcamento() {

		return bebida.getQuantidade();
	}

	public boolean isBebidaQuente() {

		return bebida.isBebidaQuente();
	}

	
	public boolean isAlcoolico() {

		return bebida.isAlcoolico();
	}
	
	public int getTipoOrcamento() {

		return orcamento.getTipo();
	}
	
	
}
