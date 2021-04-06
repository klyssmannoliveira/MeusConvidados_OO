package Modelo;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;

public class BancoEvento {

	private int qtdEventos;

	private static ArrayList<Evento> bdEventos = new ArrayList<Evento>();

	public ArrayList<Evento> getBdEventos() {
		return bdEventos;
	}

	public void setBdEventos(ArrayList<Evento> bdEventos) {
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
	
	public void fillWithSomeData() {
		java.util.Date d = Calendar.getInstance().getTime();
		Evento e1 = new Evento("Casamento", d, 18, 23, "Alvorada");
		adicionarEvento(e1);
		Evento e2 = new Evento("churrasco", d, 18, 23, "Alvorada");
		adicionarEvento(e2);
		Evento e3 = new Evento("niver", d, 18, 23, "Alvorada");
		adicionarEvento(e3);
		Evento e4 = new Evento("pizzaria", d, 18, 23, "Alvorada");
		adicionarEvento(e4);
		
	}
	
}
