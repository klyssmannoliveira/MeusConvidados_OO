package Controle;

import java.util.ArrayList;

import Modelo.*;

public class ControleBancoEvento {

	// private static ArrayList<Evento> = new ArrayList<Evento>();
	private BancoEvento b = new BancoEvento();
	private int qtdEventos;

	public BancoEvento getB() {
		return b;
	}

	public void setB(BancoEvento b) {
		this.b = b;
	}

	public boolean adicionarEvento(String[] dadosEvento) {

		// IF condições para o preenchimento correto else, preenche
		return true;
	}


	public int getQtdEventos() {
		return qtdEventos;
	}

	public void setQtdEventos(int qtdEventos) {
		this.qtdEventos = qtdEventos;
	}

	public ControleBancoEvento() {
		b.fillWithSomeData();
	}

	
	
}
