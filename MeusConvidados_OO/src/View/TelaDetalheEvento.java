package View;

/*
Sintese
Objetivo: Classe denominada Tela Detalhe Evento para mostrar a interface gráfica do detalhe  do evento; 
*/

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import Controle.*;

public class TelaDetalheEvento implements ActionListener {

	private JFrame janela;
	private JLabel labelNome = new JLabel("Nome: ");
	private JTextField valorNome;
	private JLabel labelData = new JLabel("Data: ");
	private JTextField valorData;
	private JLabel labelHorai = new JLabel("Início: ");
	private JTextField valorHorai;
	private JLabel labelHoraf = new JLabel("Término: ");
	private JTextField valorHoraf;
	private JLabel labelEnd = new JLabel("Endereco: ");
	private JTextField valorEnd;
	private JLabel labelCEP = new JLabel("CEP: ");
	private JTextField valorCEP;
	private JLabel labelComplemen = new JLabel("Complemento: ");
	private JTextField valorComplemen;
	private JLabel labelOrcamentoPrevisto = new JLabel("Orçamento Previsto: ");
	private JTextField valorOrcamentoPrevisto;
	private JButton botaoExcluir = new JButton("Excluir");
	private JButton botaoSalvar = new JButton("Salvar");
	private String[] novoDado = new String[9];
	private static ControleBancoEvento dados;
	private int posicao;
	private int opcao;
	private String s;

	/*
	 * Objetivo: Método para inserir e editar Evento. Entrada : op, pos,
	 * ControleBancoEvento;
	 * 
	 */
	public void inserirEditar(int op, int pos, ControleBancoEvento d) {

		opcao = op;
		posicao = pos;
		dados = d;

		if (op == 1)
			s = "Cadastro de Evento";
		if (op == 2)
			s = "Editar Evento";

		janela = new JFrame(s);

		if (op == 2) { // Edita um evento já cadastrado
			valorNome = new JTextField(dados.getNomeEvento(pos), 200);
			valorData = new JTextField(String.valueOf(dados.getDataEvento(pos)), 28);
			valorHorai = new JTextField(dados.getHoraiEvento(pos), 5);
			valorHoraf = new JTextField(dados.getHorafEvento(pos), 5);
			valorEnd = new JTextField(dados.getEndereco(pos), 200);
			valorCEP = new JTextField(dados.getCep(pos), 11);
			valorComplemen = new JTextField(dados.getComplemento(pos), 200);
			valorOrcamentoPrevisto = new JTextField(String.format("%.2f", dados.getOrcamentoPrevisto(pos)), 200);

		} else { // Cadastro de um novo evento: As caixas de textos aparecem vazias

			valorNome = new JTextField(200);
			valorData = new JTextField(8);
			valorHorai = new JTextField(5);
			valorHoraf = new JTextField(5);
			valorEnd = new JTextField(200);
			valorCEP = new JTextField(11);
			valorComplemen = new JTextField(200);
			valorOrcamentoPrevisto = new JTextField(200);

			botaoSalvar.setBounds(245, 265, 115, 30);
		}

		labelNome.setBounds(30, 20, 150, 25);
		valorNome.setBounds(180, 20, 180, 25);
		labelData.setBounds(30, 50, 180, 25);
		valorData.setBounds(180, 50, 180, 25);
		labelHorai.setBounds(30, 80, 180, 25);
		valorHorai.setBounds(180, 80, 180, 25);
		labelHoraf.setBounds(30, 110, 180, 25);
		valorHoraf.setBounds(180, 110, 180, 25);
		labelEnd.setBounds(30, 140, 150, 25);
		valorEnd.setBounds(180, 140, 180, 25);
		labelComplemen.setBounds(30, 170, 150, 25);
		valorComplemen.setBounds(180, 170, 180, 25);
		labelCEP.setBounds(30, 200, 150, 25);
		valorCEP.setBounds(180, 200, 180, 25);
		labelOrcamentoPrevisto.setBounds(30, 230, 150, 25);
		valorOrcamentoPrevisto.setBounds(180, 230, 180, 25);

		// Coloca botoes de excluir e salvar
		if (op == 2) {
			botaoSalvar.setBounds(120, 265, 115, 30);
			botaoExcluir.setBounds(245, 265, 115, 30);
			this.janela.add(botaoExcluir);
		}

		this.janela.add(labelNome);
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
		this.janela.add(labelOrcamentoPrevisto);
		this.janela.add(valorOrcamentoPrevisto);
		this.janela.add(botaoSalvar);

		this.janela.setLayout(null);

		this.janela.setSize(400, 365);
		this.janela.setVisible(true);

		botaoSalvar.addActionListener(this);
		botaoExcluir.addActionListener(this);
	}

