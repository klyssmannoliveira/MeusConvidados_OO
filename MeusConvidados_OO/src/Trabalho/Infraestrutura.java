package Trabalho;

/*
Sintese
Objetivo: Classe denominada Infraestrutura para descrever as informaçoes da infraestrutura do evento; 
*/

public class Infraestrutura extends Orcamento {
	private boolean decoracao; // decoração do evento
	private boolean estacionamento; // estacionamento do evento
	private boolean imobiliario;// imobiliario do evento;
	private boolean internet; // internet do evento;
	private boolean equipamento; // equipamento do evento;
	private boolean toalete; // toalete do evento;

	/*
	 * Objetivo: Construtor da Classe Infraestrutura; Entrada : descricao e
	 * valorTotal;
	 * 
	 */
	public Infraestrutura(String descricao, double valorTotal) {
		super(descricao, valorTotal);

	}

	/*
	 * Objetivo: Construtor da Classe Infraestrutura (sobrecarga); Entrada :
	 * descricao, quantidade, valorTotal, decoracao, estacionamento, imobiliario,
	 * internet, equipamento, toalete;
	 */

	public Infraestrutura(String descricao, double valorTotal, boolean decoracao, boolean estacionamento,
			boolean imobiliario, boolean internet, boolean equipamento, boolean toalete) {
		super(descricao, valorTotal);
		this.decoracao = decoracao;
		this.estacionamento = estacionamento;
		this.imobiliario = imobiliario;
		this.internet = internet;
		this.equipamento = equipamento;
		this.toalete = toalete;
	}

	/*
	 * Objetivo: Retorna a uma string; Saida: descrição, valorTotal;
	 * 
	 */

	public String toString() {
		return "Orçamento: " + descricao + "\nValor total: R$ " + valorTotal;
	}

	/*
	 * Objetivo: Getters e Setters referentes a Infraestrutura;
	 * 
	 */

	// get da decoracao: True se tiver decoracao e false se não tiver;
	public boolean isDecoracao() {
		return decoracao;
	}

	// set da decoracao;
	public void setDecoracao(boolean decoracao) {
		this.decoracao = decoracao;
	}

	// get do estacionamento: True se tiver estacionamento e false se não tiver;
	public boolean isEstacionamento() {
		return estacionamento;
	}

	// set do estacionamento;
	public void setEstacionamento(boolean estacionamento) {
		this.estacionamento = estacionamento;
	}

	// get do imobiliario: True se tiver imobiliario e false se não tiver;
	public boolean isImobiliario() {
		return imobiliario;
	}

	// set do imobiliario;
	public void setImobiliario(boolean imobiliario) {
		this.imobiliario = imobiliario;
	}

	// get da internet: True se tiver internet e false se não tiver;
	public boolean isInternet() {
		return internet;
	}

	// set da internet;
	public void setInternet(boolean internet) {
		this.internet = internet;
	}

	// get do equipamento: True se tiver equipamento e false se não tiver;
	public boolean isEquipamento() {
		return equipamento;
	}

	// set do equipamento;
	public void setEquipamento(boolean equipamento) {
		this.equipamento = equipamento;
	}

	// get do toalete: True se tiver toalete e false se não tiver;
	public boolean isToalete() {
		return toalete;
	}

	// set do toalete;
	public void setToalete(boolean toalete) {
		this.toalete = toalete;
	}

}
