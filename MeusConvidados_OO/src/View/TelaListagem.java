package View;

import Controle.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class TelaListagem implements ActionListener, ListSelectionListener {
	private JFrame janela;
	private JLabel titulo;
	private JButton cadastro;
	private JButton atualizar;
	private JLabel labelTotal;
	private JLabel valorTotal;
	private static ControleBancoEvento dados;
	private JList<String> listaDadosCriados;
	private String[] listaNomes = new String[50];
	private String s;
	private int posicao;
	private int opcao;

	public void mostrarDados(int op, int pos, ControleBancoEvento d) {
		dados = d;
		posicao = pos;
		opcao = op;
		if (op == 1)
			s = "Lista de Convidados";
		if (op == 2)
			s = "Lista de Tarefas";
		if (op == 3)
			s = "Lista de Gastos";

		janela = new JFrame(s);

		if (opcao == 1) {
			listaNomes = new ControleBancoEvento(dados).getNomesConvidados(posicao);
			listaDadosCriados = new JList<String>(listaNomes);
			titulo = new JLabel("Lista de Convidados");
			labelTotal = new JLabel("Total de Convidados: ");
			valorTotal = new JLabel(Integer.toString(dados.getTotalConvidados(posicao)));
			cadastro = new JButton("Cadastrar");
			atualizar = new JButton("Atualizar");

			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(90, 10, 250, 30);
			listaDadosCriados.setBounds(20, 50, 350, 120);
			listaDadosCriados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			listaDadosCriados.setVisibleRowCount(10);
			labelTotal.setBounds(20, 167, 140, 30);
			valorTotal.setBounds(140, 167, 100, 30);

			cadastro.setBounds(70, 197, 100, 30);
			atualizar.setBounds(200, 197, 100, 30);

			janela.setLayout(null);

			janela.add(titulo);
			janela.add(listaDadosCriados);
			janela.add(labelTotal);
			janela.add(valorTotal);
			janela.add(cadastro);
			janela.add(atualizar);

			janela.setSize(400, 290);
			janela.setVisible(true);

			cadastro.addActionListener(this);
			atualizar.addActionListener(this);
			listaDadosCriados.addListSelectionListener(this);

		}
		else if (opcao == 2) {

			listaNomes = new ControleBancoEvento(dados).getNomesTarefas(posicao);
			listaDadosCriados = new JList<String>(listaNomes);
			titulo = new JLabel("Lista de Tarefas");
			labelTotal = new JLabel("Taxa de tarefas: ");
			valorTotal = new JLabel(String.format("%.2f",dados.getTaxaTarefas(posicao)) + " %");
			cadastro = new JButton("Cadastrar");
			atualizar = new JButton("Atualizar");

			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(90, 10, 250, 30);
			listaDadosCriados.setBounds(20, 50, 350, 120);
			listaDadosCriados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			listaDadosCriados.setVisibleRowCount(10);
			labelTotal.setBounds(20, 167, 140, 30);
			valorTotal.setBounds(115, 167, 100, 30);

			cadastro.setBounds(70, 197, 100, 30);
			atualizar.setBounds(200, 197, 100, 30);

			janela.setLayout(null);

			janela.add(titulo);
			janela.add(listaDadosCriados);
			janela.add(labelTotal);
			janela.add(valorTotal);
			janela.add(cadastro);
			janela.add(atualizar);

			janela.setSize(400, 290);
			janela.setVisible(true);

			cadastro.addActionListener(this);
			atualizar.addActionListener(this);
			listaDadosCriados.addListSelectionListener(this);

		}
		else if (opcao == 3) {
			listaNomes = new ControleBancoEvento(dados).getNomesOrcamento(posicao);
			listaDadosCriados = new JList<String>(listaNomes);
			titulo = new JLabel("Lista de Tarefas");
			labelTotal = new JLabel("Total gasto: ");
			valorTotal = new JLabel("R$ " + String.format("%.2f",dados.getTotalGasto(posicao)));
			JLabel labelOrcamentoPrevisto = new JLabel("Orçamento Previsto: ");
			JLabel valorOrcamentoPrevisto = new JLabel("R$ " + String.format("%.2f",dados.getOrcamentoPrevisto(posicao)));
			cadastro = new JButton("Cadastrar");
			atualizar = new JButton("Atualizar");

			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(90, 10, 250, 30);
			listaDadosCriados.setBounds(20, 50, 350, 120);
			listaDadosCriados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			listaDadosCriados.setVisibleRowCount(10);
			labelTotal.setBounds(20, 167, 140, 30);
			valorTotal.setBounds(90, 167, 100, 30);
			labelOrcamentoPrevisto.setBounds(190, 167, 140, 30);
			valorOrcamentoPrevisto.setBounds(310, 167, 140, 30);
			cadastro.setBounds(70, 197, 100, 30);
			atualizar.setBounds(200, 197, 100, 30);

			janela.setLayout(null);

			janela.add(titulo);
			janela.add(listaDadosCriados);
			janela.add(labelTotal);
			janela.add(valorTotal);
			janela.add(labelOrcamentoPrevisto);
			janela.add(valorOrcamentoPrevisto);
			janela.add(cadastro);
			janela.add(atualizar);

			janela.setSize(400, 290);
			janela.setVisible(true);

			cadastro.addActionListener(this);
			atualizar.addActionListener(this);
			listaDadosCriados.addListSelectionListener(this);

		} 
		else {
			JOptionPane.showMessageDialog(null, "Opção não encontrada!", null, JOptionPane.ERROR_MESSAGE);
		}

	}

	// Captura eventos relacionados aos botões da interface
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		// Cadastro do novo evento
		if (src == cadastro)
			// new TelaDetalheEvento().inserirEditar(1, dados, null, 0);

			// Atualiza a lista de nomes dos eventos mostrada no JList
			if (src == atualizar) {
				if (opcao == 1) {
					listaDadosCriados.setListData(new ControleBancoEvento(dados).getNomesConvidados(posicao));
					listaDadosCriados.updateUI();
				}
				if (opcao == 2) {
					listaDadosCriados.setListData(new ControleBancoEvento(dados).getNomesTarefas(posicao));
					listaDadosCriados.updateUI();
				}
				if (opcao == 3) {
					listaDadosCriados.setListData(new ControleBancoEvento(dados).getNomesOrcamento(posicao));
					listaDadosCriados.updateUI();
				}
			}

	}

	// Captura eventos relacionados ao JList
	public void valueChanged(ListSelectionEvent e) {
		Object src = e.getSource();

		if (e.getValueIsAdjusting() && src == listaDadosCriados) {
			// new TelaMostraEvento().mostrarEvento(listaEventosCriados.getSelectedIndex(),
			// this, dados);
		}

	}
}
