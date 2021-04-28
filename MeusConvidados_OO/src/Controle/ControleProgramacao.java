package Controle;

/*
Sintese
Objetivo: Classe denominada Controle Programacao para controlar a classe Programacao do pacote modelo; 
*/
import Modelo.Programacao;

/**
 * Classe denominada Controle Programacao, tem como fun��o ligar os atributos 
 * da classe Programacao no pacote modelo
 * com o pacote View.
 * 
 * @author HITER E KLYSSMANN
 * @version 1.0 [Maio 2021]
 * 
 */
public class ControleProgramacao {

	private Programacao programacao = new Programacao(); // Instancia��o da classe programacao do pacote modelo

	/**
	 * Construtor da Classe Controle Programacao.
	 * @param programacao Programa��o selecionada para adicionar/editar os atributos.
	 */
	public ControleProgramacao(Programacao programacao) {
		this.programacao = programacao;
	}

	/**
	 * Retorna a descri��o da programa��o selecionada do evento.
	 * @return String com a descri��o da programa��o.
	 */
	public String getDescricao() {
		return programacao.getDescricao();
	}

	/**
	 * Insere a descri��o da programa��o selecionada do evento.
	 * @param descricao String com a descri��o da programa��o.
	 */
	public void setDescricao(String descricao) {
		programacao.setDescricao(descricao);

	}

	/**
	 * Insere a hora da programa��o selecionada do evento.
	 * @param hora String com a hora da programa��o selecionada do evento.
	 */
	public void setHora(String hora) {
		programacao.setHora(hora);

	}

	/**
	 * Retorna a hora da programa��o selecionada do evento.
	 * @return String com a hora da programa��o selecioanda do evento.
	 */
	public String getHora() {
		return programacao.getHora();
	}

}
