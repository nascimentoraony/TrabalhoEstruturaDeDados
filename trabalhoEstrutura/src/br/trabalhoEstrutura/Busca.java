package br.trabalhoEstrutura;

import javax.swing.JOptionPane;

public class Busca {
	
	public static void buscaSequencial(String V [], String search) {
        int i;
        int busca = 0;
        for(i = 0; i<10; i++)
        {
            if (search.equals(V[i]))
            {
                busca = 1;
                break;
            }
        }
        if (busca == 1)
        {
        	JOptionPane.showMessageDialog(null, " [ " + search + " ], palavra encontrada na " + (i+1) + " posição !");
        }
        else
        {
            System.out.println("Palavra não encontrada !");
        }
}

	public static void binarySearch(String[] V, String busca, int start, int end) {
		if (start>end) {
			JOptionPane.showMessageDialog(null, "Não existe a palavra procurada.");
			
		} else {
			int meio = (start+end)/2;
			if (V[meio].equalsIgnoreCase(busca)) {
				
				JOptionPane.showMessageDialog(null, "Palavra encontrada na posição \" + meio + \" do vetor.");
				
			} else if (V[meio].length()>busca.length()) {
				binarySearch(V,busca, start, meio-1);
			} else {
				binarySearch(V,busca, meio+1, end);
			}
			
		}
	}
	
}
