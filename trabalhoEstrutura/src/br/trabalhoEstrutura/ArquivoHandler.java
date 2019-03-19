package br.trabalhoEstrutura;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ArquivoHandler {

	public static void main(String[] args) throws IOException {
		String nome = "./arquivos/portuguese.txt";
		String linha = "";
		int tam = 0;
		
		try {

			int cont = 0;

			FileReader arquivo = new FileReader(nome);
			BufferedReader ler_arquivo = new BufferedReader(arquivo);

			linha = ler_arquivo.readLine();
			tam = Integer.parseInt(linha);
			String vetor_txt[] = new String[tam];
			
			while (linha != null) {

				linha = ler_arquivo.readLine();
				if (linha != null) {
					vetor_txt[cont] = linha;
					
				}

				cont++;

			}
			arquivo.close();

			for (int i = 0; i < tam; i++) {
				System.out.println(vetor_txt[i]);
			}
			

		} catch (IOException ex) {
			System.err.printf("Erro: Não foi possível ler o arquivo!", ex.getMessage());

		}
		
		//Criando arquivo em branco.
		
		File arquivo_ordenado = new File("./arquivos/ordenado.txt");
		
		try {
		arquivo_ordenado.createNewFile();
		}catch (IOException ex){
			System.err.printf("Erro: aquivo não criado! ",ex.getMessage());
			
		}
		
		
		
	}
}
