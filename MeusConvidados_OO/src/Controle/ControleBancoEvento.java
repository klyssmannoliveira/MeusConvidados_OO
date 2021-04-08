package Controle;

import Modelo.*;

public class ControleBancoEvento {

	// private static ArrayList<Evento> = new ArrayList<Evento>();
	//SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");// instância o formato simples da data;
	private BancoEvento banco = new BancoEvento();
	private int qtdEventos;
	
	// Construtor da classe ControleBancoEvento
	public ControleBancoEvento(ControleBancoEvento dados) {
		banco = dados.getBanco();
		qtdEventos = dados.getQtdEventos();
	}
	
	// get da classe banco instanciada nessa classe
	public BancoEvento getBanco() {
		return banco;
	}

	// set da classe banco instanciada nessa classe
	public void setBanco(BancoEvento banco) {
		this.banco = banco;
	}
	
	//Retorna um vetor de strings com os nomes dos eventos
	public String[] getNomeEventos() {
		String[] auxiliar = new String[banco.getBdEventos().size()];
		
		for (int i = 0; i < banco.getBdEventos().size(); i++) {
			auxiliar[i] = banco.getBdEventos().get(i).getNomeEvento();
		}
		return auxiliar;
	}
	
	// Retorna uma String com o nome do evento
	public String getNomeEvento(int pos) {
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(pos));
		String s = controlEvento.getNomeEvento();
		return s;
	}

	// Retorna uma String com a data do evento
	public String getDataEvento(int pos) {
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(pos));
		String s = controlEvento.getDataEvento();
		return s;
	}

	// Retorna uma String com a hora do início do evento evento
	public String getHoraiEvento(int pos) {
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(pos));
		String s = controlEvento.getHoraiEvento();
		return s;
	}

	// Retorna uma String com a hora do término do evento
	public String getHorafEvento(int pos) {
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(pos));
		String s = controlEvento.getHorafEvento();
		return s;
	}

	// Retorna uma String com o endereço do evento
	public String getEndereco(int pos) {
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(pos));
		String s = controlEvento.getEndereco();
		return s;
	}
	

	// Retorna uma String com o CEP do evento
	public String getCep(int pos) {
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(pos));
		String s = controlEvento.getCep();
		return s;
	}
	

	// Retorna uma String com o complemento do evento
	public String getComplemento(int pos) {
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(pos));
		String s = controlEvento.getComplemento();
		return s;
	}

	// Retorna um boolean com o erro de preenchimento
	public boolean adicionarEditarEvento(String[] dadosEvento) {

		if( !dadosEvento[2].matches("[0-9]+")) { // data
			return false;
		}
		
		if( !dadosEvento[3].matches("[0-9]+")) { // hora início
			return false;
		}
		
		if( !dadosEvento[4].matches("[0-9]+")) { // hora término
			return false;
		}
		if( !dadosEvento[6].matches("[0-9]+")) { // CEP
			return false;
		}
			
		else {
			Evento e = new Evento(dadosEvento[1], dadosEvento[2], dadosEvento[3],
					dadosEvento[4], dadosEvento[5], dadosEvento[6], dadosEvento[7]);
			banco.adicionarEvento(e);
			return true;
		}
		
	}
	
	// retorna um boolean com erro de exclusao do evento
	public boolean removerEvento(String[] dadosEvento){
		if(banco.removerEvento(dadosEvento[1])) {
			return true;
		}
		else {
			return false;
		}
		
	}


	public int getQtdEventos() {
		setQtdEventos();
		return qtdEventos;
	}

	public void setQtdEventos() {
		this.qtdEventos = banco.getQtdEventos();;
	}

	public ControleBancoEvento() {
		banco.fillWithSomeData();
	}

	
	
}
