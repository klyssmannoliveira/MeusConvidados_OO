package Controle;

import java.util.ArrayList;

import Modelo.*;

public class ControleEvento {

	//private static ArrayList<Evento> bdEventos = new ArrayList<Evento>();
	private BancoEvento b = new BancoEvento();
	private int qtdEventos;


	
	public String[] getNomeEvento() {
		// ArrayList<Evento> aux = new ArrayList<Evento>();

		String[] s = new String[b.getBdEventos().size()];
		for (int i = 0; i < b.getBdEventos().size(); i++) {
			s[i] = b.getBdEventos().get(i).getNomeEvento();

		}
		return s;
	}

	public ControleEvento(ControleBancoEvento dados) {
		b = dados.getB();
		qtdEventos = dados.getQtdEventos();
	}

	
}
