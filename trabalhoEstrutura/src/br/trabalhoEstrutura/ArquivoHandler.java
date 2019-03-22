package br.trabalhoEstrutura;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class ArquivoHandler {

	public static int tamanhoArquivo(String caminho) throws IOException {
		String linha = "";
		int tam = 0;
		try {
			FileReader arquivo = new FileReader(caminho);
			BufferedReader ler_arquivo = new BufferedReader(arquivo);
			linha = ler_arquivo.readLine();
			tam = Integer.parseInt(linha);
			arquivo.close();
		}
		catch (IOException ex) {System.err.printf("Erro: Não foi possível ler o arquivo!", ex.getMessage());}	
		return tam;
	}
	
	public static String[] ler_arquivo(String caminho) throws IOException {
		//caminho = "./arquivos/portuguese.txt";
		String linha = "";
		int tam = 0;
		String V[] = null;
		try {
			int cont = 0;
			FileReader arquivo = new FileReader(caminho);
			BufferedReader ler_arquivo = new BufferedReader(arquivo);
			linha = ler_arquivo.readLine();
			tam = Integer.parseInt(linha);
			V = new String[tam];
			while (linha != null) {
				linha = ler_arquivo.readLine();
				if (linha != null) {V[cont] = linha;}
				cont++;
			}
			arquivo.close();
		} catch (IOException ex) {System.err.printf("Erro: Não foi possível ler o arquivo!", ex.getMessage());}
		return V;
	}

	public static void criar_arquivo(String[] arquivo, String caminho) {
		//O arquivo criado salva na pasta do disco no mesmo endereço informado.
		//String caminho = "./arquivos/arquivo.txt";
		int tam = 0;
		int cont = 0;
		try {
			FileOutputStream criar_arquivo = new FileOutputStream(caminho);
			PrintWriter escrever = new PrintWriter(criar_arquivo);
			String vetor_txt[] = new String[tam];
			for(int i=0; i<=vetor_txt.length; i++) {
				 escrever.println(vetor_txt[i] + " |" + vetor_txt[i].length()+"| ");
				 cont++;
			}
			System.out.println("Arquivo criado com sucesso! ");
			criar_arquivo.close();
			escrever.close();
		} catch (IOException ex) {System.err.printf("Erro: aquivo não criado! ", ex.getMessage());}
	}

}
