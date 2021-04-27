
package Modelo;

/**
 * Classe denominada Tarefa, tem como objetivo descrever as informações das
 * Tarefas para a organização do evento.
 * 
 * @author HITER E KLYSSMANN
 * @version 1.0 [Maio 2021]
 * 
 */

public class Tarefa {
	private String descricao; // descricao da tarefa: pode ser qualquer tarefa
	private String dataLimite; // data no formato Date
	private boolean concluido; // True = Tarefa concluido

	/**
	 * Construtor da classe Tarefa.
	 * 
	 * @param descricao String que descreve a tarefa a ser realizada no evento.
	 * @param data      String da data do evento.
	 */

	public Tarefa(String descricao, String data) {
		this.descricao = descricao;
		dataLimite = data; // transforma a string data no formato Date
	}

	/**
	 * Construtor da classe Tarefa sobrecarga.
	 * 
	 * @param descricao  String que descreve a tarefa a ser realizada no evento.
	 * @param dataLimite String da data limite para realização da Tarefano evento.
	 * @param concluido  Boolean se a tarefa está concluida ou não.
	 */

	public Tarefa(String descricao, String dataLimite, boolean concluido) {
		super();
		this.descricao = descricao;
		this.dataLimite = dataLimite;
		this.concluido = concluido;
	}

	/**
	 * Construtor padrão da Classe Tarefa. Sem parâmetros de entradas.
	 */

	public Tarefa() {

	}

	/*
	 * Objetivo: Getters e Setters referentes aos atributos;
	 * 
	 */

	// Objetivo: Retorna se a tarefa está concluída ou não
	public boolean isConcluido() { // retorna se a Tarfa está concluida
		return concluido;

	}

	// get da descrição
	public String getDescricao() {
		return descricao;
	}

	// set da decrição
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	// get da Data Limite
	public String getDataLimite() {
		return dataLimite;
	}

	// set da Data Limite
	public void setDataLimite(String dataLimite) {
		this.dataLimite = dataLimite;
	}

	// set do concluido
	public void setConcluido(boolean concluido) {
		this.concluido = concluido;
	}

}
