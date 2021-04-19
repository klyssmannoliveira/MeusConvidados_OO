package Controle;

/*
Sintese
Objetivo: Classe denominada Controle Evento para controle do evento inserido; 
*/

import java.util.ArrayList;

import Modelo.*;

public class ControleEvento {

	private Evento evento = new Evento(); // instanciação da classe evento que está no pacote modelo

	/*
	 * Objetivo: Construtor da Classe Controle Evento; Entrada : Evento evento;
	 * 
	 */
	public ControleEvento(Evento evento) {
		this.evento = evento;
	}

	/*
	 * Objetivo: Getters e Setters referentes ao Controle evento;
	 */
	// get Evento;
	public Evento getEvento() {
		return evento;
	}

	// set Evento
	public void setEvento(Evento evento) {
		this.evento = evento;
	}

	// get Nome Evento
	public String getNomeEvento() {
		return evento.getNomeEvento();
	}

	// set Nome Evento
	public void setNomeEvento(String nome) {
		evento.setNomeEvento(nome);
	}

	// get Data Evento
	public String getDataEvento() {
		return evento.getInformacaoEvento().getDataEvento();
	}

	// set Data Evento
	public void setDataEvento(String data) {
		evento.getInformacaoEvento().setDataEvento(data);
	}

	// get Hora Inicio Evento
	public String getHoraiEvento() {
		return evento.getInformacaoEvento().getHoraInicio();
	}

	// set Horai Evento
	public void setHoraiEvento(String horai) {
		evento.getInformacaoEvento().setHoraInicio(horai);
	}

	// get Hora Evento
	public String getHorafEvento() {
		return evento.getInformacaoEvento().getHoraTermino();
	}

	// set Hora Evento
	public void setHorafEvento(String horaf) {
		evento.getInformacaoEvento().setHoraTermino(horaf);
	}

	// get Endereço
	public String getEndereco() {
		return evento.getInformacaoEvento().getEndereco();
	}

	// set Endereço
	public void setEndereco(String end) {
		evento.getInformacaoEvento().setEndereco(end);
	}

	// get CEP
	public String getCep() {
		return evento.getInformacaoEvento().getCep();
	}

	// set CEP
	public void setCep(String cep) {
		evento.getInformacaoEvento().setCep(cep);
	}

	// get Complemento
	public String getComplemento() {
		return evento.getInformacaoEvento().getComplemento();
	}

	// set Complemento
	public void setComplemento(String complemen) {
		evento.getInformacaoEvento().setComplemento(complemen);
	}

	// get Total Convidado
	public int getTotalConvidados() {
		return evento.getTotalConvidados();
	}

	// get Taxa Tarefas
	public double getTaxaTarefas() {
		return evento.getTaxaTarefas();
	}

	// get Orçamento Previsto
	public double getOrcamentoPrevisto() {
		return evento.getOrcamentoPrevisto();
	}

	// set orcamento Previsto
	public void setOrcamentoPrevisto(double orcamentoPrevisto) {
		evento.setOrcamentoPrevisto(orcamentoPrevisto);
	}

	// get Total Gasto
	public double getTotalGasto() {
		return evento.getTotalGasto();
	}

	// get Nomes convidados
	public String[] getNomesConvidados() {
		return evento.listarConvidados();
	}

	// get Nomes Tarefas
	public String[] getNomesTarefas() {
		return evento.listarTarefas();
	}

	// get Nomes Orcamento
	public String[] getNomesOrcamento() {
		return evento.listarOrcamentos();
	}

	// get banco convidados
	public ArrayList<Convidado> getBdConvidados() {
		return evento.getBdConvidados();
	}

	// get banco tarefas
	public ArrayList<Tarefa> getBdTarefas() {
		return evento.getBdTarefas();
	}

	// get banco orcamentos
	public ArrayList<Orcamento> getBdOrcamentos() {
		return evento.getBdOrcamentos();
	}

	// get banco bebidas
	public ArrayList<Bebida> getBdBebida() {
		return evento.getBdBebida();
	}

	// get banco comida
	public ArrayList<Comida> getBdComida() {
		return evento.getBdComida();
	}

	// get banco infraestrutura
	public ArrayList<Infraestrutura> getBdInfraestrutura() {
		return evento.getBdInfraestrutura();
	}

