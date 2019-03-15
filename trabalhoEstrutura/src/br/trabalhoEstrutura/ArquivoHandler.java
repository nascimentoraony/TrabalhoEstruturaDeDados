package br.trabalhoEstrutura;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ArquivoHandler {

	public static void main(String[] args) {
<<<<<<< HEAD
		
		String nome = "C:\\Users\\fabio\\git\\TrabalhoEstruturaDeDados\\trabalhoEstrutura\\src\\br\\trabalhoEstrutura\\teste.txt";
=======

>>>>>>> branch 'master' of https://github.com/nascimentoraony/TrabalhoEstruturaDeDados.git
		String linha = "";
		int tam = 0;
		
		try { 

			int cont = 0;

			//String vetor_txt[] = new String[tam_vetor];
			

			FileReader arquivo = new FileReader("./arquivos/arquivo.txt");
			BufferedReader ler_arquivo = new BufferedReader(arquivo);

			linha = ler_arquivo.readLine();
			tam =  Integer.parseInt(linha);
			String vetor_txt[] = new String[tam];
			while (linha != null) {
				
				
				linha = ler_arquivo.readLine();
				if(linha != null) {
					vetor_txt[cont] = linha;
					System.out.println(cont+" "+vetor_txt[cont]);
				}
				
				cont++;

			}
			arquivo.close();
			
			System.out.println("VETOR");

			for(int i=0; i<tam; i++) {
				System.out.println(vetor_txt[i]);
			}
			Ordenacao ord = new Ordenacao();
			//vetor_txt = ord.quickSort(vetor_txt[],0,3);
			
		} catch (IOException ex) {
			System.err.printf("Erro: Não foi possível ler o arquivo!", ex.getMessage());

		}
		


	}
}
