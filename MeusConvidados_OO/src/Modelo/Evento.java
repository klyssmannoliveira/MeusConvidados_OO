package Modelo;

/**
 * Classe denominada Evento. Tem como objetivo descrever as informações do
 * evento. Essa classe é a classe principal do programa. As informações do convidado, orçamento, tarefa e programação estão armazenadas dentro desta classe.
 * 
 * @author HITER E KLYSSMANN
 * @version 1.0 [Maio 2021]
 * 
 */

import java.util.ArrayList;

public class Evento {

	private String nomeEvento; // nome do evento dando liberdade ao usuario para colocar qualquer nome;
	private InformacaoEvento informacaoEvento = new InformacaoEvento(); // instanciação da classe informacaoEvento;
	private ArrayList<Convidado> bdConvidados = new ArrayList<Convidado>(); // cria arraylist de convidados;
	private int totalConvidados = 0; // inicializaçao do atributo total de convidados;
	private ArrayList<Orcamento> bdOrcamentos = new ArrayList<Orcamento>(); // cria arraylist de Orcamento;
	private ArrayList<Bebida> bdBebida = new ArrayList<Bebida>(); // cria arraylist de Orcamento/bebida;
	private ArrayList<Comida> bdComida = new ArrayList<Comida>(); // cria arraylist de Orcamento/comida;
	private ArrayList<Infraestrutura> bdInfraestrutura = new ArrayList<Infraestrutura>(); // cria arraylist de
	private ArrayList<Musica> bdMusica = new ArrayList<Musica>(); // cria arraylist de Orcamento/musica;
	private double totalGasto = 0.0; // inicializaçao do atributo total de gastos;
	private ArrayList<Tarefa> bdTarefas = new ArrayList<Tarefa>(); // cria arraylist de tarefas;
	private double taxaTarefas = 0.0; // inicializaçao do atributo taxa de tarefas;
	private ArrayList<Programacao> bdProgramacao = new ArrayList<Programacao>(); // cria arraylist de Programação;
	private double orcamentoPrevisto = 0.0; // inicializaçao do atributo do orçamento Previsto;

	/**
	 * Construtor da Classe Evento
	 * 
	 * @param nome.              String do nome do evento.
	 * @param data.              String da data do evento.
	 * @param horai.             String da hora inicial do evento.
	 * @param horaf.             String da hora final do evento.
	 * @param endereco.          String do endereço do evento
	 * @param cep.               String do CEP do endereço do evento.
	 * @param complemen.         String do complemento do endereço do evento.
	 * @param orcamentoPrevisto. Double do orçamento previsto do evento.
	 */

	public Evento(String nome, String data, String horai, String horaf, String endereco, String cep, String complemen,
			double orcamentoPrevisto) {
		nomeEvento = nome;
		informacaoEvento.setDataEvento(data);
		informacaoEvento.setHoraInicio(horai);
		informacaoEvento.setHoraTermino(horaf);
		informacaoEvento.setEndereco(endereco);
		informacaoEvento.setCep(cep);
		informacaoEvento.setComplemento(complemen);
		this.orcamentoPrevisto = orcamentoPrevisto;
	}

	/**
	 * Construtor padrão da Classe Evento. Sem parâmetros de entradas.
	 */

	public Evento() {

	}

	/**
	 * Método que Mostra as listas de convidados do evento.
	 * 
	 * @return Uma string com a lista de convidados.
	 */

	public String[] listarConvidados() {
		String[] auxiliar = new String[bdConvidados.size()];
		for (int i = 0; i < bdConvidados.size(); i++) {
			auxiliar[i] = i + 1 + " - " + bdConvidados.get(i).getNome() + " e "
					+ bdConvidados.get(i).getQuantAcompanhante() + " Acompanhante(s)";
		}
		return auxiliar;
	}

	/**
	 * Método que adiciona um convidado no banco de dados para o evento desejado.
	 * 
	 * @param convidado. Este parâmentro é da classe Convidado.
	 */

	public void adicionarConvidado(Convidado convidado) {
		bdConvidados.add(convidado);
	}

