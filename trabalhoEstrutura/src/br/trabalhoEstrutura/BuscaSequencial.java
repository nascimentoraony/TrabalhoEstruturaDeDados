package br.trabalhoEstrutura;

import javax.swing.JOptionPane;

public class BuscaSequencial {
		
	// favor testarem
	
	public static void buscaSequencial(String A [], String search) {
	        int i;
	        int busca = 0;
	        for(i = 0; i<10; i++)
	        {
	            if (search.equals(A[i]))
	            {
	                busca = 1;
	                break;
	            }

	        }
	        if (busca == 1)
	        {
	        	JOptionPane.showMessageDialog(null, " [ " + search + " ], palavra encontrada na " + (i+1) + " posição !");
	            System.out.println(" [ " + search + " ], palavra encontrada na " + (i+1) + " posição !");
	        }
	        else
	        {
	        	JOptionPane.showMessageDialog(null, "Palavra não encontrada !");
	            System.out.println("Palavra não encontrada !");
	        }
	}
	
}
