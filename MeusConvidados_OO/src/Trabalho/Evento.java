package Trabalho;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Evento {

	SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); // instância o formato simples da data
	private String nomeEvento; // nome do evento dando liberdade ao usuario para colocar qualquer nome
	private Date dataEvento; // data do evento no formato Date
	private int horaInicio; // hora de inicio Ex: 20
	private int horaTermino; // hora do termino Ex: 23
	private static ArrayList<Convidado> bdConvidados = new ArrayList<Convidado>(); // cria arraylist de convidados
	private int totalConvidados = 0;
	private static ArrayList<Tarefa> bdTarefas = new ArrayList<Tarefa>(); // cria arraylist de tarefas
	private double taxaTarefas;
	private static ArrayList<Gasto> bdGastos = new ArrayList<Gasto>(); // cria arraylist de Gastos
	private double totalGasto = 0;

	// Construtor da classe Evento
	public Evento(String nome, String data, int horai, int horaf) throws Exception {
		nomeEvento = nome;
		dataEvento = formato.parse(data); // transforma a String em formato date
		horaInicio = horai;
		horaTermino = horaf;
	}

	// Listar convidados
	public void listarConvidados() {
		System.out.print("*** Lista de convidados para o Evento: " + nomeEvento + " ***\n");
		for (int i = 0; i < bdConvidados.size(); i++) {
			Convidado aux = bdConvidados.get(i);
			System.out.print(aux.getNome() + " e " + aux.getQuantAcompanhante() + " acompanhante(s)\n");
		}
		System.out.println("Total de convidados: " + getTotalConvidados() + "\n");
	}

	// Adicionar convidado
	public void adicionarConvidado(Convidado convidado) {
		bdConvidados.add(convidado);
	}

	// Atualizar Convidado
	public void atualizarConvidados() {

	}

	// Remover convidado

	public void removerConvidado(String convidado) {
		int cont = 0;
		for (int i = 0; i < bdConvidados.size(); i++) {
			Convidado aux = bdConvidados.get(i);
			if (aux.getNome() == convidado) {
				bdConvidados.remove(i);
				System.out.println("Convidado removido com sucesso!!\n");
				cont--;
				break;
			}
			cont++;
		}

		if (cont == bdConvidados.size()) {

			System.out.println("Convidado não encontrado!!\n");

		}

	}

	// Calculo do total de convidados
	public void setTotalConvidados() {
		totalConvidados = 0;
		for (int i = 0; i < bdConvidados.size(); i++) {
			Convidado aux = bdConvidados.get(i);
			totalConvidados = totalConvidados + 1 + aux.getQuantAcompanhante();
		}
	}

	//// Listar tarefa
	public void listarTarefas() {
		int quantidade = 0;

		System.out.print("*** Lista de tarefas para o Evento: " + nomeEvento + " ***\n");
		for (int i = 0; i < bdTarefas.size(); i++) {
			Tarefa aux = bdTarefas.get(i);
			System.out.print("Tarefa " + (i + 1) + ": " + aux.getDescricao() + "\n    -> Data limite: "
					+ formato.format(aux.getDataLimite()) + "\n    -> Concluído: " + aux.isConcluido() + "\n");
			quantidade++;
		}
		System.out.println("Total de tarefas: " + quantidade);
		System.out.printf("Taxa de tarefas concluídas:  %.2f%%\n\n", getTaxaTarefas());
	}

	// Adicionar Tarefa
	public void adicionarTarefa(Tarefa tarefa) {
		bdTarefas.add(tarefa);
	}

	// Remover Tarefa

	public void removerTarefa(String descricao) {
		int cont = 0;
		for (int i = 0; i < bdTarefas.size(); i++) {
			Tarefa aux = bdTarefas.get(i);

			if (aux.getDescricao() == descricao) {
				bdTarefas.remove(i);
				System.out.println("Tarefa removida com sucesso!!\n");
				cont--;
				break;
			}
			cont++;
		}

		if (cont == bdTarefas.size()) {

			System.out.println("Tarefa não encontrada!!\n");
		}

	}

	// Calculo da taxa de tarefas
	public void setTaxaTarefas() {
		double contadorSIM = 0;
		int cont = 0;
		for (int i = 0; i < bdTarefas.size(); i++) {
			Tarefa aux = bdTarefas.get(i);
			cont++;
			if (aux.isConcluido() == "Sim") {
				contadorSIM++;
			}
		}
		taxaTarefas = (contadorSIM / cont) * 100;
	}

	// Listar Gastos
	public void listarGastos() {
		System.out.printf("*** Lista de gastos para o Evento: " + nomeEvento + " ***");
		for (int i = 0; i < bdGastos.size(); i++) {
			Gasto aux = bdGastos.get(i);
			System.out.printf(
					"\nGasto " + (i + 1) + ": " + aux.getDescricao() + "\n   -> Valor: R$ " + aux.getValorTotal());
		}
		System.out.printf("\nTotal de gastos: %.2f\n", getTotalGasto());
	}

	// Adicionar Gasto
	public void adicionarGasto(Gasto convidado) {
		bdGastos.add(convidado);
	}

	// Remover Gastos
	public void removerGasto(String descricao) {
		int cont = 0;
		for (int i = 0; i < bdGastos.size(); i++) {
			Gasto aux = bdGastos.get(i);
			if (aux.getDescricao() == descricao) {
				bdGastos.remove(i);
				System.out.println("Gasto removido com sucesso!!\n");
				cont--;
				break;
			}
			cont++;
		}

		if (cont == bdGastos.size()) {

			System.out.println("Gasto não encontrado!!\n");
		}

	}

	// Calculo do total de gastos
	public void setTotalGasto() {
		totalGasto = 0;
		for (int i = 0; i < bdGastos.size(); i++) {
			Gasto aux = bdGastos.get(i);
			totalGasto = totalGasto + aux.getValorTotal();
		}
	}


	// Relatório 
	
	public void relatorio() {
		
		System.out.println("Relatório do evento");
		listarConvidados();
		listarTarefas();
		listarGastos();

	}
	
	// Getters e setters
	public String getNomeEvento() {
		return nomeEvento;
	}

	public void setNomeEvento(String nomeEvento) {
		this.nomeEvento = nomeEvento;
	}

	public Date getDataEvento() {
		return dataEvento;
	}

	public void setDataEvento(Date dataEvento) {
		this.dataEvento = dataEvento;
	}

	public int getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(int horaInicio) {
		this.horaInicio = horaInicio;
	}

	public int getHoraTermino() {
		return horaTermino;
	}

	public void setHoraTermino(int horaTermino) {
		this.horaTermino = horaTermino;
	}

	public int getTotalConvidados() {
		setTotalConvidados();
		return totalConvidados;
	}

	public double getTaxaTarefas() {
		setTaxaTarefas();
		return taxaTarefas;
	}

	public double getTotalGasto() {
		setTotalGasto();
		return totalGasto;
	}

}