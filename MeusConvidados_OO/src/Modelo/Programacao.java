package Modelo;

/*
Sintese
Objetivo: Classe denominada Programação para descrever a programação do evento; 
*/

public class Programacao {

	private String descricao; // Descrição da Programação
	private String hora;     // hora programação

	/*
	 * Objetivo: Construtor da Classe Programaçao; 
	 * Entrada : descricao;
	 * 
	 */

	public Programacao(String descricao, String hora ) {
		this.descricao = descricao;
		this.hora = hora;
	}

	public Programacao() {
		
	}
	
	/*
	 * Objetivo: Retorna a uma string; 
	 * Saida: descrição;
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

	
	
	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	
	
}
