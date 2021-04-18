
package Modelo;
/*
Sintese
Objetivo: Classe denominada Tarefa para as informações das Tarefas para a organização do evento; 
*/

public class Tarefa {
	private String descricao; // descricao da tarefa: pode ser qualquer tarefa
	private String dataLimite; // data no formato Date
	private boolean concluido; // True = Tarefa concluido

	/*
	 * Sintese Objetivo: Construtor da classe Tarefa; Entrada: descricao, data
	 */
	public Tarefa(String descricao, String data) {
		this.descricao = descricao;
		dataLimite = data; // transforma a string data no formato Date
	}

	/*
	 * Sintese Objetivo: Construtor da classe Tarefa (sobrecarga; Entrada:
	 * descricao, data, concluido
	 */
	public Tarefa(String descricao, String dataLimite, boolean concluido) {
		super();
		this.descricao = descricao;
		this.dataLimite = dataLimite;
		this.concluido = concluido;
	}

	/*
	 * Objetivo: Construtor da Classe Tarefa (sobrecarga) Entrada : sem entrada
	 * 
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
