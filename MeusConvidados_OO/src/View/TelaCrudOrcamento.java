package View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Controle.ControleBancoEvento;

public class TelaCrudOrcamento implements ActionListener {

	private JFrame janela;
	private JButton botaoExcluir = new JButton("Excluir");
	private JButton botaoSalvar = new JButton("Salvar");
	private String[] novoDado = new String[10];
	private static ControleBancoEvento dados;
	private int opcao;
	private JLabel labelDescricao = new JLabel("Descrição: ");
	private JTextField valorDescricao;
	private JLabel labelValorTotal = new JLabel("Valor total: ");
	private JTextField valorValorTotal;
	private JLabel labelQuantidade = new JLabel("Quantidade: ");
	private JTextField valorQuantidade;
	private JLabel labelValorUnitario = new JLabel("Valor Unitário: ");
	private JTextField valorValorUnitario;
	private JCheckBox valorAlcoolico = new JCheckBox(" Alcoólico ");
	private JCheckBox valorBebidaQuente = new JCheckBox(" Bebida Quente ");
	private JCheckBox valorPrincipal = new JCheckBox(" Prato Principal ");
	private JCheckBox valorDegustativo = new JCheckBox(" Prato Degustativo ");
	private JCheckBox valorSobremesa = new JCheckBox(" Sobremesa ");
	private JCheckBox valorDecoracao = new JCheckBox(" Decoração ");
	private JCheckBox valorEstacionamento = new JCheckBox(" Estacionamento ");
	private JCheckBox valorImobiliario = new JCheckBox(" Imobiliario ");
	private JCheckBox valorInternet = new JCheckBox(" Internet ");
	private JCheckBox valorEquipamento= new JCheckBox(" Equipamento ");
	private JCheckBox valorToalete= new JCheckBox(" Toalete ");
	private JLabel labelGeneroMusical = new JLabel("Gênero Musical: ");
	private JTextField valorGeneroMusical;
	private JCheckBox valorBanda = new JCheckBox(" Banda ");
	private JCheckBox valorDj = new JCheckBox(" Dj ");
	
	
	
	private int posObjeto;
	private int posEvento;
	private String s;
	private int tipo;
	
