package br.teste;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class QuickSort {

		
	private static void quickSort (int[] A,int begin, int end){
		
		if (begin < end) {
			int positionPivot = separar(A, begin, end);;
			quickSort(A, begin, positionPivot - 1);
			quickSort(A, positionPivot + 1, end);
		}
	}
	
	
	private static int separar (int[] A, int begin, int end) {
		int pivot = A [begin];
		int i = begin + 1; 
		int e = end; 
		
		while (i <= e) {
			if (A [i] <= pivot) {
				i++;
			}
			else if (pivot < A[e]) {
				e--;
			}
			else {
				int change = A[i];
				A[i] = A [e];
				A[e] = change; 
				i++;
				e--;
				
			}
		}
		A[begin] = A[e];
		A[e] = pivot;
		return e;
	}

}