	/*
	 * Objetivo: Método para clicar no botão da interface gráfica.
	 * 
	 */

	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		if (src == botaoSalvar) {
			try {
				boolean res;
				if (opcao == 1) // cadastro de novo Evento
					novoDado[0] = Integer.toString(dados.getQtdEventos());
				else // edicao de Evento existente
					novoDado[0] = Integer.toString(posicao);

				novoDado[1] = valorNome.getText();
				novoDado[2] = valorData.getText();
				novoDado[3] = valorHorai.getText();
				novoDado[4] = valorHoraf.getText();
				novoDado[5] = valorEnd.getText();
				novoDado[6] = valorCEP.getText();
				novoDado[7] = valorComplemen.getText();
				novoDado[8] = valorOrcamentoPrevisto.getText();

				res = dados.adicionarEditarEvento(opcao, posicao, novoDado);

				if (res) {
					mensagemSucessoCadastro();
				} else
					mensagemErroCadastro();

			} catch (NullPointerException exc1) {
				mensagemErroCadastro();
			} catch (NumberFormatException exc2) {
				mensagemErroCadastro();
			}
		}

		if (src == botaoExcluir) {
			boolean res = false;

			if (opcao == 2) {// exclui o evento
				res = dados.removerEvento(posicao);
				if (res)
					mensagemSucessoExclusao();
				else
					mensagemErroExclusaoEvento();
			}

		}
	}

	/*
	 * Objetivo: Método para mensagem de exclusão com sucesso
	 * 
	 */
	public void mensagemSucessoExclusao() {
		JOptionPane.showMessageDialog(null, "Os dados foram excluidos com sucesso!", null,
				JOptionPane.INFORMATION_MESSAGE);
		janela.dispose();
	}

	/*
	 * Objetivo: Método para mensagem de Cadastro com sucesso
	 * 
	 */
	public void mensagemSucessoCadastro() {
		JOptionPane.showMessageDialog(null, "Os dados foram salvos com sucesso!", null,
				JOptionPane.INFORMATION_MESSAGE);
		janela.dispose();
	}

	/*
	 * Objetivo: Método para mensagem de erro de Cadastro
	 * 
	 */
	public void mensagemErroCadastro() {
		JOptionPane.showMessageDialog(null,
				"ERRO AO SALVAR OS DADOS!\n " + "Pode ter ocorrido um dos dois erros a seguir:  \n"
						+ "1. Nem todos os campos foram preenchidos; \n"
						+ "2. A data não está no formato dd/mm/aaaa; \n"
						+ "3. Os horários de início e término não estão no formado hh:mm; \n"
						+ "4. O CEP não está no formato 12345-123;",
				null, JOptionPane.ERROR_MESSAGE);
	}

	/*
	 * Objetivo: Método para mensagem de erro de exclusao do evento
	 * 
	 */
	public void mensagemErroExclusaoEvento() {
		JOptionPane.showMessageDialog(null,
				"Ocorreu um erro ao excluir o dado.\n " + "Verifique se o nome do evento está correto\n", null,
				JOptionPane.ERROR_MESSAGE);
	}

}
