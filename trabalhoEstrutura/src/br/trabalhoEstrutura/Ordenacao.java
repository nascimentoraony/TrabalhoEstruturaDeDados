package br.trabalhoEstrutura;

public class Ordenacao {

	
	public static String[] SelectionSort (String V []){
		int min = 0;
		String atual; 
		for (int i = 0;i<V.length;i++) {
			min = i;
			atual = V[i];
			for (int j = i+1;j<V.length;j++) {
				if (V[min].length() > V[j].length()) {min = j;}
			}
			V[i] = V[min];
			V[min] = atual;
		}
		return V;
	}
	
	public static String[] BubbleSort(String V []) {
		boolean val;
		do{
			val = false;
			for(int i = 0;i<(V.length-1);i++) {
				if(V[i].length()>V[i+1].length()) {
					String aux = V[i];
					V[i] = V[i+1];
					V[i+1] = aux;
					val = true;
				}
			}
		}while(val==true);
		return V;
	}
	
	public static String[] insertionSort(String V[]) {
		int j;
	    String key;
	    int i;
	    
	    for (j = 1; j < V.length; j++)
	    {
	      key = V[j];
	      for (i = j - 1; (i >= 0) && (V[i].length() > key.length()); i--)
	      {
	         V[i + 1] = V[i];
	       }
	        V[i + 1] = key;
	    }
		return V;
	}
	
	public static String[] mergeSort(String[] V,int min, int max) {
		if(min<max) {
			int med = (min+max)/2;
			mergeSort(V, min, med);
			mergeSort(V, med+1,max);
			merge(V,min,med,max); 
		}
		return V;
	}
	
	public static void merge(String[] V,int min, int med, int max) {
		String aux[] = new String[V.length];
		for(int i=min;i<=max;i++) {
			aux[i] = V[i];
		}
		int i = min;
		int j = med+1;
		int k = min;
		while(i<=med && j<=max) {
			if(aux[i].length()<=aux[j].length()) {
				V[k] = aux[i];
				i++;
			} else {
				V[k] = aux[j];
				j++;
			}
			k++;
		}
		while(i<=med) {
			V[k] = aux[i];
			k++;
			i++;
		}
	}
	
	public static String[] QuickSort(String V [], int ini, int end) {

		return V;	
	}
	
	private static int separar(int[] A, int begin, int end) {
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