package br.trabalhoEstrutura;

import javax.swing.JOptionPane;

public class Busca {
	
	public static void buscaSequencial(String V [], String search) {
        int i;
        int busca = 0;
        for(i = 0; i < V.length; i++)
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
        	JOptionPane.showMessageDialog(null, "Palavra não encontrada !");
        }
}

	public static void binarySearch(String[] V, String busca, int start, int end) {
		if (start>end) {
			JOptionPane.showMessageDialog(null, "Não existe a palavra procurada.");
			
		} else {   
			int meio = (start+end)/2; 
			if (V[meio].length()==busca.length()) {
				if (V[meio].equalsIgnoreCase(busca)) {
					JOptionPane.showMessageDialog(null, "Palavra encontrada na posição " + meio + " do vetor.");
				} else {  
					int i = meio;
					boolean found = false;
					do{
						i++;
						if(V[i].equalsIgnoreCase(busca)) {
							JOptionPane.showMessageDialog(null, "Palavra encontrada na posição " + i+1 + " do vetor.");
							found = true;
						}
						
					}while(V[i].length()==busca.length()||found!=true);
					i = meio;
					do{
						i--;
						if(V[i].equalsIgnoreCase(busca)) {
							JOptionPane.showMessageDialog(null, "Palavra encontrada na posição " + i+1 + " do vetor.");
							found = true;
						}
					}while(V[i].length()==busca.length()||found!=true);
					if(found==false) {
						JOptionPane.showMessageDialog(null, "Palavra NÃO encontrada.");
					}
				}
				
				
				
			} else if (V[meio].length()>busca.length()) {
				binarySearch(V,busca, start, meio-1);
			} else {
				binarySearch(V,busca, meio+1, end);
			}
			
		}
	}
	
}