	/**
	 * Remove um convidado no arrayList banco de dados convidados. Primeiro verifica
	 * se a posição passada é maior do que o arrayList se for maior retorna falso,
	 * caso contrário remove um evento do arrayList na posição indicada.
	 * 
	 * @param posConvidado. Inteiro indicando a posição do convidado na arrayList
	 *                      que será removida.
	 * @return verdadeiro ou falso, indicando se o convidado foi removido ou não.
	 */

	public boolean removerConvidado(int posConvidado) {

		if (posConvidado > bdConvidados.size()) {

			return false;

		} else {
			bdConvidados.remove(posConvidado);
			return true;
		}

	}

	/**
	 * Método que Mostra as listas de tarefas do evento
	 * 
	 * @return Uma string com as listas da tarefas.
	 */

	public String[] listarTarefas() {
		String[] auxiliar = new String[bdTarefas.size()];
		for (int i = 0; i < bdTarefas.size(); i++) {
			auxiliar[i] = i + 1 + " - " + bdTarefas.get(i).getDescricao();
		}
		return auxiliar;
	}

	/**
	 * Método que adiciona tarefas para realização do evento.
	 * 
	 * @param tarefa. Este parâmentro é da classe Tarefa.
	 */

	public void adicionarTarefa(Tarefa tarefa) {
		bdTarefas.add(tarefa);
	}

	/**
	 * Remove uma tarefa no arrayList banco de dados tarefas. Primeiro verifica se a
	 * posição passada é maior do que o arrayList se for maior retorna falso, caso
	 * contrário remove um evento do arrayList na posição indicada.
	 * 
	 * @param posTarefa. Inteiro indicando a posição da tarefa no arrayList que será
	 *                   removida.
	 * @return verdadeiro ou falso, indicando se a tarefa foi removido ou não.
	 */

	public boolean removerTarefa(int posTarefa) {
		if (posTarefa > bdTarefas.size()) {

			return false;

		} else {
			bdTarefas.remove(posTarefa);
			return true;
		}
	}

	/**
	 * Método que Mostra as listas de orçamentos do evento
	 * 
	 * @return Uma string com as listas dos orçamentos do evento.
	 */

	public String[] listarOrcamentos() {
		String[] auxiliar = new String[bdOrcamentos.size()];
		for (int i = 0; i < bdOrcamentos.size(); i++) {
			auxiliar[i] = i + 1 + " - " + bdOrcamentos.get(i).getDescricao();
		}
		return auxiliar;
	}

	/**
	 * Método que adiciona um orçamento para realização do evento.
	 * 
	 * @param orcamento. Este parâmentro é da classe Orcamento.
	 */

	public void adicionarOrcamento(Orcamento orcamento) {
		bdOrcamentos.add(orcamento);
	}

	/**
	 * Remove um orçamento no arrayList banco de dados do orçamento. Primeiro
	 * verifica se a posição passada é maior do que o arrayList se for maior retorna
	 * falso, caso contrário remove um evento do arrayList na posição indicada.
	 * 
	 * @param posOrcamento. Inteiro indicando a posição do orçamento no arrayList
	 *                      que será removida.
	 * @return verdadeiro ou falso, indicando se o orçamento foi removido ou não.
	 */

	public boolean removerOrcamento(int posOrcamento) {
		if (posOrcamento > bdOrcamentos.size()) {

			return false;

		} else {
			bdOrcamentos.remove(posOrcamento);
			return true;
		}

	}

	/**
	 * Método que adiciona uma Bebida no evento.
	 * 
	 * @param bebida. Este parâmentro é da classe Bebida.
	 */

	public void adicionarBebida(Bebida bebida) {
		bdBebida.add(bebida);
	}

	/**
	 * Remove uma bebida no arrayList banco de dados bebida. Primeiro verifica se a
	 * posição passada é maior do que o arrayList se for maior retorna falso, caso
	 * contrário remove um evento do arrayList na posição indicada.
	 * 
	 * @param posBebida. Inteiro indicando a posição da bebida no arrayList que será
	 *                   removida.
	 * @return verdadeiro ou falso, indicando se da bebida foi removido ou não.
	 */

