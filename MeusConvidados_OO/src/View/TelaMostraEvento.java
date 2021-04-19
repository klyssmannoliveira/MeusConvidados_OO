package View;
/*
Sintese
Objetivo: Classe denominada Tela mostra Evento mostrar a interface gráfica do evento; 
*/

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import Controle.*;

public class TelaMostraEvento implements ActionListener {

	private JFrame janela;
	private JLabel valorNome;
	private JLabel labelData = new JLabel("Data: ");
	private JLabel valorData;
	private JLabel labelHorai = new JLabel("Início: ");
	private JLabel valorHorai;
	private JLabel labelHoraf = new JLabel("Término: ");
	private JLabel valorHoraf;
	private JLabel labelEnd = new JLabel("Endereco: ");
	private JLabel valorEnd;
	private JLabel labelCEP = new JLabel("CEP: ");
	private JLabel valorCEP;
	private JLabel labelComplemen = new JLabel("Complemento: ");
	private JLabel valorComplemen;
	private JLabel labelTotalConvidados = new JLabel("Total de Convidados: ");
	private JLabel valorTotalConvidados;
	private JLabel labelTaxaTarefas = new JLabel("Taxa de Tarefas: ");
	private JLabel valorTaxaTarefas;
	private JLabel labelOrcamentoPrevisto = new JLabel("Orçamento Previsto: ");
	private JLabel valorOrcamentoPrevisto;
	private JLabel labelTotalGasto = new JLabel("Valor de Gastos: ");
	private JLabel valorTotalGasto;
	private JLabel frase;
	private JButton botaoEditar = new JButton("Editar");
	private JButton botaoConvidados = new JButton("Convidados");
	private JButton botaoTarefas = new JButton("Tarefas");
	private JButton botaoOrcamento = new JButton("Orçamento");
	private JButton botaoProgramacao = new JButton("Programação");
	private static ControleBancoEvento dados;

	private int posicao;
	private String s;

