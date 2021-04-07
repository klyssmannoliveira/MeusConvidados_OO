package Controle;

import java.util.ArrayList;
import java.util.Date;

import Modelo.*;

public class ControleEvento {
	private Evento evento = new Evento();

	public ControleEvento(Evento evento) {
		this.evento = evento;
	}

	public Evento getEvento() {
		return evento;
	}

	public void setEvento(Evento evento) {
		this.evento = evento;
	}

	public String getNomeEvento() {
		return evento.getNomeEvento();
	}
	
	public String getDataEvento() {
		return evento.getInformacaoEvento().getDataEvento();
	}
	
	public String getHoraiEvento() {
		return evento.getInformacaoEvento().getHoraInicio();
	}
	
	public String getHorafEvento() {
		return evento.getInformacaoEvento().getHoraTermino();
	}
	
	public String getEndereco() {
		return evento.getInformacaoEvento().getEndereco();
	}
	
	public String getCep() {
		return evento.getInformacaoEvento().getCep();
	}
	
	public String getComplemento() {
		return evento.getInformacaoEvento().getComplemento();
	}
}
	

