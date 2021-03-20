package Trabalho;

/*
Sintese
Objetivo: Classe denominada Programa��o para descrever a programa��o do evento; 
*/

public class Programacao {

	private String descricao; // Descri��o da Programa��o

	/*
	 * Objetivo: Construtor da Classe Programa�ao; 
	 * Entrada : descricao;
	 * 
	 */

	
	public Programacao(String descricao) {
		this.descricao = descricao;
	}

	/*
	 * Objetivo: Retorna a uma string; 
	 * Saida: descri��o;
	 * 
	 */

	public String toString() {
		return "A descri��o da Programa��o do evento �:\n " + descricao;
	}

	/*
	 * Objetivo: Retorna a uma string;
	 *  Entrada: descri��o;
	 * 
	 */
	public void atualizarProgramacao(String descricao) {

		setDescricao(descricao);

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

}
