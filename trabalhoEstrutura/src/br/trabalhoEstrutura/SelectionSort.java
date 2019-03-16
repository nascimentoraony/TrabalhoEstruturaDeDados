package br.trabalhoEstrutura;

public class SelectionSort {

	public static void main(String[] args) {
		
		String[]  A = {"a","aaaaaaaaaaaaaa","aaaaaaaaaaaa","aaaaaaaaaaaaaaaaa","aaaaaaaaaaaaaaaaaaaaaaaaaaa",
				"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa","aaaaaaaaa","aaaa","aaa"};
		int min = 0;
		String atual;
		
		for (int i = 0;i<A.length;i++) {
			for (int j = i+1;j<A.length-1;j++) {
				if (A[i].length() > A[j].length()) {
					min = j; 
				}
			}
			atual = A[i];
			A[i] = A[min];
			A[min] = atual;
		}
		
		for(int i = 0;i<A.length;i++) {
			System.out.println(A[i]);
		}

	}

}