	public void inserirEditarOrcamento(int op, int tipo ,int posEvento, int posObjeto, ControleBancoEvento d) {

		opcao = op;
		
		this.posObjeto = posObjeto;
		this.posEvento = posEvento;
		this.tipo = tipo;
		dados = d;

		if (op == 1)
			s = "Cadastro de Orçamento";
		if (op == 2)
			s = "Atualizar Orçamento";

		janela = new JFrame(s);

		if (op == 1 && tipo == 1) {    //Cadastro Bebidas

			valorDescricao = new JTextField(200);
			valorValorTotal = new JTextField(8);
			valorValorUnitario  = new JTextField(200);
			valorQuantidade = new JTextField(200);
	
			labelDescricao.setBounds(30, 20, 180, 25);
			valorDescricao.setBounds(120, 20, 180, 25);
			labelQuantidade.setBounds(30, 50, 180, 25);
			valorQuantidade.setBounds(120, 50, 180, 25);
			valorValorUnitario.setBounds(120, 80, 180, 25);
			labelValorUnitario.setBounds(30, 80, 180, 25);
			
			labelValorTotal.setBounds(30, 110, 180, 25);
			valorValorTotal.setBounds(120, 110, 180, 25);
			valorBebidaQuente.setBounds(30, 140, 180, 25);
			valorAlcoolico.setBounds(30, 170, 180, 25);
			
			botaoSalvar.setBounds(245, 265, 115, 30);

			this.janela.add(labelDescricao);
			this.janela.add(valorDescricao);
			this.janela.add(labelQuantidade);
			this.janela.add(valorQuantidade);
			this.janela.add(valorBebidaQuente);
			this.janela.add(valorValorUnitario);
			this.janela.add(labelValorUnitario);
			this.janela.add(valorAlcoolico);
			this.janela.add(valorValorTotal);
			this.janela.add(labelValorTotal);
			

			this.janela.add(botaoSalvar);
			this.janela.setLayout(null);
			this.janela.setSize(400, 360);

		}
		if (op == 1 && tipo == 2 ) { // cadastro comida

			valorDescricao = new JTextField(200);
			valorValorTotal = new JTextField(8);
			valorValorUnitario  = new JTextField(200);
			valorQuantidade = new JTextField(200);
	
			labelDescricao.setBounds(30, 20, 180, 25);
			valorDescricao.setBounds(120, 20, 180, 25);
			labelQuantidade.setBounds(30, 50, 180, 25);
			valorQuantidade.setBounds(120, 50, 180, 25);
			valorValorUnitario.setBounds(120, 80, 180, 25);
			labelValorUnitario.setBounds(30, 80, 180, 25);
			labelValorTotal.setBounds(30, 110, 180, 25);
			valorValorTotal.setBounds(120, 110, 180, 25);
			
			valorPrincipal.setBounds(30, 140, 180, 25);
			valorDegustativo.setBounds(30, 170, 180, 25);
			valorSobremesa.setBounds(30, 200, 180, 25);
			
			botaoSalvar.setBounds(245, 265, 115, 30);

			this.janela.add(labelDescricao);
			this.janela.add(valorDescricao);
			this.janela.add(labelQuantidade);
			this.janela.add(valorQuantidade);
			this.janela.add(valorDegustativo);
			this.janela.add(valorValorUnitario);
			this.janela.add(labelValorUnitario);
			this.janela.add(valorPrincipal);
			this.janela.add(valorValorTotal);
			this.janela.add(labelValorTotal);
			this.janela.add(valorSobremesa);
			

			this.janela.add(botaoSalvar);
			this.janela.setLayout(null);
			this.janela.setSize(400, 360);
			
		}
		if (op == 1 && tipo== 3) { // cadastro Infraestrutura


			valorDescricao = new JTextField(200);
			valorValorTotal = new JTextField(8);
		
	
			labelDescricao.setBounds(30, 20, 180, 25);
			valorDescricao.setBounds(120, 20, 180, 25);
			labelValorTotal.setBounds(30, 50, 180, 25);
			valorValorTotal.setBounds(120, 50, 180, 25);
			valorDecoracao.setBounds(30, 80, 180, 25);
			valorEstacionamento.setBounds(30, 110, 180, 25);
			valorImobiliario.setBounds(30, 140, 180, 25);
			valorInternet.setBounds(30, 170, 180, 25);
			valorEquipamento.setBounds(30, 200, 180, 25);
			valorToalete.setBounds(30, 230, 180, 25);
			
			botaoSalvar.setBounds(245, 265, 115, 30);

			this.janela.add(labelDescricao);
			this.janela.add(valorDescricao);
			this.janela.add(valorDecoracao);
			this.janela.add(valorEstacionamento);
			this.janela.add(valorImobiliario);
			this.janela.add(valorInternet);
			this.janela.add(valorEquipamento);
			this.janela.add(valorValorTotal);
			this.janela.add(labelValorTotal);
			this.janela.add(valorToalete);
			

			this.janela.add(botaoSalvar);
			this.janela.setLayout(null);
			this.janela.setSize(400, 360);
			
			
		}
		if (op == 1 && tipo == 4) { // cadastro musica
			
			valorDescricao = new JTextField(200);
			valorValorTotal = new JTextField(8);
			valorGeneroMusical = new JTextField(20);
		
	
			labelDescricao.setBounds(30, 20, 180, 25);
			valorDescricao.setBounds(130, 20, 180, 25);
			labelValorTotal.setBounds(30, 50, 180, 25);
			valorValorTotal.setBounds(130, 50, 180, 25);
			labelGeneroMusical.setBounds(30, 80, 180, 25);
			valorGeneroMusical.setBounds(130, 80, 180, 25);
			valorBanda.setBounds(30, 110, 180, 25);
			valorDj.setBounds(30, 140, 180, 25);
			
			
			botaoSalvar.setBounds(245, 265, 115, 30);

			this.janela.add(labelDescricao);
			this.janela.add(valorDescricao);
			this.janela.add(valorBanda);
			this.janela.add(valorDj);
			this.janela.add(labelGeneroMusical);
			this.janela.add(valorGeneroMusical);
			this.janela.add(valorValorTotal);
			this.janela.add(labelValorTotal);
			
			

			this.janela.add(botaoSalvar);
			this.janela.setLayout(null);
			this.janela.setSize(400, 360);
			
		} if (op == 2 && tipo == 1) {    //Editar bebidas

			valorDescricao = new JTextField(dados.getDescricaoBebida(posEvento, posObjeto),200);
			valorValorTotal = new JTextField(String.valueOf(dados.getValorTotalBebida( posEvento, posObjeto)),20);
			valorValorUnitario  = new JTextField(String.valueOf(dados.getValorUnitarioBebida( posEvento, posObjeto)),200);
			valorQuantidade = new JTextField(String.valueOf(dados.getValorQuantidadeBebida( posEvento, posObjeto)),200);
			if (dados.getBebidaQuente(posEvento, posObjeto)) {
				valorBebidaQuente.setSelected(true);
				}
	
			if (dados.getAlcoolico(posEvento, posObjeto)) {
				valorAlcoolico.setSelected(true);
				}
			
			labelDescricao.setBounds(30, 20, 180, 25);
			valorDescricao.setBounds(120, 20, 180, 25);
			labelQuantidade.setBounds(30, 50, 180, 25);
			valorQuantidade.setBounds(120, 50, 180, 25);
			valorValorUnitario.setBounds(120, 80, 180, 25);
			labelValorUnitario.setBounds(30, 80, 180, 25);
			
			labelValorTotal.setBounds(30, 110, 180, 25);
			valorValorTotal.setBounds(120, 110, 180, 25);
			valorBebidaQuente.setBounds(30, 140, 180, 25);
			valorAlcoolico.setBounds(30, 170, 180, 25);
			
			botaoExcluir.setBounds(245, 265, 115, 30);
			botaoSalvar.setBounds(125, 265, 115, 30);

			this.janela.add(labelDescricao);
			this.janela.add(valorDescricao);
			this.janela.add(labelQuantidade);
			this.janela.add(valorQuantidade);
			this.janela.add(valorBebidaQuente);
			this.janela.add(valorValorUnitario);
			this.janela.add(labelValorUnitario);
			this.janela.add(valorAlcoolico);
			this.janela.add(valorValorTotal);
			this.janela.add(labelValorTotal);
			

			this.janela.add(botaoSalvar);
			this.janela.add(botaoExcluir);
			this.janela.setLayout(null);
			this.janela.setSize(400, 360);
			

		}if (op == 2 && tipo == 2 ) { // Editar comida

			valorDescricao = new JTextField(dados.getDescricaoComida(posEvento, posObjeto),200);
			valorValorTotal = new JTextField(String.valueOf(dados.getValorTotalComida( posEvento, posObjeto)),20);
			valorValorUnitario  = new JTextField(String.valueOf(dados.getValorUnitarioComida( posEvento, posObjeto)),200);
			valorQuantidade = new JTextField(String.valueOf(dados.getValorQuantidadeComida( posEvento, posObjeto)),200);
	
			if (dados.getPrincipal(posEvento, posObjeto)) {
				valorPrincipal.setSelected(true);
				}
	
			if (dados.getDegustativo(posEvento, posObjeto)) {
				valorDegustativo.setSelected(true);
				}
			if (dados.getSobremesa(posEvento, posObjeto)) {
				valorSobremesa.setSelected(true);
				}
			
			
			
			labelDescricao.setBounds(30, 20, 180, 25);
			valorDescricao.setBounds(120, 20, 180, 25);
			labelQuantidade.setBounds(30, 50, 180, 25);
			valorQuantidade.setBounds(120, 50, 180, 25);
			valorValorUnitario.setBounds(120, 80, 180, 25);
			labelValorUnitario.setBounds(30, 80, 180, 25);
			labelValorTotal.setBounds(30, 110, 180, 25);
			valorValorTotal.setBounds(120, 110, 180, 25);
			
			valorPrincipal.setBounds(30, 140, 180, 25);
			valorDegustativo.setBounds(30, 170, 180, 25);
			valorSobremesa.setBounds(30, 200, 180, 25);
			
			botaoExcluir.setBounds(245, 265, 115, 30);
			botaoSalvar.setBounds(125, 265, 115, 30);

			this.janela.add(labelDescricao);
			this.janela.add(valorDescricao);
			this.janela.add(labelQuantidade);
			this.janela.add(valorQuantidade);
			this.janela.add(valorDegustativo);
			this.janela.add(valorValorUnitario);
			this.janela.add(labelValorUnitario);
			this.janela.add(valorPrincipal);
			this.janela.add(valorValorTotal);
			this.janela.add(labelValorTotal);
			this.janela.add(valorSobremesa);
			

			this.janela.add(botaoSalvar);
			this.janela.add(botaoExcluir);
			this.janela.setLayout(null);
			this.janela.setSize(400, 360);
			
		
		} if (op == 2 && tipo== 3) { // Editar Infraestrutura


			valorDescricao = new JTextField(dados.getDescricaoInfraestrutura(posEvento, posObjeto), 200);
			valorValorTotal = new JTextField(String.valueOf(dados.getValorTotalInfraestrutura( posEvento, posObjeto)),20);
			
			if (dados.getDecoracao(posEvento, posObjeto)) {
				valorDecoracao.setSelected(true);
				}
	
			if (dados.getEstacionamento(posEvento, posObjeto)) {
				valorEstacionamento.setSelected(true);
				}
			if (dados.getImobiliario(posEvento, posObjeto)) {
				valorImobiliario.setSelected(true);
				}
			if (dados.getInternet(posEvento, posObjeto)) {
				valorInternet.setSelected(true);
				}
			if (dados.getEquipamento(posEvento, posObjeto)) {
				valorEquipamento.setSelected(true);
				}
			if (dados.getToalete(posEvento, posObjeto)) {
				valorToalete.setSelected(true);
				}
		
	
			labelDescricao.setBounds(30, 20, 180, 25);
			valorDescricao.setBounds(120, 20, 180, 25);
			labelValorTotal.setBounds(30, 50, 180, 25);
			valorValorTotal.setBounds(120, 50, 180, 25);
			valorDecoracao.setBounds(30, 80, 180, 25);
			valorEstacionamento.setBounds(30, 110, 180, 25);
			valorImobiliario.setBounds(30, 140, 180, 25);
			valorInternet.setBounds(30, 170, 180, 25);
			valorEquipamento.setBounds(30, 200, 180, 25);
			valorToalete.setBounds(30, 230, 180, 25);
			
			botaoExcluir.setBounds(245, 265, 115, 30);
			botaoSalvar.setBounds(125, 265, 115, 30);

			this.janela.add(labelDescricao);
			this.janela.add(valorDescricao);
			this.janela.add(valorDecoracao);
			this.janela.add(valorEstacionamento);
			this.janela.add(valorImobiliario);
			this.janela.add(valorInternet);
			this.janela.add(valorEquipamento);
			this.janela.add(valorValorTotal);
			this.janela.add(labelValorTotal);
			this.janela.add(valorToalete);
			
			this.janela.add(botaoSalvar);
			this.janela.add(botaoExcluir);
			this.janela.setLayout(null);
			this.janela.setSize(400, 360);
			
			
		} if (op == 2 && tipo == 4) { // Editar musica
			
			valorDescricao = new JTextField(dados.getDescricaoMusica(posEvento, posObjeto), 200);
			valorValorTotal = new JTextField(String.valueOf(dados.getValorTotalMusica( posEvento, posObjeto)),20);
			valorGeneroMusical = new JTextField(dados.getGeneroMusical(posEvento, posObjeto), 20);
		
			if (dados.getBanda(posEvento, posObjeto)) {
				valorBanda.setSelected(true);
				}
			if (dados.getDj(posEvento, posObjeto)) {
				valorDj.setSelected(true);
				}
			
			labelDescricao.setBounds(30, 20, 180, 25);
			valorDescricao.setBounds(130, 20, 180, 25);
			labelValorTotal.setBounds(30, 50, 180, 25);
			valorValorTotal.setBounds(130, 50, 180, 25);
			labelGeneroMusical.setBounds(30, 80, 180, 25);
			valorGeneroMusical.setBounds(130, 80, 180, 25);
			valorBanda.setBounds(30, 110, 180, 25);
			valorDj.setBounds(30, 140, 180, 25);
			
			
			botaoExcluir.setBounds(245, 265, 115, 30);
			botaoSalvar.setBounds(125, 265, 115, 30);

			this.janela.add(labelDescricao);
			this.janela.add(valorDescricao);
			this.janela.add(valorBanda);
			this.janela.add(valorDj);
			this.janela.add(labelGeneroMusical);
			this.janela.add(valorGeneroMusical);
			this.janela.add(valorValorTotal);
			this.janela.add(labelValorTotal);
			
			

			this.janela.add(botaoSalvar);
			this.janela.add(botaoExcluir);
			this.janela.setLayout(null);
			this.janela.setSize(400, 360);
			
		}

		this.janela.setVisible(true);
		botaoSalvar.addActionListener(this);
		botaoExcluir.addActionListener(this);

	
	} 

	
	
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		if (src == botaoSalvar) {
			try {
				boolean res = false;
				if (tipo == 1) { // bebida
					novoDado[1] = valorDescricao.getText();
					novoDado[2] = valorQuantidade.getText();
					novoDado[3] = valorValorUnitario.getText();
					novoDado[4] = valorValorTotal.getText();
					if (valorBebidaQuente.isSelected())
						novoDado[5] = "true";
					else
						novoDado[5] = "false";
					if (valorAlcoolico.isSelected())
						novoDado[6] = "true";
					else
						novoDado[6] = "false";
					res = dados.adicionarEditarBebida(opcao, posEvento, posObjeto, novoDado);
				} else if (tipo == 2) { // comida
					novoDado[1] = valorDescricao.getText();
					novoDado[2] = valorQuantidade.getText();
					novoDado[3] = valorValorUnitario.getText();
					novoDado[4] = valorValorTotal.getText();
					if (valorPrincipal.isSelected())
						novoDado[5] = "true";
					else
						novoDado[5] = "false";
					if (valorDegustativo.isSelected())
						novoDado[6] = "true";
					else
						novoDado[6] = "false";
					if (valorSobremesa.isSelected())
						novoDado[7] = "true";
					else
						novoDado[7] = "false";
					res = dados.adicionarEditarComida(opcao, posEvento, posObjeto, novoDado);
				} else if (tipo == 3) { // infraestrutura
					
					novoDado[1] = valorDescricao.getText();
					novoDado[2] = valorValorTotal.getText();
					if (valorDecoracao.isSelected())
						novoDado[3] = "true";
					else
						novoDado[3] = "false";
					if (valorEstacionamento.isSelected())
						novoDado[4] = "true";
					else
						novoDado[4] = "false";
					if (valorImobiliario.isSelected())
						novoDado[5] = "true";
					else
						novoDado[5] = "false";
					if (valorInternet.isSelected())
						novoDado[6] = "true";
					else
						novoDado[6] = "false";
					if (valorEquipamento.isSelected())
						novoDado[7] = "true";
					else
						novoDado[7] = "false";
					if (valorToalete.isSelected())
						novoDado[8] = "true";
					else
						novoDado[8] = "false";
					res = dados.adicionarEditarInfraestrutura(opcao, posEvento, posObjeto, novoDado);
				}else if (tipo == 4) { // Musica
					
					novoDado[1] = valorDescricao.getText();
					novoDado[2] = valorValorTotal.getText();
					novoDado[3] = valorGeneroMusical.getText();
					if (valorBanda.isSelected())
						novoDado[4] = "true";
					else
						novoDado[4] = "false";
					if (valorDj.isSelected())
						novoDado[5] = "true";
					else
						novoDado[5] = "false";
		
					res = dados.adicionarEditarMusica(opcao, posEvento, posObjeto, novoDado);
				}else
					res = false;

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

			if (tipo == 1) // exclui a bebida
				res = dados.removerBebida(posEvento, posObjeto);
			
			if (tipo == 2) // exclui a comida
				res = dados.removerComida(posEvento, posObjeto);
			if (tipo == 3) // exclui infraestrutura
				res = dados.removerInfraestrutura(posEvento, posObjeto);

			if (tipo == 4) // exclui musica
				res = dados.removerMusica(posEvento, posObjeto);
			if (res)
				mensagemSucessoExclusao();
			else
				mensagemErroExclusaoEvento();
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
						+ "2. A data não está no formato dd/mm/aaaa; \n"
						+ "3. Os horários de início e término não estão no formado hh:mm; \n"
						+ "4. O CEP não está no formato 12345-123;",
				null, JOptionPane.ERROR_MESSAGE);
	}

	public void mensagemErroExclusaoEvento() {
		JOptionPane.showMessageDialog(null,
				"Ocorreu um erro ao excluir o dado.\n " + "Verifique se o nome do evento está correto\n", null,
				JOptionPane.ERROR_MESSAGE);
	}

}
