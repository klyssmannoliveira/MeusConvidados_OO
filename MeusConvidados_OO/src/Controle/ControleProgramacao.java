package Controle;

/*
Sintese
Objetivo: Classe denominada Controle Programacao para controlar a classe Programacao do pacote modelo; 
*/
import Modelo.Programacao;

public class ControleProgramacao {

	private Programacao programacao = new Programacao(); // Instanciação da classe programacao do pacote modelo

	/*
	 * Objetivo: Construtor da Classe controle Programacao. Entrada : Programacao
	 * programacao;
	 * 
	 */
	public ControleProgramacao(Programacao programacao) {
		this.programacao = programacao;
	}

	// get Descrição
	public String getDescricao() {
		return programacao.getDescricao();
	}

	// set Descrição
	public void setDescricao(String descricao) {
		programacao.setDescricao(descricao);

	}

	// set Hora
	public void setHora(String hora) {
		programacao.setHora(hora);

	}

	// get Hora
	public String getHora() {
		return programacao.getHora();
	}

}
