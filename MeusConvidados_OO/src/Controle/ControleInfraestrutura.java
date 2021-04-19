package Controle;

/*
Sintese
Objetivo: Classe denominada Controle Infraestrutura para controlar a classe infraestrutura do pacote modelo; 
*/

import Modelo.Infraestrutura;

public class ControleInfraestrutura {
	private Infraestrutura infraestrutura = new Infraestrutura(); // Instanciação da classe Infraestrutura do pacote
																	// modelo

	/*
	 * Objetivo: Construtor da Classe controle infraestrutura. Entrada :
	 * Infraestrutura infraestrutura;
	 * 
	 */
	public ControleInfraestrutura(Infraestrutura infraestrutura) {
		this.infraestrutura = infraestrutura;
	}

	// get Descriçao
	public String getDescricao() {
		return infraestrutura.getDescricao();
	}

	// get Valor Total orcamento
	public double getValorTotalOrcamento() {
		return infraestrutura.getValorTotal();
	}

	// set da Descricao
	public void setDescricao(String descricao) {
		infraestrutura.setDescricao(descricao);
	}

	// set do valor total
	public void setValorTotal(double valorTotal) {
		infraestrutura.setValorTotal(valorTotal);
	}

	// Is da Decoração
	public boolean isDecoracao() {
		return infraestrutura.isDecoracao();
	}

	// set Decoracao;
	public void setDecoracao(boolean decoracao) {
		infraestrutura.setDecoracao(decoracao);
	}

	// Is Estacionamento
	public boolean isEstacionamento() {
		return infraestrutura.isEstacionamento();
	}

	// set do Estacionamento;
	public void setEstacionamento(boolean estacionamento) {
		infraestrutura.setEstacionamento(estacionamento);
	}

	// Is Imobiliario
	public boolean isImobiliario() {
		return infraestrutura.isImobiliario();
	}

	// set do imobiliario;
	public void setImobiliario(boolean imobiliario) {
		infraestrutura.setImobiliario(imobiliario);
	}

	// Is Internet
	public boolean isInternet() {
		return infraestrutura.isInternet();
	}

	// set da internet;
	public void setInternet(boolean internet) {
		infraestrutura.setInternet(internet);
	}

	// Is do Equipamento
	public boolean isEquipamento() {
		return infraestrutura.isEquipamento();
	}

	// set do equipamento;
	public void setEquipamento(boolean equipamento) {
		infraestrutura.setEquipamento(equipamento);
	}

	// Is do Toalete
	public boolean isToalete() {
		return infraestrutura.isToalete();
	}

	// set do toalete;
	public void setToalete(boolean toalete) {
		infraestrutura.setToalete(toalete);
	}

	// get Valor Total Infraestrutura
	public double getValorTotalInfraestrutura() {
		return infraestrutura.getValorTotal();
	}
}
