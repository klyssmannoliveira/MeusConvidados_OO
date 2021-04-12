package Controle;

import Modelo.*;

public class ControleTarefa {

	private Tarefa tarefa = new Tarefa();

	public ControleTarefa(Tarefa tarefa) {
		this.tarefa = tarefa;
	}

	public String getDescricao() {

		return tarefa.getDescricao();
	}

	public String getDataLimite() {

		return tarefa.getDataLimite();
	}

	public boolean getConcluidoTarefa() {

		return tarefa.isConcluido();
	}

	
}
