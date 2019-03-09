package br.trabalhoEstrutura;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int dicionario = 10;
		int[] A = new int[dicionario];
		
		for (int i = 0; i < A.length; i++) {
			A[i] = (int) (Math.random() * dicionario);
		}
		
		long tempoInicial = System.currentTimeMillis();
		
		quickSort (A, 0, A.length - 1);
		
		long tempoFinal = System.currentTimeMillis();
		
		System.out.println("<<<<< Vetor >>>>>");

		for(int i = 0; i < A.length; i++) {
			System.out.print("[" + A[i] + "]");
			System.out.println();
		}
		
		System.out.println("<<<<< Vetor Ordenado >>>>");

		for(int i = 0; i < A.length; i++) {
			// ainda precisa puxar o vetor ordenado !
			System.out.println();
		}
		
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
