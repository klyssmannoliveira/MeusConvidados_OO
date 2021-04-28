package Controle;

/*
Sintese
Objetivo: Classe denominada Controle Infraestrutura para controlar a classe infraestrutura do pacote modelo; 
*/

import Modelo.Infraestrutura;


/**
 * Classe denominada Controle Infraestrutura, tem como fun��o ligar os atributos 
 * da classe Infraestrutura no pacote modelo
 * com o pacote View.
 * 
 * @author HITER E KLYSSMANN
 * @version 1.0 [Maio 2021]
 * 
 */
public class ControleInfraestrutura {
	private Infraestrutura infraestrutura = new Infraestrutura(); // Instancia��o da classe Infraestrutura do pacote
																	// modelo

	/**
	 * Construtor da Classe Controle Infraestrutura.
	 * @param infraestrutura Infraestrutura selecionada para adicionar/editar os atributos.
	 */
	public ControleInfraestrutura(Infraestrutura infraestrutura) {
		this.infraestrutura = infraestrutura;
	}

	/**
	 * Retorna a descri��o da infraestrutura do evento.
	 * @return String com a descri��o da infraestrutura.
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
	 * Insere uma descri��o para infraestrutura do evento.
	 * @param descricao String com a descri��o.
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
	 * Retorna se a infraestrutura � classificada como decora��o ou n�o.
	 * @return Retorna verdadeiro se a infraestrutura for classificada como decora��o
	 * e falso caso contr�rio.
	 */
	public boolean isDecoracao() {
		return infraestrutura.isDecoracao();
	}

	/**
	 * Insere se a infraestrutura � classificada como decora��o ou n�o.
	 * @param decoracao Boolean para definir se � uma decora��o ou n�o.
	 */
	public void setDecoracao(boolean decoracao) {
		infraestrutura.setDecoracao(decoracao);
	}

	/**
	 * Retorna se a infraestrutura � relacionada ao estacionamento ou n�o.
	 * @return Retorna verdadeiro se a infraestrutura for relacionada ao estacionamento
	 * e falso caso contr�rio.
	 */
	public boolean isEstacionamento() {
		return infraestrutura.isEstacionamento();
	}

	/**
	 * Insere se a infraestrutura � classificada como estacionamento ou n�o.
	 * @param estacionamento Boolean para definir se � relacionado com estacionamento ou n�o.
	 */
	public void setEstacionamento(boolean estacionamento) {
		infraestrutura.setEstacionamento(estacionamento);
	}

	/**
	 * Retorna se a infraestrutura � relacionada � mobili�rio do evento ou n�o.
	 * @return Retorna verdadeiro se for mobili�rio e falso caso contr�rio.
	 */
	public boolean isImobiliario() {
		return infraestrutura.isImobiliario();
	}

	/**
	 * Insere se a infraestrutura � relacionada � mobili�rio do evento ou n�o.
	 * @param imobiliario Boolean para definir se � relacionado � mobili�rio
	 * e falso caso contr�rio.
	 */
	public void setImobiliario(boolean imobiliario) {
		infraestrutura.setImobiliario(imobiliario);
	}

	/**
	 * Retorna se a infraestrutura � relacionada � gastos com internet do evento ou n�o.
	 * @return Retorna verdadeiro se for internet e falso caso contr�rio.
	 */
	public boolean isInternet() {
		return infraestrutura.isInternet();
	}

	/**
	 * Insere se a infraestrutura � relacionada � gastos com internet do evento ou n�o.
	 * @param internet  Boolean para definir se � relacionado � internet
	 * e falso caso contr�rio.
	 */
	public void setInternet(boolean internet) {
		infraestrutura.setInternet(internet);
	}

	/**
	 * Retorna se a infraestrutura � relacionada � gastos com equipamentos do evento ou n�o.
	 * @return Retorna verdadeiro se for equipamento e falso caso contr�rio.
	 */
	public boolean isEquipamento() {
		return infraestrutura.isEquipamento();
	}

	/**
	 * Insere se a infraestrutura � relacionada � gastos com equipamentos do evento ou n�o.
	 * @param equipamento Boolean para definir se � relacionado � equipamento
	 * e falso caso contr�rio.
	 */
	public void setEquipamento(boolean equipamento) {
		infraestrutura.setEquipamento(equipamento);
	}

	/**
	 * Retorna se a infraestrutura � relacionada � gastos com toalete do evento ou n�o.
	 * @return Retorna verdadeiro se for Toalete e falso caso contr�rio.
	 */
	public boolean isToalete() {
		return infraestrutura.isToalete();
	}

	/**
	 * Insere se a infraestrutura � relacionada � gastos com toalete do evento ou n�o.
	 * @param toalete
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
