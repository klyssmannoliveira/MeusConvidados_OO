package Modelo;
import java.util.ArrayList;
/**
 * Classe denominada Evento � a classe principal do programa, tem como objetivo descrever as informa��es do
 * evento, tais como: informa��es do convidado, or�amento, tarefa e programa��o est�o armazenadas dentro desta classe.
 * 
 * @author HITER E KLYSSMANN
 * @version 1.0 [Maio 2021]
 * 
 */



public class Evento {

	private String nomeEvento; // nome do evento dando liberdade ao usuario para colocar qualquer nome;
	private InformacaoEvento informacaoEvento = new InformacaoEvento(); // instancia��o da classe informacaoEvento;
	private ArrayList<Convidado> bdConvidados = new ArrayList<Convidado>(); // cria arraylist de convidados;
	private int totalConvidados = 0; // inicializa�ao do atributo total de convidados;
	private ArrayList<Orcamento> bdOrcamentos = new ArrayList<Orcamento>(); // cria arraylist de Orcamento;
	private ArrayList<Bebida> bdBebida = new ArrayList<Bebida>(); // cria arraylist de Orcamento/bebida;
	private ArrayList<Comida> bdComida = new ArrayList<Comida>(); // cria arraylist de Orcamento/comida;
	private ArrayList<Infraestrutura> bdInfraestrutura = new ArrayList<Infraestrutura>(); // cria arraylist de
	private ArrayList<Musica> bdMusica = new ArrayList<Musica>(); // cria arraylist de Orcamento/musica;
	private double totalGasto = 0.0; // inicializa�ao do atributo total de gastos;
	private ArrayList<Tarefa> bdTarefas = new ArrayList<Tarefa>(); // cria arraylist de tarefas;
	private double taxaTarefas = 0.0; // inicializa�ao do atributo taxa de tarefas;
	private ArrayList<Programacao> bdProgramacao = new ArrayList<Programacao>(); // cria arraylist de Programa��o;
	private double orcamentoPrevisto = 0.0; // inicializa�ao do atributo do or�amento Previsto;

	/**
	 * Construtor da Classe Evento
	 * 
	 * @param nome              String do nome do evento.
	 * @param data              String da data do evento.
	 * @param horai             String da hora inicial do evento.
	 * @param horaf             String da hora final do evento.
	 * @param endereco          String do endere�o do evento
	 * @param cep               String do CEP do endere�o do evento.
	 * @param complemen         String do complemento do endere�o do evento.
	 * @param orcamentoPrevisto Double do or�amento previsto do evento.
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
	 * Construtor padr�o da Classe Evento. Sem par�metros de entradas.
	 */

	public Evento() {

	}

	/**
	 * M�todo que Mostra as listas de convidados do evento.
	 * 
	 * @return Retorna uma string com a lista de convidados.
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
	 * M�todo que adiciona um convidado no banco de dados para o evento desejado.
	 * 
	 * @param convidado Este par�mentro � da classe Convidado.
	 */

	public void adicionarConvidado(Convidado convidado) {
		bdConvidados.add(convidado);
	}

	/**
	 * Remove um convidado no arrayList banco de dados convidados. Primeiro verifica
	 * se a posi��o passada � maior do que o arrayList se for maior retorna falso,
	 * caso contr�rio remove um evento do arrayList na posi��o indicada.
	 * 
	 * @param posConvidado Inteiro indicando a posi��o do convidado na arrayList
	 *                      que ser� removida.
	 * @return Retorna verdadeiro ou falso, indicando se o convidado foi removido ou n�o.
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
	 * M�todo que Mostra as listas de tarefas do evento
	 * 
	 * @return Retorna uma string com as listas da tarefas.
	 */

	public String[] listarTarefas() {
		String[] auxiliar = new String[bdTarefas.size()];
		for (int i = 0; i < bdTarefas.size(); i++) {
			auxiliar[i] = i + 1 + " - " + bdTarefas.get(i).getDescricao();
		}
		return auxiliar;
	}

	/**
	 * M�todo que adiciona tarefas para realiza��o do evento.
	 * 
	 * @param tarefa Este par�mentro � da classe Tarefa.
	 */

	public void adicionarTarefa(Tarefa tarefa) {
		bdTarefas.add(tarefa);
	}

	/**
	 * Remove uma tarefa no arrayList banco de dados tarefas. Primeiro verifica se a
	 * posi��o passada � maior do que o arrayList se for maior retorna falso, caso
	 * contr�rio remove um evento do arrayList na posi��o indicada.
	 * 
	 * @param posTarefa Inteiro indicando a posi��o da tarefa no arrayList que ser�
	 *                   removida.
	 * @return retorna verdadeiro ou falso, indicando se a tarefa foi removido ou n�o.
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
	 * M�todo que Mostra as listas de or�amentos do evento
	 * 
	 * @return Retorna uma string com as listas dos or�amentos do evento.
	 */

	public String[] listarOrcamentos() {
		String[] auxiliar = new String[bdOrcamentos.size()];
		for (int i = 0; i < bdOrcamentos.size(); i++) {
			auxiliar[i] = i + 1 + " - " + bdOrcamentos.get(i).getDescricao();
		}
		return auxiliar;
	}

	/**
	 * M�todo que adiciona um or�amento para realiza��o do evento.
	 * 
	 * @param orcamento Este par�mentro � da classe Orcamento.
	 */

	public void adicionarOrcamento(Orcamento orcamento) {
		bdOrcamentos.add(orcamento);
	}

