package br.trabalhoEstrutura;

import java.util.Arrays;

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
//					int a = V[i].length(); 
//					int b = V[i+1].length();
					V[i] = V[i+1];
					V[i+1] = aux;
					val = true;
				}
			}
		}while(val==true);
		return V;
	}
	
	public static String[] mergeSort(String[] V,int min, int max) {
		if(min<max) {
			int med = (min+max)/2;
			mergeSort(V, min, med);
			mergeSort(V, med+1,max);
			conquistar(V,min,med,max); 
		}
		return V;
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
	
	public static String[] QuickSort(String V [], int begin, int end) {
		int i = begin; 
		int j = end;
		begin = 0;
		end = V.length - 1;
		String temp; 
		String pivot = V[begin];
		while (i <= j) {
			while (V[i].length() < pivot.length() ) {
				i++;
			}
			while (V[j].length() > pivot.length()) {
				j--;
			}
			if (i <= j) {
				//moment of swap.
				temp = V[i];
				V[i] = V[j];
				V[j] = temp;
				i++;
				j--;
			}
		}
		if (begin < j) {QuickSort(V, begin, j);}
		else if (i < end) {QuickSort(V, i, end);}
		//System.out.println(Arrays.toString(V));
		//Precisa Validar esse retorno.
		return V;	
	}
}