	public boolean removerBebida(int posBebida) {
		if (posBebida > bdBebida.size()) {

			return false;

		} else {
			bdBebida.remove(posBebida);
			return true;
		}

	}

	/**
	 * Método que adiciona uma comida no evento.
	 * 
	 * @param comida. Este parâmentro é da classe Comida.
	 */

	public void adicionarComida(Comida comida) {
		bdComida.add(comida);
	}

	/**
	 * Remove uma comida no arrayList banco de dados comida. Primeiro verifica se a
	 * posição passada é maior do que o arrayList se for maior retorna falso, caso
	 * contrário remove um evento do arrayList na posição indicada.
	 * 
	 * @param posComida. Inteiro indicando a posição da comida no arrayList que será
	 *                   removida.
	 * @return verdadeiro ou falso, indicando se da comida foi removido ou não.
	 */

	public boolean removerComida(int posComida) {
		if (posComida > bdComida.size()) {

			return false;

		} else {
			bdComida.remove(posComida);
			return true;
		}

	}

	/**
	 * Método que adiciona uma infraestrutura no evento.
	 * 
	 * @param infraestrutura. Este parâmentro é da classe Infraestrutura.
	 */
	public void adicionarInfraestrutura(Infraestrutura infraestrutura) {
		bdInfraestrutura.add(infraestrutura);
	}

	/**
	 * Remove uma infraestrutura no arrayList banco de dados infraestrutura.
	 * Primeiro verifica se a posição passada é maior do que o arrayList se for
	 * maior retorna falso, caso contrário remove um evento do arrayList na posição
	 * indicada.
	 * 
	 * @param posInfraestrutura. Inteiro indicando a posição da infraestrutura no
	 *                           arrayList que será removida.
	 * @return verdadeiro ou falso, indicando se a infraestrutura foi removido ou
	 *         não.
	 */
	public boolean removerInfraestrutura(int posInfraestrutura) {
		if (posInfraestrutura > bdInfraestrutura.size()) {

			return false;

		} else {
			bdInfraestrutura.remove(posInfraestrutura);
			return true;
		}

	}

	/**
	 * Método que adiciona uma musica no evento.
	 * 
	 * @param musica. Este parâmentro é da classe Musica.
	 */
	public void adicionarMusica(Musica musica) {
		bdMusica.add(musica);
	}

	/**
	 * Remove uma musica no arrayList banco de dados musica. Primeiro verifica se a
	 * posição passada é maior do que o arrayList se for maior retorna falso, caso
	 * contrário remove um evento do arrayList na posição indicada.
	 * 
	 * @param posMusica. Inteiro indicando a posição da musica no arrayList que será
	 *                   removida.
	 * @return verdadeiro ou falso, indicando se a musica foi removido ou não.
	 */
	public boolean removerMusica(int posMusica) {
		if (posMusica > bdMusica.size()) {

			return false;

		} else {
			bdMusica.remove(posMusica);
			return true;
		}

	}

	/**
	 * Método que Mostra as listas de descrição da programação do evento.
	 * 
	 * @return Uma string com as listas de descrição da programação.
	 */

	public String[] listarProgramacaoDescricao() {
		String[] auxiliar = new String[bdProgramacao.size()];
		for (int i = 0; i < bdProgramacao.size(); i++) {
			auxiliar[i] = bdProgramacao.get(i).getDescricao();
		}
		return auxiliar;
	}

	/**
	 * Método que Mostra as listas da hora da programação do evento.
	 * 
	 * @return Uma string com as listas da hora da programação.
	 */

	public String[] listarProgramacaoHora() {
		String[] auxiliar = new String[bdProgramacao.size()];
		for (int i = 0; i < bdProgramacao.size(); i++) {
			auxiliar[i] = bdProgramacao.get(i).getHora() + " >>> ";
		}
		return auxiliar;
	}

	/**
	 * Método que adiciona uma programação no evento.
	 * 
	 * @param programacao. Este parâmentro é da classe Programacao.
	 */
	public void adicionarProgramacao(Programacao programacao) {
		bdProgramacao.add(programacao);
	}

