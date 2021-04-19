package Controle;

/*
Sintese
Objetivo: Classe denominada Controle Musica para controlar a classe Musica do pacote modelo; 
*/

import Modelo.Musica;

public class ControleMusica {
	private Musica musica = new Musica(); // Instanciação da classe musica do paconte modelo

	/*
	 * Objetivo: Construtor da Classe controle Musica. Entrada : Musica musica;
	 * 
	 */
	public ControleMusica(Musica musica) {
		this.musica = musica;
	}

	// get Descrição
	public String getDescricao() {
		return musica.getDescricao();
	}

	// get Valor Total Orcamento
	public double getValorTotalOrcamento() {
		return musica.getValorTotal();
	}

	// set da Descricao
	public void setDescricao(String descricao) {
		musica.setDescricao(descricao);
	}

	// set do Valor total
	public void setValorTotal(double valorTotal) {
		musica.setValorTotal(valorTotal);
	}

	// get Genero Musical
	public String getGeneroMusical() {
		return musica.getGeneroMusical();
	}

	// set do Genero musical
	public void setGeneroMusical(String generoMusical) {
		musica.setGeneroMusical(generoMusical);
	}

	// Is Dj
	public boolean isDj() {
		return musica.isDj();
	}

	// set do DJ:
	public void setDj(boolean dj) {
		musica.setDj(dj);
	}

	// Is Banda
	public boolean isBanda() {
		return musica.isBanda();
	}

	// set da banda
	public void setBanda(boolean banda) {
		musica.setBanda(banda);
	}

	// get Valor Total Musica
	public double getValorTotalMusica() {

		return musica.getValorTotal();
	}
}
