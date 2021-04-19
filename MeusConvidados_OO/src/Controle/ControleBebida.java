package Controle;

/*
Sintese
Objetivo: Classe denominada Controle Bebida para controlar a classe bebida do pacote modelo; 
*/

import Modelo.Bebida;

public class ControleBebida {

	private Bebida bebida = new Bebida(); // Instanciação da classe bebida do pacote modelo

	/*
	 * Objetivo: Construtor da Classe controle Bebida. Entrada : Bebida bebida;
	 * 
	 */
	public ControleBebida(Bebida bebida) {
		this.bebida = bebida;
	}

	// get Descrição
	public String getDescricao() {
		return bebida.getDescricao();
	}

	// get Valor Total Orcamento
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

	// Is Bebida quente
	public boolean isBebidaQuente() {
		return bebida.isBebidaQuente();
	}

	// set Bebida Quente
	public void setBebidaQuente(boolean bebidaQuente) {
		bebida.setBebidaQuente(bebidaQuente);
	}

	// get Valor Unitario Orcamento
	public double getValorUnitarioOrcamento() {
		return bebida.getValorUnitario();
	}

	// set do valor unitario;
	public void setValorUnitario(double valorUnitario) {
		bebida.setValorUnitario(valorUnitario);
	}

	// get Valor quantidade Orcamento
	public int getValorQuantidadeOrcamento() {
		return bebida.getQuantidade();
	}

	// set da quantidade de bebida;
	public void setQuantidade(int quantidade) {
		bebida.setQuantidade(quantidade);
	}

	// Is alcoolico refeente a bebida
	public boolean isAlcoolico() {
		return bebida.isAlcoolico();
	}

	// set do boolean alcoolico referente a bebida;
	public void setAlcoolico(boolean alcoolico) {
		bebida.setAlcoolico(alcoolico);
	}
}
