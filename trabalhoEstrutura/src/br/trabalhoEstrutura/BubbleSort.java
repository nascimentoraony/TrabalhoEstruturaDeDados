package br.trabalhoEstrutura;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		String[]  V = {"a","aaaaa","aaaaaaaa","aaaaaa","aaaaaaaaa",
				"aa","aaaaaaa","aaaa","aaa"};
		boolean val;
		do{
			val = false;
			for(int i = 0;i<(V.length-1);i++) {
				if(V[i].length()>V[i+1].length()) {
					String aux = V[i];
					int a = V[i].length(); 
					int b = V[i+1].length();
					V[i] = V[i+1];
					V[i+1] = aux;
					val = true;
				}
			}
		}while(val==true);
		
		System.out.println(Arrays.toString(V));
		
		
	}

}
