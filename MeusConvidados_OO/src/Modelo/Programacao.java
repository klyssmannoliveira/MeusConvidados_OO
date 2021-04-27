package Modelo;

/**
 * Classe denominada Programacao, tem como objetivo descrever as informa��es da
 * programa��o do evento por meio da hora/descri��o.
 * 
 * @author HITER E KLYSSMANN
 * @version 1.0 [Maio 2021]
 * 
 */

public class Programacao {

	private String descricao; // Descri��o da Programa��o
	private String hora; // hora programa��o

	/**
	 * Construtor da classe Programacao.
	 * 
	 * @param descricao String que descreve a programa��o do respectivo evento.
	 * @param hora      String que fornece a hora da programa��o do evento.
	 */
	/*
	 * Objetivo: Construtor da Classe Programa�ao; Entrada : descricao, hora;
	 * 
	 */

	public Programacao(String descricao, String hora) {
		this.descricao = descricao;
		this.hora = hora;
	}

	/**
	 * Construtor padr�o da Classe Programacao. Sem par�metros de entradas.
	 */

	public Programacao() {

	}

	/*
	 * Objetivo: Retorna a uma string; Saida: descri��o;
	 * 
	 */

	public String toString() {
		return "A descri��o da Programa��o do evento �:\n " + descricao;
	}

	/*
	 * Objetivo: Getters e Setters referentes a Programa��o;
	 * 
	 */

	// get da descri��o da programa��o;
	public String getDescricao() {
		return descricao;
	}

	// set da descri��o da programa��o;
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	// get da horada programa��o;
	public String getHora() {
		return hora;
	}

	// set da hora da programa��o;
	public void setHora(String hora) {
		this.hora = hora;
	}

}
