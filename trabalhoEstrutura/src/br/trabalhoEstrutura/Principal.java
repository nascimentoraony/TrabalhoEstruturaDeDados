package br.trabalhoEstrutura;

import br.teste.BuscaSequencial;

public class Principal {

	public static void main(String[] args) {
		String[] A = {"aaa","aa","aaaa","a", "joao", "aaaaaaa","aaaaa","aaaaaa"};
		//Ordenacao.sort(A);
		
		BuscaSequencial.buscaSequencial(A, "joao");
	}

}