	// get banco musica
	public ArrayList<Musica> getBdMusica() {
		return evento.getBdMusica();
	}

	// get banco programação
	public ArrayList<Programacao> getBdProgramacao() {
		return evento.getBdProgramacao();
	}

	/*
	 * Objetivo: Adicionar convidados ; Entrada: Convidado convidado;
	 */
	public void adicionarConvidado(Convidado convidado) {

		evento.adicionarConvidado(convidado);

	}

	/*
	 * Objetivo: Adicionar Tarefas ; Entrada: Tarefa tarefa;
	 */
	public void adicionarTarefa(Tarefa tarefa) {

		evento.adicionarTarefa(tarefa);

	}

	/*
	 * Objetivo: Adicionar Orcamentos ; Entrada: Orcamento orcamento;
	 */
	public void adicionarOrcamento(Orcamento orcamento) {

		evento.adicionarOrcamento(orcamento);

	}

	/*
	 * Objetivo: Adicionar Bebidas ; Entrada: Bebida bebida;
	 */
	public void adicionarBebida(Bebida bebida) {

		evento.adicionarBebida(bebida);

	}

	/*
	 * Objetivo: Adicionar Comida ; Entrada: Comida comida;
	 */
	public void adicionarComida(Comida comida) {

		evento.adicionarComida(comida);

	}

	/*
	 * Objetivo: Adicionar Infraestrutura ; Entrada: Infraestrutura infraestrutura;
	 */
	public void adicionarInfraestrutura(Infraestrutura infraestrutura) {

		evento.adicionarInfraestrutura(infraestrutura);

	}

	/*
	 * Objetivo: Adicionar Musica ; Entrada: Musica musica;
	 */
	public void adicionarMusica(Musica musica) {

		evento.adicionarMusica(musica);

	}

	/*
	 * Objetivo: Adicionar Programacao ; Entrada: Programacao programacao;
	 */
	public void adicionarProgramacao(Programacao programacao) {

		evento.adicionarProgramacao(programacao);

	}

	/*
	 * Objetivo:Remover Convidado ; Entrada: posConvidado;
	 */
	public boolean removerConvidado(int posConvidado) {

		if (evento.removerConvidado(posConvidado))
			return true;
		else
			return false;

	}

	/*
	 * Objetivo:Remover Tarefa; Entrada: posTarefa;
	 */
	public boolean removerTarefa(int posTarefa) {

		if (evento.removerTarefa(posTarefa))
			return true;
		else
			return false;

	}

	/*
	 * Objetivo:Remover Orcamento ; Entrada: posOrcamento;
	 */
	public boolean removerOrcamento(int posOrcamento) {

		if (evento.removerOrcamento(posOrcamento))
			return true;
		else
			return false;

	}

	/*
	 * Objetivo:Remover Bebida ; Entrada: posBebida;
	 */
	public boolean removerBebida(int posBebida) {

		if (evento.removerBebida(posBebida))
			return true;
		else
			return false;

	}

	/*
	 * Objetivo: Remover Comida ; Entrada: posComida;
	 */
	public boolean removerComida(int posComida) {

		if (evento.removerComida(posComida))
			return true;
		else
			return false;

	}

	/*
	 * Objetivo:Remover Infraestrutura ; Entrada: posInfraestrutura;
	 */
	public boolean removerInfraestrutura(int posInfraestrutura) {

		if (evento.removerInfraestrutura(posInfraestrutura))
			return true;
		else
			return false;

	}

	/*
	 * Objetivo:Remover Musica ; Entrada: posMusica;
	 */
	public boolean removerMusica(int posMusica) {

		if (evento.removerMusica(posMusica))
			return true;
		else
			return false;

	}

	/*
	 * Objetivo:Remover Programacao ; Entrada: posProgramacao;
	 */
	public boolean removerProgramacao(int posProgramacao) {

		if (evento.removerProgramacao(posProgramacao))
			return true;
		else
			return false;

	}

	// get Descricao Programacao
	public String[] getDescricaoProgramacao() {
		return evento.listarProgramacaoDescricao();
	}

	// get Hora Programacao
	public String[] getHoraProgramacao() {
		return evento.listarProgramacaoHora();
	}

}
