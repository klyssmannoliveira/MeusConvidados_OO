package Trabalho;

public class Programacao {

	private String descricao; // Descri��o da Programa��o

	// Construtor 
	public Programacao(String descricao) {
		this.descricao = descricao;
	}

	
	public String toString() {
		return "A descri��o da Programa��o do evento �:\n " + descricao;
	}

	// getters and setters da programa��o
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
