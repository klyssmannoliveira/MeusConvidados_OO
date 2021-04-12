package View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import Controle.*;

public class TelaCadastroAtualiza implements ActionListener {

	private JFrame janela;
	private JButton botaoExcluir = new JButton("Excluir");
	private JButton botaoSalvar = new JButton("Salvar");
	private String[] novoDado = new String[8];
	private static ControleBancoEvento dados;
	private int opcao;
	private int posObjeto;
	private int posEvento;
	private String s;

	public void inserirEditarConvTare(int op, int posEvento,  int posObjeto, ControleBancoEvento d) {

		opcao = op;
		this.posObjeto = posObjeto;
		this.posEvento =  posEvento;
		dados = d;

		if (op == 1)
			s = "Cadastro de Convidado";
		if (op == 2)
			s = "Cadastro Tarefas";
		if (op == 3)
			s = "Atualizar de Convidado";
		if (op == 4)
			s = "Atualizar Tarefas";

		janela = new JFrame(s);

		if (op == 1) {

			JLabel labelNome = new JLabel("Nome: ");
			JTextField valorNome;
			JLabel labelQuantAcompanhante = new JLabel("N� de Acompanhantes: ");
			JTextField valorQuantAcompanhante;
			JLabel labelTelefone = new JLabel("Telefone: ");
			JTextField valorTelefone;
			JLabel labelEmail = new JLabel("Email: ");
			JTextField valorEmail;
			JLabel labelRedeSocial = new JLabel("Rede Social: ");
			JTextField valorRedeSocial;
			JLabel labelEnd = new JLabel("Endereco: ");
			JTextField valorEnd;
			JLabel labelCEP = new JLabel("CEP: ");
			JTextField valorCEP;
			JLabel labelComplemen = new JLabel("Complemento: ");
			JTextField valorComplemen;

			valorNome = new JTextField(200);
			valorQuantAcompanhante = new JTextField(8);
			valorTelefone = new JTextField(20);
			valorEmail = new JTextField(200);
			valorRedeSocial = new JTextField(200);
			valorEnd = new JTextField(200);
			valorCEP = new JTextField(11);
			valorComplemen = new JTextField(200);

			labelNome.setBounds(30, 20, 150, 25);
			valorNome.setBounds(180, 20, 180, 25);
			labelQuantAcompanhante.setBounds(30, 50, 180, 25);
			valorQuantAcompanhante.setBounds(180, 50, 180, 25);
			labelEmail.setBounds(30, 80, 180, 25);
			valorEmail.setBounds(180, 80, 180, 25);
			labelRedeSocial.setBounds(30, 110, 180, 25);
			valorRedeSocial.setBounds(180, 110, 180, 25);
			labelEnd.setBounds(30, 140, 150, 25);
			valorEnd.setBounds(180, 140, 180, 25);
			labelComplemen.setBounds(30, 170, 150, 25);
			valorComplemen.setBounds(180, 170, 180, 25);
			labelCEP.setBounds(30, 200, 150, 25);
			valorCEP.setBounds(180, 200, 180, 25);
			labelTelefone.setBounds(30, 230, 150, 25);
			valorTelefone.setBounds(180, 230, 180, 25);
			botaoSalvar.setBounds(245, 265, 115, 30);

			this.janela.add(labelNome);
			this.janela.add(valorNome);
			this.janela.add(labelQuantAcompanhante);
			this.janela.add(valorQuantAcompanhante);
			this.janela.add(labelTelefone);
			this.janela.add(valorTelefone);
			this.janela.add(labelEmail);
			this.janela.add(valorEmail);
			this.janela.add(labelRedeSocial);
			this.janela.add(valorRedeSocial);
			this.janela.add(labelEnd);
			this.janela.add(valorEnd);
			this.janela.add(labelCEP);
			this.janela.add(valorCEP);
			this.janela.add(labelComplemen);
			this.janela.add(valorComplemen);

			this.janela.add(botaoSalvar);
			this.janela.setLayout(null);
			this.janela.setSize(400, 360);

		}
		if (op == 2) {

			JLabel labelDescricao = new JLabel("Descri��o: ");
			JTextField valorDescricao;
			JLabel labelDataLimite = new JLabel("Data Limite: ");
			JTextField valorDataLimite;
			JCheckBox valorConcluido = new JCheckBox(" Tarefa Conclu�da ");

			valorDescricao = new JTextField(200);
			valorDataLimite = new JTextField(10);

			labelDescricao.setBounds(30, 20, 150, 25);
			valorDescricao.setBounds(140, 20, 200, 25);
			labelDataLimite.setBounds(30, 50, 180, 25);
			valorDataLimite.setBounds(140, 50, 200, 25);
			valorConcluido.setBounds(120, 80, 180, 25);

			botaoSalvar.setBounds(245, 265, 115, 30);

			this.janela.add(labelDescricao);
			this.janela.add(valorDescricao);
			this.janela.add(labelDataLimite);
			this.janela.add(valorDataLimite);
			this.janela.add(valorConcluido);

			this.janela.add(botaoSalvar);
			this.janela.setLayout(null);
			this.janela.setSize(400, 150);

		}
		if (op == 3) {

			JLabel labelNome = new JLabel("Nome: ");
			JTextField valorNome;
			JLabel labelQuantAcompanhante = new JLabel("N� de Acompanhantes: ");
			JTextField valorQuantAcompanhante;
			JLabel labelTelefone = new JLabel("Telefone: ");
			JTextField valorTelefone;
			JLabel labelEmail = new JLabel("Email: ");
			JTextField valorEmail;
			JLabel labelRedeSocial = new JLabel("Rede Social: ");
			JTextField valorRedeSocial;
			JLabel labelEnd = new JLabel("Endereco: ");
			JTextField valorEnd;
			JLabel labelCEP = new JLabel("CEP: ");
			JTextField valorCEP;
			JLabel labelComplemen = new JLabel("Complemento: ");
			JTextField valorComplemen;

			valorNome = new JTextField(dados.getNomeConvidado(posEvento, posObjeto),200);
			valorQuantAcompanhante = new JTextField(String.valueOf( dados.getQuantAcompanhanteConvidado(posEvento, posObjeto)),8);
			valorTelefone = new JTextField( dados.getTelefone(posEvento, posObjeto), 20);
			valorEmail = new JTextField(dados.getEmail(posEvento, posObjeto), 200);
			valorRedeSocial = new JTextField(dados.getRedeSocial(posEvento, posObjeto), 200);
			valorEnd = new JTextField(dados.getEndConvidado(posEvento, posObjeto), 200);
			valorCEP = new JTextField(dados.getCepConvidado(posEvento, posObjeto), 11);
			valorComplemen = new JTextField(dados.getComplemenConvidado(posEvento, posObjeto), 200);

			labelNome.setBounds(30, 20, 150, 25);
			valorNome.setBounds(180, 20, 180, 25);
			labelQuantAcompanhante.setBounds(30, 50, 180, 25);
			valorQuantAcompanhante.setBounds(180, 50, 180, 25);
			labelEmail.setBounds(30, 80, 180, 25);
			valorEmail.setBounds(180, 80, 180, 25);
			labelRedeSocial.setBounds(30, 110, 180, 25);
			valorRedeSocial.setBounds(180, 110, 180, 25);
			labelEnd.setBounds(30, 140, 150, 25);
			valorEnd.setBounds(180, 140, 180, 25);
			labelComplemen.setBounds(30, 170, 150, 25);
			valorComplemen.setBounds(180, 170, 180, 25);
			labelCEP.setBounds(30, 200, 150, 25);
			valorCEP.setBounds(180, 200, 180, 25);
			labelTelefone.setBounds(30, 230, 150, 25);
			valorTelefone.setBounds(180, 230, 180, 25);
			botaoSalvar.setBounds(125, 265, 115, 30);
			botaoExcluir.setBounds(245, 265, 115, 30);
			
			
			this.janela.add(labelNome);
			this.janela.add(valorNome);
			this.janela.add(labelQuantAcompanhante);
			this.janela.add(valorQuantAcompanhante);
			this.janela.add(labelTelefone);
			this.janela.add(valorTelefone);
			this.janela.add(labelEmail);
			this.janela.add(valorEmail);
			this.janela.add(labelRedeSocial);
			this.janela.add(valorRedeSocial);
			this.janela.add(labelEnd);
			this.janela.add(valorEnd);
			this.janela.add(labelCEP);
			this.janela.add(valorCEP);
			this.janela.add(labelComplemen);
			this.janela.add(valorComplemen);

			this.janela.add(botaoSalvar);
			this.janela.add(botaoExcluir);
			this.janela.setLayout(null);
			this.janela.setSize(400, 360);
			
		}	if (op == 4) {

			JLabel labelDescricao = new JLabel("Descri��o: ");
			JTextField valorDescricao;
			JLabel labelDataLimite = new JLabel("Data Limite: ");
			JTextField valorDataLimite;
			JCheckBox valorConcluido = new JCheckBox(" Tarefa Conclu�da ");

			valorDescricao = new JTextField(dados.getDescricaoTarefa(posEvento, posObjeto),200);
			valorDataLimite = new JTextField(dados.getDataLimiteTarefa(posEvento, posObjeto),10);
			
			if(dados.getConcluidoTarefa(posEvento, posObjeto)) {
				valorConcluido.isSelected();
			}

			labelDescricao.setBounds(30, 20, 150, 25);
			valorDescricao.setBounds(140, 20, 200, 25);
			labelDataLimite.setBounds(30, 50, 180, 25);
			valorDataLimite.setBounds(140, 50, 200, 25);
			valorConcluido.setBounds(120, 80, 180, 25);

			botaoSalvar.setBounds(125, 265, 115, 30);
			botaoExcluir.setBounds(245, 265, 115, 30);

			this.janela.add(labelDescricao);
			this.janela.add(valorDescricao);
			this.janela.add(labelDataLimite);
			this.janela.add(valorDataLimite);
			this.janela.add(valorConcluido);

			this.janela.add(botaoSalvar);
			this.janela.add(botaoExcluir);
			this.janela.setLayout(null);
			this.janela.setSize(400, 150);

		}
		
	
		this.janela.setVisible(true);
		botaoSalvar.addActionListener(this);
		botaoExcluir.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		if (src == botaoSalvar) {
			try {
				boolean res;
				if (opcao == 1) // cadastro de novo Evento
					novoDado[0] = Integer.toString(dados.getQtdEventos());
				else // edicao de Evento existente
					novoDado[0] = Integer.toString(posObjeto);

				/*
				 * novoDado[1] = valorNome.getText(); novoDado[2] = valorData.getText();
				 * novoDado[3] = valorHorai.getText(); novoDado[4] = valorHoraf.getText();
				 * novoDado[5] = valorEnd.getText(); novoDado[6] = valorCEP.getText();
				 * novoDado[7] = valorComplemen.getText();
				 */

				res = dados.adicionarEditarEvento(opcao,posObjeto, novoDado);

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
				res = dados.removerEvento(posObjeto);
				if (res)
					mensagemSucessoExclusao();
				else
					mensagemErroExclusaoEvento();
			}

		}
	}

