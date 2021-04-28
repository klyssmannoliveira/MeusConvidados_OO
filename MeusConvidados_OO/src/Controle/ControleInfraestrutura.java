package Controle;

/*
Sintese
Objetivo: Classe denominada Controle Infraestrutura para controlar a classe infraestrutura do pacote modelo; 
*/

import Modelo.Infraestrutura;


/**
 * Classe denominada Controle Infraestrutura, tem como função ligar os atributos 
 * da classe Infraestrutura no pacote modelo
 * com o pacote View.
 * 
 * @author HITER E KLYSSMANN
 * @version 1.0 [Maio 2021]
 * 
 */
public class ControleInfraestrutura {
	private Infraestrutura infraestrutura = new Infraestrutura(); // Instanciação da classe Infraestrutura do pacote
																	// modelo

	/**
	 * Construtor da Classe Controle Infraestrutura.
	 * @param infraestrutura Infraestrutura selecionada para adicionar/editar os atributos.
	 */
	public ControleInfraestrutura(Infraestrutura infraestrutura) {
		this.infraestrutura = infraestrutura;
	}

	/**
	 * Retorna a descrição da infraestrutura do evento.
	 * @return String com a descrição da infraestrutura.
	 */
	public String getDescricao() {
		return infraestrutura.getDescricao();
	}

	/**
	 * Retorna o valor total da infraestrutura do evento.
	 * @return Double com o valor total da infraestrutura.
	 */
	public double getValorTotalOrcamento() {
		return infraestrutura.getValorTotal();
	}

	/**
	 * Insere uma descrição para infraestrutura do evento.
	 * @param descricao String com a descrição.
	 */
	public void setDescricao(String descricao) {
		infraestrutura.setDescricao(descricao);
	}

	/**
	 * Insere um valor total para a infraestrutura do evento.
	 * @param valorTotal Double com o valor total.
	 */
	public void setValorTotal(double valorTotal) {
		infraestrutura.setValorTotal(valorTotal);
	}

	/**
	 * Retorna se a infraestrutura é classificada como decoração ou não.
	 * @return Retorna verdadeiro se a infraestrutura for classificada como decoração
	 * e falso caso contrário.
	 */
	public boolean isDecoracao() {
		return infraestrutura.isDecoracao();
	}

	/**
	 * Insere se a infraestrutura é classificada como decoração ou não.
	 * @param decoracao Boolean para definir se é uma decoração ou não.
	 */
	public void setDecoracao(boolean decoracao) {
		infraestrutura.setDecoracao(decoracao);
	}

	/**
	 * Retorna se a infraestrutura é relacionada ao estacionamento ou não.
	 * @return Retorna verdadeiro se a infraestrutura for relacionada ao estacionamento
	 * e falso caso contrário.
	 */
	public boolean isEstacionamento() {
		return infraestrutura.isEstacionamento();
	}

	/**
	 * Insere se a infraestrutura é classificada como estacionamento ou não.
	 * @param estacionamento Boolean para definir se é relacionado com estacionamento ou não.
	 */
	public void setEstacionamento(boolean estacionamento) {
		infraestrutura.setEstacionamento(estacionamento);
	}

	/**
	 * Retorna se a infraestrutura é relacionada à mobiliário do evento ou não.
	 * @return Retorna verdadeiro se for mobiliário e falso caso contrário.
	 */
	public boolean isImobiliario() {
		return infraestrutura.isImobiliario();
	}

	/**
	 * Insere se a infraestrutura é relacionada à mobiliário do evento ou não.
	 * @param imobiliario Boolean para definir se é relacionado à mobiliário
	 * e falso caso contrário.
	 */
	public void setImobiliario(boolean imobiliario) {
		infraestrutura.setImobiliario(imobiliario);
	}

	/**
	 * Retorna se a infraestrutura é relacionada à gastos com internet do evento ou não.
	 * @return Retorna verdadeiro se for internet e falso caso contrário.
	 */
	public boolean isInternet() {
		return infraestrutura.isInternet();
	}

	/**
	 * Insere se a infraestrutura é relacionada à gastos com internet do evento ou não.
	 * @param internet  Boolean para definir se é relacionado à internet
	 * e falso caso contrário.
	 */
	public void setInternet(boolean internet) {
		infraestrutura.setInternet(internet);
	}

	/**
	 * Retorna se a infraestrutura é relacionada à gastos com equipamentos do evento ou não.
	 * @return Retorna verdadeiro se for equipamento e falso caso contrário.
	 */
	public boolean isEquipamento() {
		return infraestrutura.isEquipamento();
	}

	/**
	 * Insere se a infraestrutura é relacionada à gastos com equipamentos do evento ou não.
	 * @param equipamento Boolean para definir se é relacionado à equipamento
	 * e falso caso contrário.
	 */
	public void setEquipamento(boolean equipamento) {
		infraestrutura.setEquipamento(equipamento);
	}

	/**
	 * Retorna se a infraestrutura é relacionada à gastos com toalete do evento ou não.
	 * @return Retorna verdadeiro se for Toalete e falso caso contrário.
	 */
	public boolean isToalete() {
		return infraestrutura.isToalete();
	}

	/**
	 * Insere se a infraestrutura é relacionada à gastos com toalete do evento ou não.
	 * @param toalete Boolean se é toalete ou não.
	 */
	public void setToalete(boolean toalete) {
		infraestrutura.setToalete(toalete);
	}

	/**
	 * Retorna o valor total da infraestrutura.
	 * @return Double com o valor total.
	 */
	public double getValorTotalInfraestrutura() {
		return infraestrutura.getValorTotal();
	}
}
