
package Modelo;

/**
 * Classe denominada Tarefa. Tem como objetivo descrever as informa��es das
 * Tarefas para a organiza��o do evento.
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
	 * Construtor da classe Tarefa
	 * 
	 * @param descricao. String que descreve a tarefa a ser realizada no evento.
	 * @param data.      String da data do evento.
	 */

	public Tarefa(String descricao, String data) {
		this.descricao = descricao;
		dataLimite = data; // transforma a string data no formato Date
	}

	/**
	 * Construtor da classe Tarefa sobrecarga
	 * 
	 * @param descricao.  String que descreve a tarefa a ser realizada no evento.
	 * @param dataLimite. String da data limite para realiza��o da Tarefano evento.
	 * @param concluido.  Boolean se a tarefa est� concluida ou n�o.
	 */

	public Tarefa(String descricao, String dataLimite, boolean concluido) {
		super();
		this.descricao = descricao;
		this.dataLimite = dataLimite;
		this.concluido = concluido;
	}

	/**
	 * Construtor padr�o da Classe Tarefa. Sem par�metros de entradas.
	 */

	public Tarefa() {

	}

	/*
	 * Objetivo: Getters e Setters referentes aos atributos;
	 * 
	 */

	// Objetivo: Retorna se a tarefa est� conclu�da ou n�o
	public boolean isConcluido() { // retorna se a Tarfa est� concluida
		return concluido;

	}

	// get da descri��o
	public String getDescricao() {
		return descricao;
	}

	// set da decri��o
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
