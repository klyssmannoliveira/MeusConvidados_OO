package Controle;

/*
Sintese
Objetivo: Classe denominada Controle Musica para controlar a classe Musica do pacote modelo; 
*/

import Modelo.Musica;


/**
 * Classe denominada Controle Música, tem como função ligar os atributos 
 * da classe Infraestrutura no pacote modelo
 * com o pacote View.
 * 
 * @author HITER E KLYSSMANN
 * @version 1.0 [Maio 2021]
 * 
 */
public class ControleMusica {
	private Musica musica = new Musica(); // Instanciação da classe musica do paconte modelo

	/**
	 * Construtor da Classe Controle Infraestrutura.
	 * @param musica Música selecionada para adicionar/editar os atributos.
	 */
	public ControleMusica(Musica musica) {
		this.musica = musica;
	}

	/**
	 * Retorna a descrição da música.
	 * @return String com a descrição da música.
	 */
	public String getDescricao() {
		return musica.getDescricao();
	}

	/**
	 * Retorna o valor total da música.
	 * @return Double com o valor total da música.
	 */
	public double getValorTotalOrcamento() {
		return musica.getValorTotal();
	}

	/**
	 * Insere a descrição da música do evento.
	 * @param descricao String com a descrição do evento.
	 */
	public void setDescricao(String descricao) {
		musica.setDescricao(descricao);
	}

	/**
	 * Insere o valor total da música no evento.
	 * @param valorTotal Double com o valor total.
	 */
	public void setValorTotal(double valorTotal) {
		musica.setValorTotal(valorTotal);
	}

	/**
	 * Retorna o gênero musical da música cadastrada (Rock, forró e etc).
	 * @return String com o gênero musical.
	 */
	public String getGeneroMusical() {
		return musica.getGeneroMusical();
	}

	/**
	 * Insere o gênero musical da música cadastrada (Rock, forró e etc).
	 * @param generoMusical String com o gênero musical.
	 */
	public void setGeneroMusical(String generoMusical) {
		musica.setGeneroMusical(generoMusical);
	}

	/**
	 * Retorna se a música é um DJ ou não.
	 * @return Boolean se é um DJ ou não.
	 */
	public boolean isDj() {
		return musica.isDj();
	}

	/**
	 * Insere se a música é um DJ ou não.
	 * @param dj Boolean se é um DJ ou não.
	 */
	public void setDj(boolean dj) {
		musica.setDj(dj);
	}

	/**
	 * Retorna se a música é uma banda ou não.
	 * @return Boolean se é uma banda ou não.
	 */
	public boolean isBanda() {
		return musica.isBanda();
	}

	/**
	 * Insere se a música é uma banda ou não.
	 * @param banda Boolean se é uma banda ou não.
	 */
	public void setBanda(boolean banda) {
		musica.setBanda(banda);
	}

	/**
	 * Retorna o valor total da música no evento.
	 * @return Double com o valor total da música
	 */
	public double getValorTotalMusica() {

		return musica.getValorTotal();
	}
}
