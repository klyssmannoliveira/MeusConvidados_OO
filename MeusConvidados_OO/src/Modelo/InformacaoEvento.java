package Trabalho;

/*
Sintese
Objetivo: Classe denominada InformacaoEvento para guardar as informações evento; 
*/

import java.util.Date;

public class InformacaoEvento extends Informacao {

	private Date dataEvento; // data do evento;
	private int horaInicio; // horario do inicio do evento;
	private int horaTermino; // horario do termino do evento;

	/*
	 * Objetivo: Getters e Setters referente aos atributos das informaçoes do evento;
	 * 
	 */
	// get da data do evento;
	public Date getDataEvento() {
		return dataEvento;
	}

	// set da data do evento;
	public void setDataEvento(Date dataEvento) {
		this.dataEvento = dataEvento;
	}

	// get da hora de inicio do evento;
	public int getHoraInicio() {
		return horaInicio;
	}

	// set da hora de inicio do evento;
	public void setHoraInicio(int horaInicio) {
		this.horaInicio = horaInicio;
	}

	// get da hora do termino do evento;
	public int getHoraTermino() {
		return horaTermino;
	}

	// set da hora do termino do evento;
	public void setHoraTermino(int horaTermino) {
		this.horaTermino = horaTermino;
	}

}
