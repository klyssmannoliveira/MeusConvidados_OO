package View;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import Controle.*;

public class TelaMostraEvento implements ActionListener {

	private JFrame janela;
	// private JLabel labelNome = new JLabel("Nome: ");
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
	private JButton botaoEditar = new JButton("Editar");
	private JButton botaoConvidados = new JButton("Convidados");
	private JButton botaoTarefas = new JButton("Tarefas");
	private JButton botaoOrcamento = new JButton("Orçamento");
	private JButton botaoProgramacao = new JButton("Programação");
	private static ControleBancoEvento dados;
	
	private int posicao;
	private String s;

	public void mostrarEvento(int pos, TelaEvento p, ControleBancoEvento d) {

		posicao = pos;
		dados = d;
		s = "Detalhes do Evento";
		janela = new JFrame(s);
		valorNome = new JLabel(dados.getNomeEvento(pos));
		valorData = new JLabel(String.valueOf(dados.getDataEvento(pos)));
		valorHorai = new JLabel(dados.getHoraiEvento(pos));
		valorHoraf = new JLabel(dados.getHorafEvento(pos));
		valorEnd = new JLabel(dados.getEndereco(pos));
		valorCEP = new JLabel(dados.getCep(pos));
		valorComplemen = new JLabel(dados.getComplemento(pos));
		valorTotalConvidados = new JLabel(Integer.toString(dados.getTotalConvidados(pos)));
		valorTaxaTarefas = new JLabel(Double.toString(dados.getTaxaTarefas(pos)));
		valorOrcamentoPrevisto = new JLabel(Double.toString(dados.getOrcamentoPrevisto(pos)));
		valorTotalGasto = new JLabel(Double.toString(dados.getTotalGasto(pos)));
		
		valorNome.setFont(new Font("Arial", Font.BOLD, 30));
		valorNome.setBounds(120, 20, 180, 25);
		labelData.setBounds(30, 50, 180, 25);
		valorData.setBounds(70, 50, 180, 25);
		labelHorai.setBounds(180, 50, 180, 25);
		valorHorai.setBounds(220, 50, 180, 25);
		labelHoraf.setBounds(330, 50, 180, 25);
		valorHoraf.setBounds(390, 50, 180, 25);
		labelEnd.setBounds(30, 80 , 180, 25);
		valorEnd.setBounds(100, 80, 180, 25);
		labelComplemen.setBounds(30, 110, 180, 25);
		valorComplemen.setBounds(120, 110, 180, 25);
		labelCEP.setBounds(265, 80, 180, 25);
		valorCEP.setBounds(295, 80, 180, 25);
		labelTotalConvidados.setBounds(30, 140, 180, 25);
		valorTotalConvidados.setBounds(160, 140, 180, 25);
		labelTaxaTarefas.setBounds(220, 140, 180, 25);
		valorTaxaTarefas.setBounds(330, 140, 180, 25);
		labelOrcamentoPrevisto.setBounds(30, 170, 180, 25);
		valorOrcamentoPrevisto.setBounds(200, 170, 180, 25);
		labelTotalGasto.setBounds(250, 170, 180, 25);
		valorTotalGasto.setBounds(350, 170, 180, 25);

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

		this.janela.setSize(500, 280);
		this.janela.setVisible(true);

		botaoEditar.addActionListener(this);
		botaoConvidados.addActionListener(this);
		botaoTarefas.addActionListener(this);
		botaoOrcamento.addActionListener(this);
		botaoProgramacao.addActionListener(this);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		if(src == botaoEditar) {
			new TelaDetalheEvento().inserirEditar(2, dados, null, posicao);
		}

		if(src == botaoConvidados) {
			
           // botão de acesso para janela de convidados
		
		}
		
		if(src == botaoTarefas) {
			
	           // botão de acesso para janela de Tarefas
			
			}
		
		if(src == botaoOrcamento) {
			
	           // botão de acesso para janela de Orçamento
			
			}
		
		if(src == botaoProgramacao) {
			
	           // botão de acesso para janela de Programação
			
			}
		
		
	}

}
