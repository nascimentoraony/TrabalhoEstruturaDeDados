package br.trabalhoEstrutura;

import java.util.Arrays;

public class Ordenacao {
	
	public static void sort(String [] A) {
		quickSort(A, 0, A.length - 1);
	}
	
	public static void quickSort(String A [], int begin, int end) {
		int i = begin; 
		int j = end; 
		String temp; 
		String pivot = A[(end + begin) / 2];
		
		while (i <= j) {
			while (A[i].length() < pivot.length() ) {
				i++;
			}
			
			while (A[i].length() > pivot.length()) {
				j--;
			}
			
			if (i <= j) {
				//moment of swap.
				temp = A[i];
				A[i] = A[j];
				A[j] = temp;
				
				i++;
				j--;
				
			}
		}
		if (begin < j) {
			quickSort(A, begin, j);
		}
		else if (i < end) {
			quickSort(A, i, end);
		}
		System.out.println(Arrays.toString(A));
		
	}
}