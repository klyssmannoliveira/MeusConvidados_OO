package Modelo;

import java.util.ArrayList;

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
		setQtdEventos();
		return qtdEventos;
	}

	public void setQtdEventos() {
		this.qtdEventos = bdEventos.size();
	}

	public void adicionarEvento(Evento evento) {
		bdEventos.add(evento);
	}
	
	public boolean removerEvento(String nomeEvento) {
		int cont = 0;
		for (int i = 0; i < bdEventos.size(); i++) {
			Evento aux = bdEventos.get(i);
			if (aux.getNomeEvento() == nomeEvento) {
				bdEventos.remove(i);
				cont--;
				break;
			}
			cont++;
		}

		if (cont == bdEventos.size()) {
			return false;
		}
		else {
			return true;
		}

	}
	
	public void fillWithSomeData() {
		//java.util.Date d = Calendar.getInstance().getTime();
		Evento e1 = new Evento("Casamento", "18/03/2020", "18:00", "23:00", "Alvorada", "72583-250", "Sul");
		adicionarEvento(e1);
		Evento e2 = new Evento("churrasco", "18/02/2021", "18:00", "23:00", "Alvorada2", "72583-260", "Sul");
		adicionarEvento(e2);
		Evento e3 = new Evento("niver", "18/01/2021", "18:00", "23:00", "Alvorada3", "72583-270", "Sul");
		adicionarEvento(e3);
		Evento e4 = new Evento("pizzaria", "18/03/2021", "18:00", "23:00", "Alvorada4", "72583-280", "Sul");
		adicionarEvento(e4);
		
	}
	
}