	/**
	 * Remove uma programação no arrayList banco de dados programação. Primeiro
	 * verifica se a posição passada é maior do que o arrayList se for maior retorna
	 * falso, caso contrário remove um evento do arrayList na posição indicada.
	 * 
	 * @param posProgramacao. Inteiro indicando a posição da programação no
	 *                        arrayList que será removida.
	 * @return verdadeiro ou falso, indicando se a programação foi removido ou não.
	 */
	public boolean removerProgramacao(int posProgramacao) {
		if (posProgramacao > bdProgramacao.size()) {

			return false;

		} else {
			bdProgramacao.remove(posProgramacao);
			return true;
		}

	}

	// get Nome Evento
	public String getNomeEvento() {
		return nomeEvento;
	}

	// set do nome do evento;
	public void setNomeEvento(String nomeEvento) {
		this.nomeEvento = nomeEvento;
	}

	// get informação do evento;
	public InformacaoEvento getInformacaoEvento() {
		return informacaoEvento;
	}

	// set informação do evento;
	public void setInformacaoEvento(InformacaoEvento informacaoEvento) {
		this.informacaoEvento = informacaoEvento;
	}

	/**
	 * Set Total Convidados que realiza a contagem dos convidados e dos
	 * acompanhantes, ou seja, o total de pessoas no evento.
	 */

	public void setTotalConvidados() {
		totalConvidados = 0;
		for (int i = 0; i < bdConvidados.size(); i++) {
			Convidado aux = bdConvidados.get(i);
			totalConvidados = totalConvidados + 1 + aux.getQuantAcompanhante();
		}
	}

	// get do total de convidados do evento;
	public int getTotalConvidados() {
		setTotalConvidados();
		return totalConvidados;
	}

	/**
	 * Set taxa tarefas que realiza a porcentagem de conlusão de um tarefa do
	 * evento.
	 */

	public void setTaxaTarefas() {
		double contadorSIM = 0;
		int cont = 0;
		for (int i = 0; i < bdTarefas.size(); i++) {
			Tarefa aux = bdTarefas.get(i);
			cont++;
			if (aux.isConcluido() == true) {
				contadorSIM++;
			}
		}
		taxaTarefas = (contadorSIM / cont) * 100;
	}

	// get da taxa de tarefas do evento;
	public double getTaxaTarefas() {
		setTaxaTarefas();
		return taxaTarefas;
	}

	/**
	 * Set total gastos que realiza o somatório de gastos total do evento.
	 */

	public void setTotalGasto() {
		totalGasto = 0;
		for (int i = 0; i < bdOrcamentos.size(); i++) {
			Orcamento aux = bdOrcamentos.get(i);
			totalGasto = totalGasto + aux.getValorTotal();
		}
	}

	// get do total de de gastos do evento;
	public double getTotalGasto() {
		setTotalGasto();
		return totalGasto;
	}

	// get do Orcamento Previsto do evento;
	public double getOrcamentoPrevisto() {
		return orcamentoPrevisto;
	}

	// set Orcamento Previsto do evento;
	public void setOrcamentoPrevisto(double orcamentoPrevisto) {
		this.orcamentoPrevisto = orcamentoPrevisto;
	}

	// retorna o banco de convidados
	public ArrayList<Convidado> getBdConvidados() {
		return bdConvidados;
	}

	// retorna o banco de Tarefas
	public ArrayList<Tarefa> getBdTarefas() {
		return bdTarefas;
	}

	// retorna o banco de Orcamento
	public ArrayList<Orcamento> getBdOrcamentos() {
		return bdOrcamentos;
	}

	// retorna o banco de bebidas
	public ArrayList<Bebida> getBdBebida() {
		return bdBebida;
	}

	// retorna o banco de Comida
	public ArrayList<Comida> getBdComida() {
		return bdComida;
	}

	// retorna o banco de Infraestrutura
	public ArrayList<Infraestrutura> getBdInfraestrutura() {
		return bdInfraestrutura;
	}

	// retorna o banco de Musica
	public ArrayList<Musica> getBdMusica() {
		return bdMusica;
	}

	// retorna o banco de Programacao
	public ArrayList<Programacao> getBdProgramacao() {
		return bdProgramacao;
	}

}