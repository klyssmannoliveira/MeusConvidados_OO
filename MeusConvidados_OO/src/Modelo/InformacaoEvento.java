package Modelo;

/*
Sintese
Objetivo: Classe denominada InformacaoEvento para guardar as informações evento; 
*/


public class InformacaoEvento extends Informacao {

	private String dataEvento; // data do evento;
	private String horaInicio; // horario do inicio do evento;
	private String horaTermino; // horario do termino do evento;

	/*
	 * Objetivo: Getters e Setters referente aos atributos das informaçoes do evento;
	 * 
	 */
	// get da data do evento;
	public String getDataEvento() {
		return dataEvento;
	}

	// set da data do evento;
	public void setDataEvento(String dataEvento) {
		this.dataEvento = dataEvento;
	}

	// get da hora de inicio do evento;
	public String getHoraInicio() {
		return horaInicio;
	}

	// set da hora de inicio do evento;
	public void setHoraInicio(String horaInicio) {
		this.horaInicio = horaInicio;
	}

	// get da hora do termino do evento;
	public String getHoraTermino() {
		return horaTermino;
	}

	// set da hora do termino do evento;
	public void setHoraTermino(String horaTermino) {
		this.horaTermino = horaTermino;
	}

}
