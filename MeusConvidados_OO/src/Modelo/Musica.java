package Modelo;

/**
 * Classe denominada Musica que herda da classe Or�amento, tem como objetivo descrever as informa��es das
 * musicas do evento.
 * 
 * @author HITER E KLYSSMANN
 * @version 1.0 [Maio 2021]
 * 
 */
public class Musica extends Orcamento {
	private String generoMusical; // Classifica o genero musical
	private boolean banda; // classifica se � uma banda ou n�o
	private boolean dj; // classifica se � um DJ ou n�o

	/**
	 * Construtor da Classe Musica.
	 * 
	 * @param tipo       Inteiro que indica o tipo do or�amento (1 - Bebida, 2 -
	 *                    Comida, 3 - Infraestrutura, 4 - M�sica).
	 * @param descricao  String que realiza a descri��o da musica.
	 * @param valorTotal Double que indica o valor total das musicas para o evento.
	 */

	public Musica(int tipo, String descricao, double valorTotal) {
		super(tipo, descricao, valorTotal);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Construtor da Classe Musica com sobrecarga
	 * 
	 * @param tipo          Inteiro que indica o tipo do or�amento (1 - Bebida, 2 -
	 *                       Comida, 3 - Infraestrutura, 4 - M�sica).
	 * @param descricao     String que realiza a descri��o da musica.
	 * @param valorTotal    Double que indica o valor total das musicas para o
	 *                       evento.
	 * @param generoMusical String que relata o nome do g�nero musical da musica.
	 * @param banda         Boolean que indica se tem banda ou n�o no evento.
	 * @param dj            Boolean que indica se tem Dj ou n�o no evento.
	 */

	public Musica(int tipo, String descricao, double valorTotal, String generoMusical, boolean banda, boolean dj) {
		super(tipo, descricao, valorTotal);
		this.generoMusical = generoMusical;
		this.banda = banda;
		this.dj = dj;
	}

	/**
	 * Construtor padr�o da Classe Musica. Sem par�metros de entradas.
	 */

	public Musica() {
	}

	// gets e sets da classe musica

	// get do g�nero musical
	public String getGeneroMusical() {
		return generoMusical;
	}

	// set do g�nero musical
	public void setGeneroMusical(String generoMusical) {
		this.generoMusical = generoMusical;
	}

	// get da banda: True se for banda e false se n�o for
	public boolean isBanda() {
		return banda;
	}

	// set da banda
	public void setBanda(boolean banda) {
		this.banda = banda;
	}

	// get do DJ: True se for DJ e false se n�o for
	public boolean isDj() {
		return dj;
	}

	// set do DJ:
	public void setDj(boolean dj) {
		this.dj = dj;
	}

}
