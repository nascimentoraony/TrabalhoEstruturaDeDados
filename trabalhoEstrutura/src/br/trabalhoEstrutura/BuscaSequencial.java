package br.trabalhoEstrutura;

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
	            System.out.println(search + ", palavra encontrada na " + (i+1) + " posição!" );
	        }
	        else
	        {
	            System.out.println("Palavra não encontrada !");
	        }
	}
	
}
