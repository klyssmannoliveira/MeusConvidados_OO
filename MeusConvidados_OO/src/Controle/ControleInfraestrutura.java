package Controle;

import Modelo.Infraestrutura;

public class ControleInfraestrutura {
	private Infraestrutura infraestrutura = new Infraestrutura();

	public ControleInfraestrutura(Infraestrutura infraestrutura) {
		this.infraestrutura = infraestrutura;
	}

	public String getDescricao() {
		return infraestrutura.getDescricao();
	}

	public double getValorTotalOrcamento() {
		return infraestrutura.getValorTotal();
	}

	// set da descricao
	public void setDescricao(String descricao) {
		infraestrutura.setDescricao(descricao);
	}

	// set do valor total
	public void setValorTotal(double valorTotal) {
		infraestrutura.setValorTotal(valorTotal);
	}

	public boolean isDecoracao() {
		return infraestrutura.isDecoracao();
	}

	// set da decoracao;
	public void setDecoracao(boolean decoracao) {
		infraestrutura.setDecoracao(decoracao);
	}

	public boolean isEstacionamento() {
		return infraestrutura.isEstacionamento();
	}

	// set do estacionamento;
	public void setEstacionamento(boolean estacionamento) {
		infraestrutura.setEstacionamento(estacionamento);
	}

	public boolean isImobiliario() {
		return infraestrutura.isImobiliario();
	}

	// set do imobiliario;
	public void setImobiliario(boolean imobiliario) {
		infraestrutura.setImobiliario(imobiliario);
	}

	public boolean isInternet() {
		return infraestrutura.isInternet();
	}

	// set da internet;
	public void setInternet(boolean internet) {
		infraestrutura.setInternet(internet);
	}

	public boolean isEquipamento() {
		return infraestrutura.isEquipamento();
	}

	// set do equipamento;
	public void setEquipamento(boolean equipamento) {
		infraestrutura.setEquipamento(equipamento);
	}

	public boolean isToalete() {
		return infraestrutura.isToalete();
	}

	// set do toalete;
	public void setToalete(boolean toalete) {
			infraestrutura.setToalete(toalete);
		}

	public double getValorTotalInfraestrutura() {

		return infraestrutura.getValorTotal();
	}
}
