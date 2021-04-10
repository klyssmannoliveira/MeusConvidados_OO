package Controle;

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
	
	public void setNomeEvento(String nome) {
		evento.setNomeEvento(nome);
	}
	
	public String getDataEvento() {
		return evento.getInformacaoEvento().getDataEvento();
	}
	
	public void setDataEvento(String data) {
		evento.getInformacaoEvento().setDataEvento(data);
	}
	
	public String getHoraiEvento() {
		return evento.getInformacaoEvento().getHoraInicio();
	}
	
	public void setHoraiEvento(String horai) {
		evento.getInformacaoEvento().setHoraInicio(horai);
	}
	
	public String getHorafEvento() {
		return evento.getInformacaoEvento().getHoraTermino();
	}
	
	public void setHorafEvento(String horaf) {
		evento.getInformacaoEvento().setHoraTermino(horaf);
	}
	
	public String getEndereco() {
		return evento.getInformacaoEvento().getEndereco();
	}
	
	public void setEndereco(String end) {
		evento.getInformacaoEvento().setEndereco(end);
	}
	
	public String getCep() {
		return evento.getInformacaoEvento().getCep();
	}
	
	public void setCep(String cep) {
		evento.getInformacaoEvento().setCep(cep);
	}
	
	public String getComplemento() {
		return evento.getInformacaoEvento().getComplemento();
	}
	
	public void setComplemento(String complemen) {
		evento.getInformacaoEvento().setComplemento(complemen);
	}
	
	public int getTotalConvidados() {
		return evento.getTotalConvidados();
	}
	
	public double getTaxaTarefas() {
		return evento.getTaxaTarefas();
	}
	
	
	public double getOrcamentoPrevisto() {
		return evento.getOrcamentoPrevisto();
	}
	
	public double getTotalGasto() {
		return evento.getTotalGasto();
	}
	
	public String[] getNomesConvidados()
	{
		return evento.listarConvidados();
	}
	
	public String[] getNomesTarefas()
	{
		return evento.listarTarefas();
	}
	
	public String[] getNomesOrcamento()
	{
		return evento.listarOrcamentos();
	}
}
	

