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
		
		String caminho = EscolherArquivo.caminho();
		// criei uma classe no pacote de testes chamada de Escolher Arquivo possibilita a melhor inserção da
		//mesma, pois não consegui ler ou gravar os arquivos, na classe principal.
		
		int tamanho = ArquivoHandler.tamanhoArquivo(caminho);
		
		String[] vetor = new String[tamanho];
		
		vetor = ArquivoHandler.ler_arquivo(caminho);
		
		JOptionPane.showMessageDialog(null, "<<<<<< BEM VINDO AO SISTEMA >>>>>");
		
		System.out.println("lido");
		
		//Ordenacao.QuickSort(vetor, 0, vetor.length - 1);
		
		vetor = Ordenacao.mergeSort(vetor,0,tamanho-1);
		
		System.out.println("Ordenado");
		
		ArquivoHandler.criar_arquivo(vetor, "./arquivos/output.txt");
		
		System.out.println("FIM"); 
		
	}

}
