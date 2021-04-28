package Controle;

/*
Sintese
Objetivo: Classe denominada Controle Musica para controlar a classe Musica do pacote modelo; 
*/

import Modelo.Musica;

/**
 * Classe denominada Controle M�sica, tem como fun��o ligar os atributos 
 * da classe Infraestrutura no pacote modelo
 * com o pacote View.
 * 
 * @author HITER E KLYSSMANN
 * @version 1.0 [Maio 2021]
 * 
 */
public class ControleMusica {
	private Musica musica = new Musica(); // Instancia��o da classe musica do paconte modelo

	/**
	 * Construtor da Classe Controle Infraestrutura.
	 * @param musica M�sica selecionada para adicionar/editar os atributos.
	 */
	public ControleMusica(Musica musica) {
		this.musica = musica;
	}

	/**
	 * Retorna a descri��o da m�sica.
	 * @return String com a descri��o da m�sica.
	 */
	public String getDescricao() {
		return musica.getDescricao();
	}

	/**
	 * Retorna o valor total da m�sica.
	 * @return Double com o valor total da m�sica.
	 */
	public double getValorTotalOrcamento() {
		return musica.getValorTotal();
	}

	/**
	 * Insere a descri��o da m�sica do evento.
	 * @param descricao String com a descri��o do evento.
	 */
	public void setDescricao(String descricao) {
		musica.setDescricao(descricao);
	}

	/**
	 * Insere o valor total da m�sica no evento.
	 * @param valorTotal Double com o valor total.
	 */
	public void setValorTotal(double valorTotal) {
		musica.setValorTotal(valorTotal);
	}

	/**
	 * Retorna o g�nero musical da m�sica cadastrada (Rock, forr� e etc).
	 * @return String com o g�nero musical.
	 */
	public String getGeneroMusical() {
		return musica.getGeneroMusical();
	}

	/**
	 * Insere o g�nero musical da m�sica cadastrada (Rock, forr� e etc).
	 * @param generoMusical String com o g�nero musical.
	 */
	public void setGeneroMusical(String generoMusical) {
		musica.setGeneroMusical(generoMusical);
	}

	/**
	 * Retorna se a m�sica � um DJ ou n�o.
	 * @return Boolean se � um DJ ou n�o.
	 */
	public boolean isDj() {
		return musica.isDj();
	}

	/**
	 * Insere se a m�sica � um DJ ou n�o.
	 * @param dj Boolean se � um DJ ou n�o.
	 */
	public void setDj(boolean dj) {
		musica.setDj(dj);
	}

	/**
	 * Retorna se a m�sica � uma banda ou n�o.
	 * @return Boolean se � uma banda ou n�o.
	 */
	public boolean isBanda() {
		return musica.isBanda();
	}

	/**
	 * Insere se a m�sica � uma banda ou n�o.
	 * @param banda Boolean se � uma banda ou n�o.
	 */
	public void setBanda(boolean banda) {
		musica.setBanda(banda);
	}

	/**
	 * Retorna o valor total da m�sica no evento.
	 * @return
	 */
	public double getValorTotalMusica() {

		return musica.getValorTotal();
	}
}
