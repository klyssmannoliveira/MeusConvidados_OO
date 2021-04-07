package Controle;

import java.util.Date;

import Modelo.*;

public class ControleBancoEvento {

	// private static ArrayList<Evento> = new ArrayList<Evento>();
	//SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");// inst�ncia o formato simples da data;
	private BancoEvento banco = new BancoEvento();
	private int qtdEventos;
	
	public String[] getNomeEventos() {
		// ArrayList<Evento> aux = new ArrayList<Evento>();

		String[] s = new String[banco.getBdEventos().size()];
		for (int i = 0; i < banco.getBdEventos().size(); i++) {
			s[i] = banco.getBdEventos().get(i).getNomeEvento();

		}
		return s;
	}
	
	public ControleBancoEvento(ControleBancoEvento dados) {
		banco = dados.getBanco();
		qtdEventos = dados.getQtdEventos();
	}

	public BancoEvento getBanco() {
		return banco;
	}

	public void setBanco(BancoEvento banco) {
		this.banco = banco;
	}
	
	public String getNomeEvento(int pos) {
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(pos));
		String s = controlEvento.getNomeEvento();
		return s;
	}
	
	public String getDataEvento(int pos) {
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(pos));
		String s = controlEvento.getDataEvento();
		return s;
	}
	
	public String getHoraiEvento(int pos) {
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(pos));
		String s = controlEvento.getHoraiEvento();
		return s;
	}
	
	public String getHorafEvento(int pos) {
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(pos));
		String s = controlEvento.getHorafEvento();
		return s;
	}
	
	public String getEndereco(int pos) {
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(pos));
		String s = controlEvento.getEndereco();
		return s;
	}
	
	public String getCep(int pos) {
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(pos));
		String s = controlEvento.getCep();
		return s;
	}
	
	public String getComplemento(int pos) {
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(pos));
		String s = controlEvento.getComplemento();
		return s;
	}

	public boolean adicionarEditarEvento(String[] dadosEvento) {

		if( !dadosEvento[2].matches("[0-9]+")) {
			return false;
		}
		
		if( !dadosEvento[3].matches("[0-9]+")) {
			return false;
		}
		
		if( !dadosEvento[4].matches("[0-9]+")) {
			return false;
		}
		if( !dadosEvento[6].matches("[0-9]+")) {
			return false;
		}
			
		else {
			Evento e = new Evento(dadosEvento[1], dadosEvento[2], dadosEvento[3],
					dadosEvento[4], dadosEvento[5], dadosEvento[6], dadosEvento[7]);
			banco.adicionarEvento(e);
			return true;
		}
		
	}
	
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
