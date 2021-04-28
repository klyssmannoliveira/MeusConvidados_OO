package Controle;

/*
Sintese
Objetivo: Classe denominada Controle Evento para controle do evento inserido; 
*/

import java.util.ArrayList;

import Modelo.*;


/**
 * Classe denominada Controle Evento, tem como fun��o ligar os atributos 
 * da classe Evento no pacote modelo
 * com o pacote View.
 * 
 * @author HITER E KLYSSMANN
 * @version 1.0 [Maio 2021]
 * 
 */
public class ControleEvento {

	private Evento evento = new Evento(); // instancia��o da classe evento que est� no pacote modelo

	/**
	 * Construtor da Classe Controle Evento.
	 * @param evento Evento selecionado para adicionar/editar os atributos.
	 */
	public ControleEvento(Evento evento) {
		this.evento = evento;
	}

	/*
	 * Objetivo: Getters e Setters referentes ao Controle evento;
	 */
	/**
	 * Retorna o Evento selecionado.
	 * @return Retorna o Evento.
	 */
	public Evento getEvento() {
		return evento;
	}

	/**
	 * Insere o evento selecionado para adicionar/editar os atributos.
	 * @param evento Evento selecionado.
	 */
	public void setEvento(Evento evento) {
		this.evento = evento;
	}

	/**
	 * Retorna o nome do evento selecionado.
	 * @return String com o nome do Evento.
	 */
	public String getNomeEvento() {
		return evento.getNomeEvento();
	}

	/**
	 * Insere o nome do evento.
	 * @param nome String com o nome do Evento.
	 */
	public void setNomeEvento(String nome) {
		evento.setNomeEvento(nome);
	}

	/**
	 * Retorna a data do evento selecionado.
	 * @return String com a data do evento.
	 */
	public String getDataEvento() {
		return evento.getInformacaoEvento().getDataEvento();
	}

	/**
	 * Insere a data do evento.
	 * @param data String com a data do evento.
	 */
	public void setDataEvento(String data) {
		evento.getInformacaoEvento().setDataEvento(data);
	}

	/**
	 * Retorna a hora de in�cio do evento selecionado.
	 * @return String com a hora de in�cio do evento.
	 */
	public String getHoraiEvento() {
		return evento.getInformacaoEvento().getHoraInicio();
	}

	/**
	 * Insere a hora de in�cio do evento.
	 * @param horai String com a hora de in�cio do evento.
	 */
	public void setHoraiEvento(String horai) {
		evento.getInformacaoEvento().setHoraInicio(horai);
	}

	/**
	 * Retorna a hora de t�rmino do evento selecionado.
	 * @return String com a hora de t�rmino do evento.
	 */
	public String getHorafEvento() {
		return evento.getInformacaoEvento().getHoraTermino();
	}

	/**
	 * Insere a hora de t�rmino do evento.
	 * @param horaf String com a hora de t�rmino do evento.
	 */
	public void setHorafEvento(String horaf) {
		evento.getInformacaoEvento().setHoraTermino(horaf);
	}

	/**
	 * Retorna o endere�o de onde ser� o evento.
	 * @return String com o endere�o do evento.
	 */
	public String getEndereco() {
		return evento.getInformacaoEvento().getEndereco();
	}

	/**
	 * Insere o endere�o do evento.
	 * @param end String com o endere�o do evento.
	 */
	public void setEndereco(String end) {
		evento.getInformacaoEvento().setEndereco(end);
	}

	/**
	 * Retorna o C�digo de Endere�amento Postal do Evento.
	 * @return String com o CEP do Evento.
	 */
	public String getCep() {
		return evento.getInformacaoEvento().getCep();
	}

	/**
	 * Insere o C�digo de Endere�amento Postal do Evento.
	 * @param cep String com o CEP do evento.
	 */
	public void setCep(String cep) {
		evento.getInformacaoEvento().setCep(cep);
	}

	/**
	 * Retorna o complemento do endere�o do evento.
	 * @return String com o complemento do evento.
	 */
	public String getComplemento() {
		return evento.getInformacaoEvento().getComplemento();
	}

	/**
	 * Insere o complemento do endere�o do evento.
	 * @param complemen String com o complemento do evento.
	 */
	public void setComplemento(String complemen) {
		evento.getInformacaoEvento().setComplemento(complemen);
	}

	/**
	 * Retorna a quantidade total de convidados e acompanhantes no evento selecionado.
	 * @return Inteiro com a quantidade de participantes do evento.
	 */
	public int getTotalConvidados() {
		return evento.getTotalConvidados();
	}

	/**
	 * Retorna a taxa de realiza��o de tarefas do evento.
	 * @return Double com a porcentagem da realiza��o das tarefas.
	 */
	public double getTaxaTarefas() {
		return evento.getTaxaTarefas();
	}

