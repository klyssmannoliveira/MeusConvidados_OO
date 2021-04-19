package Controle;

/*
Sintese
Objetivo: Classe denominada Controle Orcamento para controlar a classe Orcamento do pacote modelo; 
*/

import Modelo.*;

public class ControleOrcamento {

	private Orcamento orcamento = new Orcamento(); // Instanciação da classe orcamento do pacote modelo

	/*
	 * Objetivo: Construtor da Classe controle Orcamento. Entrada : Orcamento
	 * orcamento;
	 * 
	 */
	public ControleOrcamento(Orcamento orcamento) {
		this.orcamento = orcamento;
	}

	// get Orcamento
	public Orcamento getOrcamento() {
		return orcamento;

	}

	// get Descriçao
	public String getDescricao() {
		return orcamento.getDescricao();
	}

	// set da descricao
	public void setDescricao(String descricao) {
		orcamento.setDescricao(descricao);
	}

	// get Valor Total Orcamento
	public double getValorTotalOrcamento() {
		return orcamento.getValorTotal();
	}

	// set do valor total
	public void setValorTotal(double valorTotal) {
		orcamento.setValorTotal(valorTotal);
	}

	// get Tipo Orcamento
	public int getTipoOrcamento() {
		return orcamento.getTipo();
	}

}
