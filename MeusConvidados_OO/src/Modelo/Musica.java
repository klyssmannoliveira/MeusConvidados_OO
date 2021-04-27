package Modelo;

/**
 * Classe denominada Musica. Tem como objetivo descrever as informações das
 * musicas do evento. Uma classe que herda da classe Orçamento.
 * 
 * @author HITER E KLYSSMANN
 * @version 1.0 [Maio 2021]
 * 
 */
public class Musica extends Orcamento {
	private String generoMusical; // Classifica o genero musical
	private boolean banda; // classifica se é uma banda ou não
	private boolean dj; // classifica se é um DJ ou não

	/**
	 * Construtor da Classe Musica.
	 * 
	 * @param tipo.       Inteiro que indica o tipo do orçamento (1 - Bebida, 2 -
	 *                    Comida, 3 - Infraestrutura, 4 - Música).
	 * @param descricao.  String que realiza a descrição da musica.
	 * @param valorTotal. Double que indica o valor total das musicas para o evento.
	 */

	public Musica(int tipo, String descricao, double valorTotal) {
		super(tipo, descricao, valorTotal);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Construtor da Classe Musica com sobrecarga
	 * 
	 * @param tipo.          Inteiro que indica o tipo do orçamento (1 - Bebida, 2 -
	 *                       Comida, 3 - Infraestrutura, 4 - Música).
	 * @param descricao.     String que realiza a descrição da musica.
	 * @param valorTotal.    Double que indica o valor total das musicas para o
	 *                       evento.
	 * @param generoMusical. String que relata o nome do gênero musical da musica.
	 * @param banda.         Boolean que indica se tem banda ou não no evento.
	 * @param dj.            Boolean que indica se tem Dj ou não no evento.
	 */

	public Musica(int tipo, String descricao, double valorTotal, String generoMusical, boolean banda, boolean dj) {
		super(tipo, descricao, valorTotal);
		this.generoMusical = generoMusical;
		this.banda = banda;
		this.dj = dj;
	}

	/**
	 * Construtor padrão da Classe Musica. Sem parâmetros de entradas.
	 */

	public Musica() {
	}

	// gets e sets da classe musica

	// get do gênero musical
	public String getGeneroMusical() {
		return generoMusical;
	}

	// set do gênero musical
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
