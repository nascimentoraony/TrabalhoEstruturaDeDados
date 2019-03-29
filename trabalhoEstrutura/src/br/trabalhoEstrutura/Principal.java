
package br.trabalhoEstrutura;

import java.io.IOException;

import javax.swing.JOptionPane;

import br.efects.EscolherArquivo;

import br.efects.ProgressBar;

public class Principal {

	public static void main(String[] args) throws IOException {

		ProgressBar moment = new ProgressBar();

		String[] system = { "Iniciar", "Finalizar" };
		int varI = JOptionPane.showOptionDialog(null, "Sistema de Ordenação de Dicionários TXT",
				"SISORD - Versão 1.4.2", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, system,
				system[0]);

		int opp = 0;

		if (varI == 0) {
			do {

				JOptionPane.showMessageDialog(null, "<<<<<< BEM VINDO AO SISTEMA >>>>>");

				String caminho = EscolherArquivo.caminho();

				String vetor[] = ArquivoHandler.ler_arquivo(caminho);
				String vetorOrdenado[] = vetor;

				long tempoInicial = 0;
				long tempoFinal = 0;

				String[] ordenationOption = { "BubbleSort", "InsertionSort", "MergeSort","SelectionSort" };
				int var = JOptionPane.showOptionDialog(null, "Escolha qual Método de Ordenação deseja executar;",
						"OPÇÕES", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, ordenationOption,
						ordenationOption[0]);
           
				switch (var) {
				case 0:    
					tempoInicial = System.currentTimeMillis();

					vetorOrdenado = Ordenacao.BubbleSort(vetor);

					moment.setVisible(true);

					moment.setAlwaysOnTop(true);

					moment.toFront();

					moment.iterate();

					moment.setVisible(false);

					tempoFinal = System.currentTimeMillis();

					JOptionPane.showMessageDialog(null, "BubbleSort Executado!");

					JOptionPane.showMessageDialog(null, "Executado em: " + (tempoFinal - tempoInicial) + "ms");

				case 1:
					tempoInicial = System.currentTimeMillis();

					vetorOrdenado = Ordenacao.insertionSort(vetor);
					moment.setVisible(true);

					moment.setAlwaysOnTop(true);

					moment.toFront();

					moment.iterate();

					moment.setVisible(false);

					tempoFinal = System.currentTimeMillis();

					JOptionPane.showMessageDialog(null, "InsertionSort Executado!");

					JOptionPane.showMessageDialog(null, "Executado em: " + (tempoFinal - tempoInicial) + " ms");
					break;

				case 2:
					tempoInicial = System.currentTimeMillis();

					vetorOrdenado = Ordenacao.mergeSort(vetor, 0, vetor.length - 1);

					moment.setVisible(true);

					moment.setAlwaysOnTop(true);

					moment.toFront();

					moment.iterate();

					moment.setVisible(false);

					tempoFinal = System.currentTimeMillis();

					JOptionPane.showMessageDialog(null, "MergeSort Executado!");

					JOptionPane.showMessageDialog(null, "Executado em: " + (tempoFinal - tempoInicial) + "ms");
					break;

				case 3:
					tempoInicial = System.currentTimeMillis();

					vetorOrdenado = Ordenacao.SelectionSort(vetor);

					moment.setVisible(true);

					moment.setAlwaysOnTop(true);

					moment.toFront();

					moment.iterate();

					moment.setVisible(false);

					tempoFinal = System.currentTimeMillis();

					JOptionPane.showMessageDialog(null, "SelectionSort Executado!");

					JOptionPane.showMessageDialog(null, "Executado em: " + (tempoFinal - tempoInicial) + "ms");
					break;
				}

				JOptionPane.showMessageDialog(null, "Criação do Arquivo Ordenado...");

				String caminhoGravacao = EscolherArquivo.caminho();

				ArquivoHandler.criar_arquivo(vetorOrdenado, caminhoGravacao);

				String search = "";
				int op = 0;

				int busca = JOptionPane.showConfirmDialog(null, "Deseja realizar uma busca no arquivo Ordenado?");

				if (busca == 0) {
					do {

						String[] searchOption = { "Busca Sequencial", "Busca Binaria" };
						int var1 = JOptionPane.showOptionDialog(null,
								"Escolha qual Método de Ordenação deseja executar;", "OPÇÕES",
								JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, searchOption,
								searchOption[0]);

						switch (var1) {
						case 0:
							search = JOptionPane.showInputDialog("Informe a Palavra que deseja Buscar");

							Busca.buscaSequencial(vetorOrdenado, search);
							break;

						case 1:
							search = JOptionPane.showInputDialog("Informe a Palavra que deseja Buscar");

							Busca.binarySearch(vetorOrdenado, search, 0, vetorOrdenado.length - 1);
							break;
						}

						op = JOptionPane.showConfirmDialog(null, "Deseja Realizar outra busca ?");
					} while (op == 0);

				}

				opp = JOptionPane.showConfirmDialog(null, "Deseja Carregar um novo arquivo ?");

			} while (opp == 0);
		} else {
			JOptionPane.showMessageDialog(null, "Programa Finalizado Com Sucesso !");
		}
	}
}