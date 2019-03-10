package br.trabalhoEstrutura;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ArquivoHandler {

	public static void main(String[] args) {

		try {

			String nome = "";
			String linha = "";
			int cont = 0;
			//Se der erro ao executar, referente ao tamanho do vetor colocar + 1
			int tam_vetor = Integer.parseInt(linha); //+ 1

			String vetor_txt[] = new String[tam_vetor];

			FileReader arquivo = new FileReader(nome);
			BufferedReader ler_arquivo = new BufferedReader(arquivo);

			linha = ler_arquivo.readLine();

			while (linha != null) {
				System.out.println("\n" + linha);
				linha = ler_arquivo.readLine();
				cont++;
				vetor_txt[cont] = linha;

			}
			arquivo.close();

		} catch (IOException ex) {
			System.err.printf("Erro: Não foi possível ler o arquivo!", ex.getMessage());

		}

	}
}
