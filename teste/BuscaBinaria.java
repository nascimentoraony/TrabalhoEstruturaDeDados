package br.teste;

public class BuscaBinaria {

	public static void main(String[] args) {
		String[]  V = {"a","aa","aaa","aaaa","aaaaa",
				"aaaaaa","aaaaaaa","aaaaaaaa","aaaaaaaaa"};

		binarySearch(V, "aaaaaa", 0, V.length);
		
	}
	public static void binarySearch(String[] V, String busca, int start, int end) {
		if (start>end) {
			System.out.println("Não existe a palavra procurada.");
		} else {
			int meio = (start+end)/2;
			if (V[meio].equalsIgnoreCase(busca)) {
				System.out.println("Palavra encontrada na posição " + meio + " do vetor.");
			} else if (V[meio].length()>busca.length()) {
				binarySearch(V,busca, start, meio-1);
			} else {
				binarySearch(V,busca, meio+1, end);
			}
			
		}
	}
	

}