	public void mensagemSucessoExclusao() {
		JOptionPane.showMessageDialog(null, "Os dados foram excluidos com sucesso!", null,
				JOptionPane.INFORMATION_MESSAGE);
		janela.dispose();
	}

	public void mensagemSucessoCadastro() {
		JOptionPane.showMessageDialog(null, "Os dados foram salvos com sucesso!", null,
				JOptionPane.INFORMATION_MESSAGE);
		janela.dispose();
	}

	public void mensagemErroCadastro() {
		JOptionPane.showMessageDialog(null,
				"ERRO AO SALVAR OS DADOS!\n " + "Pode ter ocorrido um dos dois erros a seguir:  \n"
						+ "1. Nem todos os campos foram preenchidos; \n"
						+ "2. A data n�o est� no formato dd/mm/aaaa; \n"
						+ "3. Os hor�rios de in�cio e t�rmino n�o est�o no formado hh:mm; \n"
						+ "4. O CEP n�o est� no formato 12345-123;",
				null, JOptionPane.ERROR_MESSAGE);
	}

	public void mensagemErroExclusaoEvento() {
		JOptionPane.showMessageDialog(null,
				"Ocorreu um erro ao excluir o dado.\n " + "Verifique se o nome do evento est� correto\n", null,
				JOptionPane.ERROR_MESSAGE);
	}

}
