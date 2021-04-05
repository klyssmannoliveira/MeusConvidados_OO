package Trabalho;

/*
Sintese
Objetivo: Classe denominada Musica para descrever as informaçoes da musica do evento; 
*/
public class Musica extends Orcamento {
	private String generoMusical; // Classifica o genero musical
	private boolean banda; // classifica se é uma banda ou não
	private boolean dj; // classifica se é um DJ ou não
	
	/*
	 * Objetivo: Construtor da Classe Musica; 
	 * Entrada : descricao e valorTotal;
	 * 
	 */
	public Musica(String descricao, double valorTotal) {
		super(descricao, valorTotal);
		// TODO Auto-generated constructor stub
	}

	/*
	 * Objetivo: Construtor da Classe Musica (sobrecarga); 
	 * Entrada : descricao, quantidade, generoMusical, banda, dj;
	 */
	public Musica(String descricao, double valorTotal, String generoMusical, boolean banda, boolean dj) {
		super(descricao, valorTotal);
		this.generoMusical = generoMusical;
		this.banda = banda;
		this.dj = dj;
	}

	/*
	 * Objetivo: Retorna a uma string; Saida: descrição, valorTotal;
	 * 
	 */

	public String toString() {
		return "Orçamento: " + descricao + "\nValor total: R$ " + valorTotal;
	}
	
	/*
	 * Objetivo: Getters e Setters referentes a Bebida;
	 * 
	 */
	// get do genero musical
	public String getGeneroMusical() {
		return generoMusical;
	}

	// set do genero musical
	public void setGeneroMusical(String generoMusical) {
		this.generoMusical = generoMusical;
	}

	// get da banda: True se for banda e false se não for
	public boolean isBanda() {
		return banda;
	}
	
	// set da banda
	public void setBanda(boolean banda) {
		this.banda = banda;
	}

	// get do DJ: True se for DJ e false se não for
	public boolean isDj() {
		return dj;
	}

	// set do DJ:
	public void setDj(boolean dj) {
		this.dj = dj;
	}
	
	

}
