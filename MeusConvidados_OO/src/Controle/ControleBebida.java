package Controle;

import Modelo.Bebida;

public class ControleBebida {

	private Bebida bebida = new Bebida();

	public ControleBebida(Bebida bebida) {
		this.bebida = bebida;
	}
	
	public String getDescricao() {

		return bebida.getDescricao();
	}
}
