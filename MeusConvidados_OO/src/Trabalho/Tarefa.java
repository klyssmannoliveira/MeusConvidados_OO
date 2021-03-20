
package Trabalho;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;



public class Tarefa {
	private String descricao; // descricao da tarefa: pode ser qualquer tarefa
	private Date dataLimite; // data no formato Date
	private long prazo; // diferença entre a data atual (agora) com a dataLimite
	private boolean concluido; // True = Tarefa concluido
	SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
	
	// construtor de tarefa
	public Tarefa(String desc, String data) throws Exception {
		descricao = desc;
		dataLimite = formato.parse(data); // transforma a string data no formato Date
	}
	
	// Retorna uma String dizendo se está concluído ou não
	public String isConcluido() { // retorna se a Tarfa está concluida
		if (concluido == true) {
			return "Sim";
		} else {
			return "Não";
		}

	}

	// Calculo do prazo, retornando um long da quantidade de dias que faltam para realizar a tarefa;
	public long setPrazo() { // calcula a direrença dos dia atual para a data limite
		GregorianCalendar d = new GregorianCalendar();
		Date agora = d.getTime();
		 return prazo = (dataLimite.getTime() - agora.getTime()) / (1000 * 60 * 60 * 24);
	}

	public String toString() {
		return "Tarefa: " + descricao + "\nData Limite: " + formato.format(dataLimite) + "\nPrazo: " + prazo + " dia(s)";
	}

	// getters e setters
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getDataLimite() {
		return dataLimite;
	}

	public void setDataLimite(Date dataLimite) {
		this.dataLimite = dataLimite;
	}

	public long getPrazo() {
		return prazo;
	}

	public void setConcluido(boolean concluido) {
		this.concluido = concluido;
	}

}
