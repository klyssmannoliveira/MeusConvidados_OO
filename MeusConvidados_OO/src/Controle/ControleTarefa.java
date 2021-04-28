package Controle;

/*
Sintese
Objetivo: Classe denominada Controle Tarefa para controlar a classe Tarefa do pacote modelo; 
*/
import Modelo.*;


/**
 * Classe denominada Controle Tarefa, tem como fun��o ligar os atributos 
 * da classe Tarefa no pacote modelo
 * com o pacote View.
 * 
 * @author HITER E KLYSSMANN
 * @version 1.0 [Maio 2021]
 * 
 */
public class ControleTarefa {

	private Tarefa tarefa = new Tarefa(); // Instancia��o da classe Tarefa do pacote modelo

	/**
	 * Construtor da Classe Controle Tarefa.
	 * @param tarefa Tarefa selecionada para adicionar/editar os atributos.
	 */
	public ControleTarefa(Tarefa tarefa) {
		this.tarefa = tarefa;
	}

	/**
	 * Retorna a descri��o da tarefa seleconada do evento.
	 * @return String com a descri��o da tarefa.
	 */
	public String getDescricao() {
		return tarefa.getDescricao();
	}

	/**
	 * Retorna a data limite para a realiza��o da tarefa do evento.
	 * @return String com a data limite da tarefa.
	 */
	public String getDataLimite() {
		return tarefa.getDataLimite();
	}

	/**
	 * Retorna se a tarefa selecionada foi conclu�da ou n�o.
	 * @return Retorna verdadeiro se a tarefa foi conclu�da e falso caso contr�rio.
	 */
	public boolean getConcluidoTarefa() {
		return tarefa.isConcluido();
	}

	/**
	 * Insere se a tarefa selecionada foi conclu�da ou n�o.
	 * @param concluido Boolean se a tarefa foi conclu�da ou n�o.
	 */
	public void setConcluidoTarefa(boolean concluido) {
		tarefa.setConcluido(concluido);
	}

	/**
	 * Insere a descri��o da tarefa a selecionada do evento.
	 * @param descricao String com a descri��o da tarefa.
	 */
	public void setDescricao(String descricao) {
		tarefa.setDescricao(descricao);
	}

	/**
	 * Insere a data limite para a realiza��o da tarefa do evento.
	 * @param dataLimite String com a data limite.
	 */
	public void setDataLimite(String dataLimite) {
		tarefa.setDataLimite(dataLimite);

	}
}
