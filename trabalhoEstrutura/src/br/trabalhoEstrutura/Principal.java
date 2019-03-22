package br.trabalhoEstrutura;

import java.io.IOException;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) throws IOException {
		//Busca caminho do arquivo - seleção do usuário
		//faz a leitura do tamanho do arquivo para criação do Vetor de movimentação da principal
		//"vetor" é que será usado, para todos os métodos.
		
		String caminho = "./arquivos/arquivo.txt"; 
		
		int tamanho = ArquivoHandler.tamanhoArquivo(caminho);
		
		String[] vetor = new String[tamanho];
		
		vetor = ArquivoHandler.ler_arquivo(caminho);
		
		//JOptionPane.showMessageDialog(null, "<<<<<< BEM VINDO AO SISTEMA >>>>>");
		System.out.println("lido");
		
		vetor = Ordenacao.mergeSort(vetor,0,tamanho-1);
		
		System.out.println("Ordenado");
		
		ArquivoHandler.criar_arquivo(vetor, "./arquivos/output.txt");
		
		System.out.println("FIM"); 
		
	}

}
