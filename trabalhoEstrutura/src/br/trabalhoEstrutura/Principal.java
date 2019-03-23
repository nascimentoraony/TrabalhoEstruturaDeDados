package br.trabalhoEstrutura;

import java.io.IOException;

import javax.swing.JOptionPane;

import br.teste.EscolherArquivo;

public class Principal {

	public static void main(String[] args) throws IOException {
		//Busca caminho do arquivo - seleção do usuário
		//faz a leitura do tamanho do arquivo para criação do Vetor de movimentação da principal
		//"vetor" é que será usado, para todos os métodos.
		
		// apenas comentado String caminho = "./arquivos/arquivo.txt"; 
		
		int op = 0;
		String caminho = EscolherArquivo.caminho();
		// criei uma classe no pacote de testes chamada de Escolher Arquivo possibilita a melhor inserção da
		//mesma, pois não consegui ler ou gravar os arquivos, na classe principal.
		
		int tamanho = ArquivoHandler.tamanhoArquivo(caminho);
		
		String[] vetor = new String[tamanho];
		
		vetor = ArquivoHandler.ler_arquivo(caminho);
		
		JOptionPane.showMessageDialog(null, "<<<<<< BEM VINDO AO SISTEMA >>>>>");
		
	String [] ordenationOption = {"BubbleSort", "QuickSort", "MergeSort", "SelectionSort"};
	int var = JOptionPane.showOptionDialog(null, "Escolha qual Método de Ordenação deseja executar;",
            "OPÇÕES",
            JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, ordenationOption
            , ordenationOption[0]);

		do {
			if (var == 0) {
				long tempoInicial = System.currentTimeMillis();
				
				vetor = Ordenacao.BubbleSort(vetor);
				
				long tempoFinal = System.currentTimeMillis();
				
				JOptionPane.showMessageDialog(null, "BubbleSort Executado!");
				
				JOptionPane.showMessageDialog(null, "Executado em: " + (tempoFinal - tempoInicial) + "ms" );
			}
			
			if (var == 1) {
				long tempoInicial = System.currentTimeMillis();
				
				vetor = Ordenacao.QuickSort(vetor, 0, vetor.length);
				
				long tempoFinal = System.currentTimeMillis();
				
				JOptionPane.showMessageDialog(null, "QuickSort Executado!");
				
				JOptionPane.showMessageDialog(null, "Executado em: " + (tempoFinal - tempoInicial) + "ms" );
			}
			
			if (var == 2) {
				long tempoInicial = System.currentTimeMillis();
				
				vetor = Ordenacao.mergeSort(vetor, 0, vetor.length);
				
				long tempoFinal = System.currentTimeMillis();
				
				JOptionPane.showMessageDialog(null, "MergeSort Executado!");
				
				JOptionPane.showMessageDialog(null, "Executado em: " + (tempoFinal - tempoInicial) + "ms" );
			}
			
			if (var == 3) {
				long tempoInicial = System.currentTimeMillis();
				
				Ordenacao.SelectionSort(vetor);
				
				long tempoFinal = System.currentTimeMillis();
				
				JOptionPane.showMessageDialog(null, "SelectionSort Executado!");
				
				JOptionPane.showMessageDialog(null, "Executado em: " + (tempoFinal - tempoInicial) + "ms" );
			}
			
			op = JOptionPane.showConfirmDialog(null, "Deseja alterar o método de Ordenação?");
		} while (op == 0);
		
		int opp = 0;
		
		do {
			
			JOptionPane.showMessageDialog(null, "Criação do Arquivo Ordenado!");
			
			ArquivoHandler.criar_arquivo(vetor, "./arquivos/output.txt");
			
			opp = JOptionPane.showConfirmDialog(null, "Finalizar a Criação ?"); 
			
		} while (opp == 0); 
		
		String [] searchOtion = {};
		
		
		
		
		
		System.out.println("FIM"); 
		
	}

}