package Modelo;

/**
 * Classe denominada Programacao, tem como objetivo descrever as informações da
 * programação do evento por meio da hora/descrição.
 * 
 * @author HITER E KLYSSMANN
 * @version 1.0 [Maio 2021]
 * 
 */

public class Programacao {

	private String descricao; // Descrição da Programação
	private String hora; // hora programação

	/**
	 * Construtor da classe Programacao.
	 * 
	 * @param descricao String que descreve a programação do respectivo evento.
	 * @param hora      String que fornece a hora da programação do evento.
	 */
	/*
	 * Objetivo: Construtor da Classe Programaçao; Entrada : descricao, hora;
	 * 
	 */

	public Programacao(String descricao, String hora) {
		this.descricao = descricao;
		this.hora = hora;
	}

	/**
	 * Construtor padrão da Classe Programacao. Sem parâmetros de entradas.
	 */

	public Programacao() {

	}

	/*
	 * Objetivo: Retorna a uma string; Saida: descrição;
	 * 
	 */

	public String toString() {
		return "A descrição da Programação do evento é:\n " + descricao;
	}

	/*
	 * Objetivo: Getters e Setters referentes a Programação;
	 * 
	 */

	// get da descrição da programação;
	public String getDescricao() {
		return descricao;
	}

	// set da descrição da programação;
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	// get da horada programação;
	public String getHora() {
		return hora;
	}

	// set da hora da programação;
	public void setHora(String hora) {
		this.hora = hora;
	}

}
