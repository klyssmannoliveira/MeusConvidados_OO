package Controle;

import Modelo.Musica;

public class ControleMusica {
	private Musica musica = new Musica();

	public ControleMusica(Musica musica) {
		this.musica = musica;
	}

	public String getDescricao() {
		return musica.getDescricao();
	}

	public double getValorTotalOrcamento() {
		return musica.getValorTotal();
	}

	// set da descricao
	public void setDescricao(String descricao) {
		musica.setDescricao(descricao);
	}

	// set do valor total
	public void setValorTotal(double valorTotal) {
		musica.setValorTotal(valorTotal);
	}

	public String getGeneroMusical() {
		return musica.getGeneroMusical();
	}

	// set do genero musical
	public void setGeneroMusical(String generoMusical) {
		musica.setGeneroMusical(generoMusical);
	}

	public boolean isDj() {
		return musica.isDj();
	}

	// set do DJ:
	public void setDj(boolean dj) {
		musica.setDj(dj);
	}

	public boolean isBanda() {
		return musica.isBanda();
	}

	// set da banda
	public void setBanda(boolean banda) {
		musica.setBanda(banda);
	}

	public double getValorTotalMusica() {

		return musica.getValorTotal();
	}
}
