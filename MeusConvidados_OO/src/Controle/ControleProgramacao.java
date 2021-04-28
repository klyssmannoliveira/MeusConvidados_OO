package Controle;

/*
Sintese
Objetivo: Classe denominada Controle Programacao para controlar a classe Programacao do pacote modelo; 
*/
import Modelo.Programacao;

/**
 * Classe denominada Controle Programacao, tem como função ligar os atributos 
 * da classe Programacao no pacote modelo
 * com o pacote View.
 * 
 * @author HITER E KLYSSMANN
 * @version 1.0 [Maio 2021]
 * 
 */
public class ControleProgramacao {

	private Programacao programacao = new Programacao(); // Instanciação da classe programacao do pacote modelo

	/**
	 * Construtor da Classe Controle Programacao.
	 * @param programacao Programação selecionada para adicionar/editar os atributos.
	 */
	public ControleProgramacao(Programacao programacao) {
		this.programacao = programacao;
	}

	/**
	 * Retorna a descrição da programação selecionada do evento.
	 * @return String com a descrição da programação.
	 */
	public String getDescricao() {
		return programacao.getDescricao();
	}

	/**
	 * Insere a descrição da programação selecionada do evento.
	 * @param descricao String com a descrição da programação.
	 */
	public void setDescricao(String descricao) {
		programacao.setDescricao(descricao);

	}

	/**
	 * Insere a hora da programação selecionada do evento.
	 * @param hora String com a hora da programação selecionada do evento.
	 */
	public void setHora(String hora) {
		programacao.setHora(hora);

	}

	/**
	 * Retorna a hora da programação selecionada do evento.
	 * @return String com a hora da programação selecioanda do evento.
	 */
	public String getHora() {
		return programacao.getHora();
	}

}
