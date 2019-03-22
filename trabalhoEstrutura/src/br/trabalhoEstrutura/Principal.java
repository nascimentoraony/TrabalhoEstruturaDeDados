package br.trabalhoEstrutura;

import java.io.IOException;

import br.teste.BuscaSequencial;

public class Principal {

	public static void main(String[] args) throws IOException {
		//Busca caminho do arquivo - seleção do usuário
		//faz a leitura do tamanho do arquivo para criação do Vetor de movimentação da principal
		String caminho = "./arquivos/portuguese.txt"; 
		int tamanho = ArquivoHandler.tamanhoArquivo(caminho);
		String[] vetor = new String[tamanho];
	}

}
