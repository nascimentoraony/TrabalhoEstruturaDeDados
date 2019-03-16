package br.trabalhoEstrutura;

public class SelectionSort {

	public static void main(String[] args) {
		
		String[]  A = {"aaa","aa","aaaa","a","aaaaaaa","aaaaa","aaaaaa"};
		int min = 0;
		String atual;
		
		for (int i = 0;i<A.length;i++) {
			min = i;
			atual = A[i];
			for (int j = i+1;j<A.length;j++) {
				if (A[min].length() > A[j].length()) {
					min = j; 
				}
			}
			A[i] = A[min];
			A[min] = atual;
		}
		
		for(int i = 0;i<A.length;i++) {
			System.out.println(A[i]);
		}

	}

}
