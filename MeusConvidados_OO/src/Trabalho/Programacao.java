package Trabalho;

/*
Sintese
Objetivo: Classe denominada Programação para descrever a programação do evento; 
*/

public class Programacao {

	private String descricao; // Descrição da Programação

	/*
	 * Objetivo: Construtor da Classe Programaçao; 
	 * Entrada : descricao;
	 * 
	 */

	public Programacao(String descricao) {
		this.descricao = descricao;
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
	 * Objetivo: Retorna a uma string;
	 *  Entrada: descrição;
	 * 
	 */
	public void atualizarProgramacao(String descricao) {

		setDescricao(descricao);

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

}
