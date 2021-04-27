package Modelo;

/**
 * Classe denominada Infraestrutura. Tem como objetivo descrever as informações
 * das infraestruturas do evento. Uma classe que herda da classe Orçamento.
 * 
 * @author HITER E KLYSSMANN
 * @version 1.0 [Maio 2021]
 * 
 */

public class Infraestrutura extends Orcamento {
	private boolean decoracao; // decoração do evento
	private boolean estacionamento; // estacionamento do evento
	private boolean imobiliario;// imobiliario do evento;
	private boolean internet; // internet do evento;
	private boolean equipamento; // equipamento do evento;
	private boolean toalete; // toalete do evento;

	/**
	 * Construtor da Classe Infraestrutura.
	 * 
	 * @param tipo.       Inteiro que indica o tipo do orçamento (1 - Bebida, 2 -
	 *                    Comida, 3 - Infraestrutura, 4 - Música).
	 * @param descricao.  String que realiza a descrição da infraestrutura.
	 * @param valorTotal. Double que indica o valor total da infraestrutura para o
	 *                    evento.
	 */

	public Infraestrutura(int tipo, String descricao, double valorTotal) {
		super(tipo, descricao, valorTotal);

	}

	/**
	 * Construtor da Classe Infraestrutura com sobrecarga.
	 * 
	 * @param tipo.           Inteiro que indica o tipo do orçamento (1 - Bebida, 2
	 *                        - Comida, 3 - Infraestrutura, 4 - Música).
	 * @param descricao.      String que realiza a descrição da infraestrutura.
	 * @param valorTotal.     Double que indica o valor total da infraestrutura para
	 *                        o evento.
	 * @param decoracao.      Boolean que indica se o gasto é referente a decoração ou não no evento.
	 * @param estacionamento. Boolean que indica se o gasto é referente a estacionamento ou
	 *                        não no evento.
	 * @param imobiliario.    Boolean que indica se o gasto é referente a mobiliário ou não
	 *                        no evento.
	 * @param internet.       Boolean que indica se o gasto é referente a internet ou não no
	 *                        evento.
	 * @param equipamento.    Boolean que indica se o gasto é referente a equipamento ou não
	 *                        no evento.
	 * @param toalete.        Boolean que indica se o gasto é referente a toalete ou não no
	 *                        evento.
	 */

	public Infraestrutura(int tipo, String descricao, double valorTotal, boolean decoracao, boolean estacionamento,
			boolean imobiliario, boolean internet, boolean equipamento, boolean toalete) {
		super(tipo, descricao, valorTotal);
		this.decoracao = decoracao;
		this.estacionamento = estacionamento;
		this.imobiliario = imobiliario;
		this.internet = internet;
		this.equipamento = equipamento;
		this.toalete = toalete;
	}

	/**
	 * Construtor padrão da Classe Infraestrutura. Sem parâmetros de entradas.
	 */

	public Infraestrutura() {
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