	/*
	 * Objetivo: Método para mostrar o Evento. Entrada : op, pos, TelaEvento p,
	 * ControleBancoEvento d;
	 * 
	 */
	public void mostrarEvento(int op, int pos, TelaEvento p, ControleBancoEvento d) {

		posicao = pos;
		dados = d;
		s = "Detalhes do Evento";
		janela = new JFrame(s);
		if (op == 1) {

			valorNome = new JLabel(dados.getNomeEvento(posicao));
			valorData = new JLabel(String.valueOf(dados.getDataEvento(posicao)));
			valorHorai = new JLabel(dados.getHoraiEvento(posicao));
			valorHoraf = new JLabel(dados.getHorafEvento(posicao));
			valorEnd = new JLabel(dados.getEndereco(posicao));
			valorCEP = new JLabel(dados.getCep(posicao));
			valorComplemen = new JLabel(dados.getComplemento(posicao));
			valorTotalConvidados = new JLabel(Integer.toString(dados.getTotalConvidados(posicao)));
			valorTaxaTarefas = new JLabel(String.format("%.2f", dados.getTaxaTarefas(posicao)) + " %");
			valorOrcamentoPrevisto = new JLabel("R$ " + String.format("%.2f", dados.getOrcamentoPrevisto(posicao)));
			valorTotalGasto = new JLabel("R$ " + String.format("%.2f", dados.getTotalGasto(posicao)));

			valorNome.setFont(new Font("Arial", Font.BOLD, 30));
			valorNome.setBounds(90, 20, 180, 25);
			labelData.setBounds(30, 50, 180, 25);
			valorData.setBounds(65, 50, 180, 25);
			labelHorai.setBounds(230, 50, 180, 25);
			valorHorai.setBounds(265, 50, 180, 25);
			labelHoraf.setBounds(330, 50, 180, 25);
			valorHoraf.setBounds(385, 50, 180, 25);
			labelEnd.setBounds(30, 80, 180, 25);
			valorEnd.setBounds(90, 80, 180, 25);
			labelComplemen.setBounds(30, 110, 180, 25);
			valorComplemen.setBounds(115, 110, 180, 25);
			labelCEP.setBounds(265, 80, 180, 25);
			valorCEP.setBounds(295, 80, 180, 25);
			labelTotalConvidados.setBounds(30, 140, 180, 25);
			valorTotalConvidados.setBounds(150, 140, 180, 25);
			labelTaxaTarefas.setBounds(265, 140, 180, 25);
			valorTaxaTarefas.setBounds(365, 140, 180, 25);
			labelOrcamentoPrevisto.setBounds(30, 170, 180, 25);
			valorOrcamentoPrevisto.setBounds(150, 170, 180, 25);
			labelTotalGasto.setBounds(265, 170, 180, 25);
			valorTotalGasto.setBounds(365, 170, 180, 25);

			botaoEditar.setBounds(20, 200, 100, 30);
			botaoConvidados.setBounds(125, 200, 100, 30);
			botaoTarefas.setBounds(230, 200, 100, 30);
			botaoOrcamento.setBounds(335, 200, 100, 30);
			botaoProgramacao.setBounds(300, 20, 130, 30);

			this.janela.add(valorNome);
			this.janela.add(labelData);
			this.janela.add(valorData);
			this.janela.add(labelHorai);
			this.janela.add(valorHorai);
			this.janela.add(labelHoraf);
			this.janela.add(valorHoraf);
			this.janela.add(labelEnd);
			this.janela.add(valorEnd);
			this.janela.add(labelCEP);
			this.janela.add(valorCEP);
			this.janela.add(labelComplemen);
			this.janela.add(valorComplemen);
			this.janela.add(labelTotalConvidados);
			this.janela.add(valorTotalConvidados);
			this.janela.add(labelTaxaTarefas);
			this.janela.add(valorTaxaTarefas);
			this.janela.add(labelOrcamentoPrevisto);
			this.janela.add(valorOrcamentoPrevisto);
			this.janela.add(labelTotalGasto);
			this.janela.add(valorTotalGasto);

			this.janela.add(botaoEditar);
			this.janela.add(botaoConvidados);
			this.janela.add(botaoTarefas);
			this.janela.add(botaoOrcamento);
			this.janela.add(botaoProgramacao);

			this.janela.setLayout(null);

			this.janela.setSize(480, 280);
			this.janela.setVisible(true);

			botaoEditar.addActionListener(this);
			botaoConvidados.addActionListener(this);
			botaoTarefas.addActionListener(this);
			botaoOrcamento.addActionListener(this);
			botaoProgramacao.addActionListener(this);

		}
		if (op == 2) {

			frase = new JLabel("Compareça ao Meu Evento: " + dados.getNomeEvento(posicao) + ". Não Perca a Data !!!");
			valorNome = new JLabel(dados.getNomeEvento(posicao));
			valorData = new JLabel(String.valueOf(dados.getDataEvento(posicao)));
			valorData.setFont(new Font("Arial", Font.BOLD, 12));
			valorHorai = new JLabel(dados.getHoraiEvento(posicao));
			valorHorai.setForeground(Color.blue);
			valorHoraf = new JLabel(dados.getHorafEvento(posicao));
			valorHoraf.setForeground(Color.red);
			valorEnd = new JLabel(dados.getEndereco(posicao));
			valorCEP = new JLabel(dados.getCep(posicao));
			valorComplemen = new JLabel(dados.getComplemento(posicao));
			valorTotalConvidados = new JLabel(Integer.toString(dados.getTotalConvidados(posicao)));
			valorTaxaTarefas = new JLabel(String.format("%.2f", dados.getTaxaTarefas(posicao)) + " %");
			valorOrcamentoPrevisto = new JLabel("R$ " + String.format("%.2f", dados.getOrcamentoPrevisto(posicao)));
			valorTotalGasto = new JLabel("R$ " + String.format("%.2f", dados.getTotalGasto(posicao)));

			valorNome.setFont(new Font("Arial", Font.BOLD, 30));
			frase.setFont(new Font("Arial", Font.BOLD, 15));
			frase.setForeground(Color.green);

			valorNome.setBounds(150, 20, 180, 25);
			labelData.setBounds(30, 50, 90, 25);
			valorData.setBounds(65, 50, 90, 25);
			labelHorai.setBounds(230, 50, 70, 25);
			valorHorai.setBounds(265, 50, 70, 25);
			labelHoraf.setBounds(330, 50, 180, 25);
			valorHoraf.setBounds(385, 50, 180, 25);
			labelEnd.setBounds(30, 80, 180, 25);
			valorEnd.setBounds(90, 80, 180, 25);
			labelComplemen.setBounds(30, 110, 180, 25);
			valorComplemen.setBounds(115, 110, 180, 25);
			labelCEP.setBounds(265, 80, 180, 25);
			valorCEP.setBounds(295, 80, 180, 25);
			labelTotalConvidados.setBounds(30, 140, 180, 25);
			valorTotalConvidados.setBounds(150, 140, 180, 25);
			labelTaxaTarefas.setBounds(265, 140, 180, 25);
			valorTaxaTarefas.setBounds(365, 140, 180, 25);
			labelOrcamentoPrevisto.setBounds(30, 170, 180, 25);
			valorOrcamentoPrevisto.setBounds(150, 170, 180, 25);
			labelTotalGasto.setBounds(265, 170, 180, 25);
			valorTotalGasto.setBounds(365, 170, 180, 25);
			frase.setBounds(15, 200, 450, 25);

			this.janela.add(valorNome);
			this.janela.add(labelData);
			this.janela.add(valorData);
			this.janela.add(labelHorai);
			this.janela.add(valorHorai);
			this.janela.add(labelHoraf);
			this.janela.add(valorHoraf);
			this.janela.add(labelEnd);
			this.janela.add(valorEnd);
			this.janela.add(labelCEP);
			this.janela.add(valorCEP);
			this.janela.add(labelComplemen);
			this.janela.add(valorComplemen);
			this.janela.add(labelTotalConvidados);
			this.janela.add(valorTotalConvidados);
			this.janela.add(labelTaxaTarefas);
			this.janela.add(valorTaxaTarefas);
			this.janela.add(labelOrcamentoPrevisto);
			this.janela.add(valorOrcamentoPrevisto);
			this.janela.add(labelTotalGasto);
			this.janela.add(valorTotalGasto);
			this.janela.add(frase);

			this.janela.setLayout(null);

			this.janela.setSize(480, 280);
			this.janela.setVisible(true);

		}

	}

	/*
	 * Objetivo: Método para clicar no botão da interface gráfica.
	 * 
	 */
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		if (src == botaoEditar) {
			new TelaDetalheEvento().inserirEditar(2, posicao, dados);
		}

		if (src == botaoConvidados) {
			new TelaListagem().mostrarDados(1, posicao, dados);
		}

		if (src == botaoTarefas) {
			new TelaListagem().mostrarDados(2, posicao, dados);
		}

		if (src == botaoOrcamento) {
			new TelaListagem().mostrarDados(3, posicao, dados);
		}

		if (src == botaoProgramacao) {

			new TelaProgramacao().mostrarProgramacao(posicao, dados);

		}

	}

}