	/**
	 * Remove um or�amento no arrayList banco de dados do or�amento. Primeiro
	 * verifica se a posi��o passada � maior do que o arrayList se for maior retorna
	 * falso, caso contr�rio remove um evento do arrayList na posi��o indicada.
	 * 
	 * @param posOrcamento Inteiro indicando a posi��o do or�amento no arrayList
	 *                      que ser� removida.
	 * @return retorna verdadeiro ou falso, indicando se o or�amento foi removido ou n�o.
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
	 * M�todo que adiciona uma Bebida no evento.
	 * 
	 * @param bebida Este par�mentro � da classe Bebida.
	 */

	public void adicionarBebida(Bebida bebida) {
		bdBebida.add(bebida);
	}

	/**
	 * Remove uma bebida no arrayList banco de dados bebida. Primeiro verifica se a
	 * posi��o passada � maior do que o arrayList se for maior retorna falso, caso
	 * contr�rio remove um evento do arrayList na posi��o indicada.
	 * 
	 * @param posBebida Inteiro indicando a posi��o da bebida no arrayList que ser�
	 *                   removida.
	 * @return Retorna verdadeiro ou falso, indicando se da bebida foi removido ou n�o.
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
	 * M�todo que adiciona uma comida no evento.
	 * 
	 * @param comida Este par�mentro � da classe Comida.
	 */

	public void adicionarComida(Comida comida) {
		bdComida.add(comida);
	}

	/**
	 * Remove uma comida no arrayList banco de dados comida. Primeiro verifica se a
	 * posi��o passada � maior do que o arrayList se for maior retorna falso, caso
	 * contr�rio remove um evento do arrayList na posi��o indicada.
	 * 
	 * @param posComida Inteiro indicando a posi��o da comida no arrayList que ser�
	 *                   removida.
	 * @return Retorna verdadeiro ou falso, indicando se da comida foi removido ou n�o.
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
	 * M�todo que adiciona uma infraestrutura no evento.
	 * 
	 * @param infraestrutura Este par�mentro � da classe Infraestrutura.
	 */
	public void adicionarInfraestrutura(Infraestrutura infraestrutura) {
		bdInfraestrutura.add(infraestrutura);
	}

	/**
	 * Remove uma infraestrutura no arrayList banco de dados infraestrutura.
	 * Primeiro verifica se a posi��o passada � maior do que o arrayList se for
	 * maior retorna falso, caso contr�rio remove um evento do arrayList na posi��o
	 * indicada.
	 * 
	 * @param posInfraestrutura Inteiro indicando a posi��o da infraestrutura no
	 *                           arrayList que ser� removida.
	 * @return Retorna verdadeiro ou falso, indicando se a infraestrutura foi removido ou
	 *         n�o.
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
	 * M�todo que adiciona uma musica no evento.
	 * 
	 * @param musica Este par�mentro � da classe Musica.
	 */
	public void adicionarMusica(Musica musica) {
		bdMusica.add(musica);
	}

	/**
	 * Remove uma musica no arrayList banco de dados musica. Primeiro verifica se a
	 * posi��o passada � maior do que o arrayList se for maior retorna falso, caso
	 * contr�rio remove um evento do arrayList na posi��o indicada.
	 * 
	 * @param posMusica Inteiro indicando a posi��o da musica no arrayList que ser�
	 *                   removida.
	 * @return Retorna verdadeiro ou falso, indicando se a musica foi removido ou n�o.
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
	 * M�todo que Mostra as listas de descri��o da programa��o do evento.
	 * 
	 * @return Uma string com as listas de descri��o da programa��o.
	 */

	public String[] listarProgramacaoDescricao() {
		String[] auxiliar = new String[bdProgramacao.size()];
		for (int i = 0; i < bdProgramacao.size(); i++) {
			auxiliar[i] = bdProgramacao.get(i).getDescricao();
		}
		return auxiliar;
	}

	/**
	 * M�todo que Mostra as listas da hora da programa��o do evento.
	 * 
	 * @return Retorna uma string com as listas da hora da programa��o.
	 */

	public String[] listarProgramacaoHora() {
		String[] auxiliar = new String[bdProgramacao.size()];
		for (int i = 0; i < bdProgramacao.size(); i++) {
			auxiliar[i] = bdProgramacao.get(i).getHora() + " >>> ";
		}
		return auxiliar;
	}

	/**
	 * M�todo que adiciona uma programa��o no evento.
	 * 
	 * @param programacao Este par�mentro � da classe Programacao.
	 */
	public void adicionarProgramacao(Programacao programacao) {
		bdProgramacao.add(programacao);
	}

	/**
	 * Remove uma programa��o no arrayList banco de dados programa��o. Primeiro
	 * verifica se a posi��o passada � maior do que o arrayList se for maior retorna
	 * falso, caso contr�rio remove um evento do arrayList na posi��o indicada.
	 * 
	 * @param posProgramacao Inteiro indicando a posi��o da programa��o no
	 *                        arrayList que ser� removida.
	 * @return Retorna verdadeiro ou falso, indicando se a programa��o foi removido ou n�o.
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

	// get informa��o do evento;
	public InformacaoEvento getInformacaoEvento() {
		return informacaoEvento;
	}

	// set informa��o do evento;
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
	 * Set taxa tarefas que realiza a porcentagem de conlus�o de um tarefa do
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
	 * Set total gastos que realiza o somat�rio de gastos total do evento.
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