	/**
	 * Retorna o valor do or�amento previsto para a realiza��o do evento.
	 * @return Double com o valor do or�amento previsto.
	 */
	public double getOrcamentoPrevisto() {
		return evento.getOrcamentoPrevisto();
	}

	/**
	 * Insere o or�amento previsto para a realiza��o do evento.
	 * @param orcamentoPrevisto Double com o valor do or�amento previsto.
	 */
	public void setOrcamentoPrevisto(double orcamentoPrevisto) {
		evento.setOrcamentoPrevisto(orcamentoPrevisto);
	}

	/**
	 * Retorna o valor total de gastos para a realiza��o do evento.
	 * @return Double com o valor total de gastos.
	 */
	public double getTotalGasto() {
		return evento.getTotalGasto();
	}

	/**
	 * Retorna um vetor de String com os nomes dos 
	 * convidados do evento. � utilizado no JList da lista de convidados.
	 * @return Vetor de String com os nomes dos convidados.
	 */
	public String[] getNomesConvidados() {
		return evento.listarConvidados();
	}

	/**
	 * Retorna um vetor de String com as descri��es das 
	 * tarefas para a realiza��o do evento. � utilizado no JList da lista de tarefas.
	 * @return Vetor de String com as descri��es das tarefas.
	 */
	public String[] getNomesTarefas() {
		return evento.listarTarefas();
	}

	/**
	 * Retorna um vetor de String com as descri��es dos 
	 * or�amentos para a realiza��o do evento. � utilizado no JList da lista de or�amentos.
	 * @return Vetor de String com as descri��es dos or�amentos.
	 */
	public String[] getNomesOrcamento() {
		return evento.listarOrcamentos();
	}

	/**
	 * Retorna um ArrayList de Convidados do Evento.
	 * @return ArrayList dos convidados.
	 */
	public ArrayList<Convidado> getBdConvidados() {
		return evento.getBdConvidados();
	}

	/**
	 * Retorna um ArrayList de Tarefas do Evento.
	 * @return ArrayList das tarefas.
	 */
	public ArrayList<Tarefa> getBdTarefas() {
		return evento.getBdTarefas();
	}

	/**
	 * Retorna um ArrayList de Orcamento do Evento.
	 * @return ArrayList dos or�amentos.
	 */
	public ArrayList<Orcamento> getBdOrcamentos() {
		return evento.getBdOrcamentos();
	}

	/**
	 * Retorna um ArrayList de Bebida do Evento.
	 * @return ArrayList das bebidas.
	 */
	public ArrayList<Bebida> getBdBebida() {
		return evento.getBdBebida();
	}

	/**
	 * Retorna um ArrayList de Comida do Evento.
	 * @return ArrayList das comidas.
	 */
	public ArrayList<Comida> getBdComida() {
		return evento.getBdComida();
	}

	/**
	 * Retorna um ArrayList de Infraestrutura do Evento.
	 * @return ArrayList da infraestrutura.
	 */
	public ArrayList<Infraestrutura> getBdInfraestrutura() {
		return evento.getBdInfraestrutura();
	}

	/**
	 * Retorna um ArrayList de Musica do Evento.
	 * @return ArrayList da Musica.
	 */
	public ArrayList<Musica> getBdMusica() {
		return evento.getBdMusica();
	}

	/**
	 * Retorna um ArrayList de Programacao do Evento.
	 * @return ArrayList da Programa��o.
	 */
	public ArrayList<Programacao> getBdProgramacao() {
		return evento.getBdProgramacao();
	}

	/**
	 * Adiciona o convidado dentro do ArrayList BdConvidados.
	 * @param convidado Convidado a ser adicionado.
	 */
	public void adicionarConvidado(Convidado convidado) {

		evento.adicionarConvidado(convidado);

	}

	/**
	 * Adiciona a tarefa dentro do ArrayList BdTarefas.
	 * @param tarefa Tarefa a ser adicionada.
	 */
	public void adicionarTarefa(Tarefa tarefa) {

		evento.adicionarTarefa(tarefa);

	}

	/**
	 * Adiciona o or�amento dentro do ArrayList BdOrcamentos.
	 * @param orcamento Or�amento a ser adicionado.
	 */
	public void adicionarOrcamento(Orcamento orcamento) {

		evento.adicionarOrcamento(orcamento);

	}

	/**
	 * Adiciona a bebida dentro do ArrayList BdBebidas.
	 * @param bebida Bebida a ser adicionada.
	 */
	public void adicionarBebida(Bebida bebida) {

		evento.adicionarBebida(bebida);

	}

