package Controle;

/*
Sintese
Objetivo: Classe denominada Controle Orcamento para controlar a classe Orcamento do pacote modelo; 
*/

import Modelo.*;

/**
 * Classe denominada Controle Orcamento, tem como função ligar os atributos 
 * da classe Orcamento no pacote modelo
 * com o pacote View.
 * 
 * @author HITER E KLYSSMANN
 * @version 1.0 [Maio 2021]
 * 
 */
public class ControleOrcamento {

	private Orcamento orcamento = new Orcamento(); // Instanciação da classe orcamento do pacote modelo

	/**
	 * Construtor da Classe Controle Orcamento.
	 * @param orcamento Orcamento selecionado para adicionar/editar os atributos.
	 */
	public ControleOrcamento(Orcamento orcamento) {
		this.orcamento = orcamento;
	}

	/**
	 * Retorna o Orcamento selecionado para adicionar/editar os atributos.
	 * @return Orcamento selecionado,
	 */
	public Orcamento getOrcamento() {
		return orcamento;

	}

	/**
	 * Retorna a descrição do orçamento selecionado.
	 * @return String com a descrição do orçamento.
	 */
	public String getDescricao() {
		return orcamento.getDescricao();
	}

	/**
	 * Insere a descrição do orçamento selecionado.
	 * @param descricao String com a descrição do orçamento.
	 */
	public void setDescricao(String descricao) {
		orcamento.setDescricao(descricao);
	}

	/**
	 * Retorna o valor total do Orçamento selecionado.
	 * @return Double com o valor total.
	 */
	public double getValorTotalOrcamento() {
		return orcamento.getValorTotal();
	}

	/**
	 * Insere o valor total do Orçamento selecionado.
	 * @param valorTotal Double com o valor total.
	 */
	public void setValorTotal(double valorTotal) {
		orcamento.setValorTotal(valorTotal);
	}

	/**
	 * Insere o tipo do Orcamento: 1 - Bebida, 2 - Comida, 3 - Infraestrutura e 4 - Música
	 * @return Inteiro com o tipo do orçamento.
	 */
	public int getTipoOrcamento() {
		return orcamento.getTipo();
	}

}
