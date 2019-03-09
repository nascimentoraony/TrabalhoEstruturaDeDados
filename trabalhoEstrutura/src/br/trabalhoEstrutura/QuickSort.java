package br.trabalhoEstrutura;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int dicionario = 10;
		int[] A = new int[dicionario];
		
		for (int i = 0; i < A.length; i++) {
			A[i] = (int) (Math.random() * dicionario);
		}
				
		JOptionPane.showMessageDialog(null, "----- VETOR -----");
		JOptionPane.showMessageDialog(null, (Arrays.toString(A)));
		
		System.out.println("---------- Vetor ----------");
		System.out.println();
		System.out.println(Arrays.toString(A));
		System.out.println();

		long tempoInicial = System.currentTimeMillis();
		
		System.out.println("------ Vetor Ordenado ------");
		System.out.println();
		
			quickSort (A, 0, A.length - 1);
		
		System.out.println(Arrays.toString(A));
		System.out.println();
		
		long tempoFinal = System.currentTimeMillis();
		
		System.out.println("Executado em: " + (tempoFinal - tempoInicial) + "ms");
		
	}
	
	private static void quickSort (int[] A, int begin, int end) {
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
