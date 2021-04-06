package Modelo;

import java.util.ArrayList;

public class BancoEvento {

	private static ArrayList<Evento> bdEventos = new ArrayList<Evento>();
	private int qtdEventos;
	
	
	public static ArrayList<Evento> getBdEventos() {
		return bdEventos;
	}
	public static void setBdEventos(ArrayList<Evento> bdEventos) {
		BancoEvento.bdEventos = bdEventos;
	}
	public int getQtdEventos() {
		return qtdEventos;
	}
	public void setQtdEventos(int qtdEventos) {
		this.qtdEventos = qtdEventos;
	}
	
	public void adicionarEvento(Evento evento) {
		bdEventos.add(evento);
	}
	
}
