package Controle;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import Vizualizacao.EntradaSaida;
import Modelo.*;

public class Controladora {

	private Casa casa = null;// declaramos dentro da varival casa a classe casa

	public void exibeMenu() {
		int opcao;
		int qtdePortas = 0;
		int qtdeJanelas = 0;
		boolean verifi = true;
		do {// repitir at� o us�ario escolher o n�mero 4 dentro do JComboBox declarada
			// dentro da classe EntradaSaida a baixo
			opcao = EntradaSaida.solicitaOpcao();//
			switch (opcao) {
			case 0:// constru��o da casa
				this.casa = new Casa();

				String descricao = EntradaSaida.solicitaDescricao("casa", 0);// solicita a descri��o casa
				String cor = EntradaSaida.solicitaCor();// solicita a cor casa.
				do {
					verifi = true;
					qtdePortas = EntradaSaida.solicitaQtdeAberturas("portas");// qtade de portas
					qtdeJanelas = EntradaSaida.solicitaQtdeAberturas("janelas");// qtade de janelas
					if (qtdePortas < 0 || qtdeJanelas < 0) {
						verifi = false;
						JOptionPane.showMessageDialog(null,
								"Voc� inseriu um n�mero negativo, digite um n�mero de portas ou janelsa possivels");
					}
				} while (!verifi);
				ArrayList<Aberturas> listaDePortas = new ArrayList<Aberturas>();// inicia uma ArrayList lsitaDePortas

				for (int i = 0; i < qtdePortas; i++) {// contadora, que gira o n�mero de portas dado anteriormente
					Porta porta = new Porta();// dentro da varivael porta, se inicia a classe Porta
					// � feito desse jeito para que toda vez que a contadora inicie seja criado uma
					// nova Porta diferente da anterior
					porta.setDescricao(EntradaSaida.solicitaDescricao("porta", (i + 1)));// damos o set da descri��o da
																							// porta
					porta.setEstado(EntradaSaida.solicitaEstado("porta"));// damos o set do estado da porta
					listaDePortas.add(porta);// adicionamos esta porta dentro da ArrayList
				}

				ArrayList<Aberturas> listaDeJanelas = new ArrayList<Aberturas>();// inicia uma ArrayList listaDeJanelas

				for (int i = 0; i < qtdeJanelas; i++) {// contadora, que gira o n�mero de portas dado anteriormente
					Janela janela = new Janela();// dentro da variavel Janela, se inicia a classe Janela
					// � feito desse jeito para que toda vez que a contadora inicie seja criado uma
					// nova Janela diferente da anterior
					janela.setDescricao(EntradaSaida.solicitaDescricao("janela", (i + 1)));// damos o set na descri��o
																							// da janela
					janela.setEstado(EntradaSaida.solicitaEstado("janela"));// damos o set do estado da janela
					listaDeJanelas.add(janela);// adicionamos a janela dentrto da array list
				}
				// Contruindo a casa
				this.casa.constroiCasa(descricao, cor, listaDePortas, listaDeJanelas);
				System.out.println("Descricao de casa: " + casa.getDescricao() + "\n");
				System.out.println("Cor da casa: " + casa.getCor() + "\n");

				for (Aberturas porta : casa.getListaDePortas()) {
					System.out.println("Descricao da porta: " + porta.getDescricao() + "\n");
					System.out.println("Estado da porta: " + porta.getEstado() + "\n");
				}

				for (Aberturas janela : casa.getListaDeJanelas()) {
					System.out.println("Descri��o da Janela: " + janela.getDescricao() + "\n");
					System.out.println("Estado da Janela: " + janela.getEstado() + "\n");
				}
				// Termino da casa
				break;
			case 1:// parte de movimenta��o das partes da casa (janelas e portas)

				String tipoAbertura = EntradaSaida.solicitaTipoAbertura();// pede ao usuario se ele quer movientar porta ou janela
				// e armazena qual tipo na variavel tipoAbertura

				ArrayList<Aberturas> listaDeAberturas = new ArrayList<Aberturas>();// inicia a uma ArrayList de aberturas, uqe ir� subistituir a antiga lista, tanto de porta ou janela

				if (tipoAbertura.equals("porta")) {// verifica qual tipo de abertura
					listaDeAberturas = this.casa.getListaDePortas();// se porta joga a lista de tal dentro da variavel
				} else {
					listaDeAberturas = this.casa.getListaDeJanelas();// se janela joga a lista de tal dentro da variavel
				}
				int posicao = EntradaSaida.solicitaAberturaMover(listaDeAberturas); // solicita qual das aberturas ele ir� mover
				int novoEstado = 0;

				if (posicao != -1) {
					novoEstado = EntradaSaida.solicitaEstado(tipoAbertura);// solicita um novo estado para a abertura
					Aberturas abertura = this.casa.retornaAbertura(posicao, tipoAbertura);// retorna a lista de aberturas com as aberturas atuazliadas
					this.casa.moverAbertura(abertura, novoEstado);// move a abertura
				} else {
					EntradaSaida.exibeMsgAbertura();
				}

				break;
			case 2:// ver as informa��es das casas
				if (this.casa == null) {
					JOptionPane.showMessageDialog(null, "Come�e a construir a casa antes de tudo �ndo");
				} else {
					String informacoes = this.casa.geraInfoCasa();//  gera a info da casa
					EntradaSaida.exibeInfoCasa(informacoes);// mostra a info da casa
				}
				break;
			}
		} while (opcao != 3);

		EntradaSaida.exibeMsgEncerraPrograma();

		System.exit(0);
	}

}
