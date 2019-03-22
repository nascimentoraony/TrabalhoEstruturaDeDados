package br.trabalhoEstrutura;

import java.io.IOException;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) throws IOException {
		//Busca caminho do arquivo - seleção do usuário
		//faz a leitura do tamanho do arquivo para criação do Vetor de movimentação da principal
		//"vetor" é que será usado, para todos os métodos.
		
		String caminho = "./arquivos/portuguese.txt"; 
		
		int tamanho = ArquivoHandler.tamanhoArquivo(caminho);
		
		String[] vetor = new String[tamanho];
		
		vetor = ArquivoHandler.ler_arquivo(caminho);
		
		JOptionPane.showMessageDialog(null, "<<<<<< BEM VINDO AO SISTEMA >>>>>");
		
		ArquivoHandler.ler_arquivo(caminho);
		
		Ordenacao.SelectionSort(vetor);
		
		ArquivoHandler.criar_arquivo(vetor, caminho);
		
	}

}
