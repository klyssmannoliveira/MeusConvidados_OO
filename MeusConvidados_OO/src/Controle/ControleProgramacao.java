package Controle;

import Modelo.Programacao;

public class ControleProgramacao {
	
	private Programacao programacao = new Programacao();

	public ControleProgramacao(Programacao programacao) {
		this.programacao = programacao;
	}

	public String getDescricao() {

		return programacao.getDescricao();
	}

	public void setDescricao(String descricao) {
        programacao.setDescricao(descricao);
		
	}

	
	public void setHora(String hora) {
       programacao.setHora(hora);
		
	}
	
	public String getHora() {

		return programacao.getHora();
	}
	
	
}
