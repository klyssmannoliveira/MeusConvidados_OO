package Controle;

import java.util.ArrayList;

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
	
	public void setOrcamentoPrevisto(double orcamentoPrevisto) {
		evento.setOrcamentoPrevisto(orcamentoPrevisto);
	}

	public double getTotalGasto() {
		return evento.getTotalGasto();
	}

	public String[] getNomesConvidados() {
		return evento.listarConvidados();
	}

	public String[] getNomesTarefas() {
		return evento.listarTarefas();
	}

	public String[] getNomesOrcamento() {
		return evento.listarOrcamentos();
	}

	public ArrayList<Convidado> getBdConvidados() {
		return evento.getBdConvidados();
	}

	public ArrayList<Tarefa> getBdTarefas() {
		return evento.getBdTarefas();
	}

	public ArrayList<Orcamento> getBdOrcamentos() {
		return evento.getBdOrcamentos();
	}
	
	public ArrayList<Bebida> getBdBebida() {
		return evento.getBdBebida();
	}

	public ArrayList<Comida> getBdComida() {
		return evento.getBdComida();
	}
	
	public ArrayList<Infraestrutura> getBdInfraestrutura() {
		return evento.getBdInfraestrutura();
	}
	
	public ArrayList<Musica> getBdMusica() {
		return evento.getBdMusica();
	}
	
	public ArrayList<Programacao> getBdProgramacao() {
		return evento.getBdProgramacao();
	}
	
	
	public void adicionarConvidado(Convidado convidado) {

		evento.adicionarConvidado(convidado);

	}

	public void adicionarTarefa(Tarefa tarefa) {

		evento.adicionarTarefa(tarefa);

	}
	
	public void adicionarOrcamento(Orcamento orcamento) {

		evento.adicionarOrcamento(orcamento);

	}
	
	public void adicionarBebida(Bebida bebida) {

		evento.adicionarBebida(bebida);

	}
	public void adicionarComida(Comida comida) {

		evento.adicionarComida(comida);

	}
	public void adicionarInfraestrutura(Infraestrutura infraestrutura) {

		evento.adicionarInfraestrutura(infraestrutura);

	}
	public void adicionarMusica(Musica musica) {

		evento.adicionarMusica(musica);

	}
	
	public void adicionarProgramacao(Programacao programacao) {

		evento.adicionarProgramacao(programacao);

	}

	public boolean removerConvidado(int posConvidado) {

		if (evento.removerConvidado(posConvidado))
			return true;
		else
			return false;

	}

	public boolean removerTarefa(int posTarefa) {

		if (evento.removerTarefa(posTarefa))
			return true;
		else
			return false;

	}
	
	public boolean removerOrcamento(int posOrcamento) {

		if (evento.removerOrcamento(posOrcamento))
			return true;
		else
			return false;

	}
	
	public boolean removerBebida(int posBebida) {

		if (evento.removerBebida(posBebida))
			return true;
		else
			return false;

	}
	public boolean removerComida(int posComida) {

		if (evento.removerComida(posComida))
			return true;
		else
			return false;

	}
	public boolean removerInfraestrutura(int posInfraestrutura) {

		if (evento.removerInfraestrutura(posInfraestrutura))
			return true;
		else
			return false;

	}
	public boolean removerMusica(int posMusica) {

		if (evento.removerMusica(posMusica))
			return true;
		else
			return false;

	}
	
	public boolean removerProgramacao(int posProgramacao) {

		if (evento.removerProgramacao(posProgramacao))
			return true;
		else
			return false;

	}
	
	public String[] getDescricaoProgramacao() {
		return evento.listarProgramacaoDescricao();
	}

	public String[] getHoraProgramacao() {
		return evento.listarProgramacaoHora();
	}
	
	
	
	
}