	/**
	 * Adiciona a comida dentro do ArrayList BdComidas.
	 * @param comida Comida a ser adicionada.
	 */
	public void adicionarComida(Comida comida) {

		evento.adicionarComida(comida);

	}

	/**
	 * Adiciona a infraestrutura dentro do ArrayList BdInfraestrutura.
	 * @param infraestrutura Infraestrutura a ser adicionada.
	 */
	public void adicionarInfraestrutura(Infraestrutura infraestrutura) {

		evento.adicionarInfraestrutura(infraestrutura);

	}

	/**
	 * Adiciona a m�sica dentro do ArrayList BdMusicas.
	 * @param musica M�sica a ser adicionada.
	 */
	public void adicionarMusica(Musica musica) {

		evento.adicionarMusica(musica);

	}

	/**
	 * Adiciona a programa��o dentro do ArrayList BdProgramacao.
	 * @param programacao Programa��o a ser adicionada.
	 */
	public void adicionarProgramacao(Programacao programacao) {

		evento.adicionarProgramacao(programacao);

	}

	/**
	 * Remove o convidado selecionado.
	 * @param posConvidado Inteiro com a posi��o do convidado no ArrayList bdConvidados.
	 * @return Verdadeiro se o convidado foi exclu�do e falso caso contr�rio.
	 */
	public boolean removerConvidado(int posConvidado) {

		if (evento.removerConvidado(posConvidado))
			return true;
		else
			return false;

	}

	/**
	 * Remove a tarefa selecionada.
	 * @param posTarefa Inteiro com a posi��o da tarefa no ArrayList bdTarefas.
	 * @return Verdadeiro se a tarefa foi exclu�da e falso caso contr�rio.
	 */
	public boolean removerTarefa(int posTarefa) {

		if (evento.removerTarefa(posTarefa))
			return true;
		else
			return false;

	}

	/**
	 * Remove o or�amento selecionado.
	 * @param posOrcamento Inteiro com a posi��o do orcamento no ArrayList bdOrcamento.
	 * @return Verdadeiro se o orcamento foi exclu�do e falso caso contr�rio.
	 */
	public boolean removerOrcamento(int posOrcamento) {

		if (evento.removerOrcamento(posOrcamento))
			return true;
		else
			return false;

	}

	/**
	 * Remove a bebida selecionada.
	 * @param posBebida Inteiro com a posi��o da bebida no ArrayList bdBebida.
	 * @return Verdadeiro se a bebida foi exclu�da e falso caso contr�rio.
	 */
	public boolean removerBebida(int posBebida) {

		if (evento.removerBebida(posBebida))
			return true;
		else
			return false;

	}

	/**
	 * Remove a comida selecionada.
	 * @param posComida Inteiro com a posi��o da comida no ArrayList bdComida.
	 * @return Verdadeiro se a comida foi exclu�da e falso caso contr�rio.
	 */
	public boolean removerComida(int posComida) {

		if (evento.removerComida(posComida))
			return true;
		else
			return false;

	}

	/**
	 * Remove a infraestrutura selecionada.
	 * @param posInfraestrutura Inteiro com a posi��o da 
	 * infraestrutura no ArrayList bdInfraestrutura.
	 * @return Verdadeiro se a infraestrutura foi exclu�da e falso caso contr�rio.
	 */
	public boolean removerInfraestrutura(int posInfraestrutura) {

		if (evento.removerInfraestrutura(posInfraestrutura))
			return true;
		else
			return false;

	}

	/**
	 * Remove a m�sica selecionada.
	 * @param posMusica Inteiro com a posi��o da m�sica no ArrayList bdMusica.
	 * @return Verdadeiro se a M�sica foi exclu�da e falso caso contr�rio.
	 */
	public boolean removerMusica(int posMusica) {

		if (evento.removerMusica(posMusica))
			return true;
		else
			return false;

	}

	/**
	 * Remove a programa��o selecionada.
	 * @param posProgramacao Inteiro com a posi��o da programa��o no ArrayList bdProgramacao.
	 * @return Verdadeiro se a Programa��o foi exclu�da e falso caso contr�rio.
	 */
	public boolean removerProgramacao(int posProgramacao) {

		if (evento.removerProgramacao(posProgramacao))
			return true;
		else
			return false;

	}

	/**
	 * Retorna um vetor de String com a descri��o da programa��o do evento.
	 * @return Vetor de String com a descri��o.
	 */
	public String[] getDescricaoProgramacao() {
		return evento.listarProgramacaoDescricao();
	}

	/**
	 * Retorna um vetor de Strng com a hora da programa��o do evento.
	 * @return Vetor de String com a hora.
	 */
	public String[] getHoraProgramacao() {
		return evento.listarProgramacaoHora();
	}

}
