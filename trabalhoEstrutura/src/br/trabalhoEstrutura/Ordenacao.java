package br.trabalhoEstrutura;

import java.util.Arrays;

public class Ordenacao {

	
	public static void SelectionSort (String A []){
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
	
	public static void BubbleSort(String A []) {
		boolean val;
		do{
			val = false;
			for(int i = 0;i<(A.length-1);i++) {
				if(A[i].length()>A[i+1].length()) {
					String aux = A[i];
					int a = A[i].length(); 
					int b = A[i+1].length();
					A[i] = A[i+1];
					A[i+1] = aux;
					val = true;
				}
			}
		}while(val==true);
		
		System.out.println(Arrays.toString(A));
	}
	
	public static void MergeSort(String [] A) {

		String ord [] = new String[A.length-1];
				
		System.out.println(Arrays.toString(A));
		
		dividir(A,0,A.length-1);
		
		System.out.println(Arrays.toString(A));
				
	}
	
	public static void dividir(String[] V,int min, int max) {
		if(min<max) {
			int med = (min+max)/2;
			dividir(V, min, med);
			dividir(V, med+1,max);
			conquistar(V,min,med,max); 
		}
	}
	
	public static void conquistar(String[] V,int min, int med, int max) {
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
	
	public static void QuickSort(String A [], int begin, int end) {
		int i = begin; 
		int j = end;
		begin = 0;
		end = A.length - 1;
		String temp; 
		String pivot = A[begin];
		
		while (i <= j) {
			while (A[i].length() < pivot.length() ) {
				i++;
			}
			
			while (A[j].length() > pivot.length()) {
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
			QuickSort(A, begin, j);
		}
		else if (i < end) {
			QuickSort(A, i, end);
		}
		System.out.println(Arrays.toString(A));
		
	}
}