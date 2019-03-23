package br.teste;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		String[]  V = {"a","aaaaa","aaaaaaaa","aaaaaa","aaaaaaaaa",
				"aa","aaaaaaa","aaaa","aaa"};
		
		String ord[] = new String[V.length-1];
				
		System.out.println(Arrays.toString(V));
		
		dividir(V,0,V.length-1);
		
		System.out.println(Arrays.toString(V));
				
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

}
