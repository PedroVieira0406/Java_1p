package teste;

import java.text.DecimalFormat;

public class Teste {
		
	public static void main(String[] args) {
			
		//vetores
		int [] v = new int [3]; int cont= 1;
		int v2 []  = new int [3];
		
		//formato decimal
		DecimalFormat df = new DecimalFormat ("[00] ");
		
		//matrix
		int [][] m = new int [3] [3];
			
		//inicializando uma marix
		m[0] [0]= 1;
		m[0] [1]= 2;
		m[0] [2]= 3;
		m[1] [0]= 4;
		m[1] [1]= 5;
		m[1] [2]= 6;
		m[2] [0]= 7;
		m[2] [1]= 8;
		m[2] [2]= 9;
			
		//tamanho da linha
		System.out.println(m.length);
			
		//tamanho da coluna
		System.out.println(m[0].length);
			
		//imprimindo uma matriz
			
		for (int l=0; l<3; l++) {
			for (int c = 0; c < 3; c++){
				//forma sem o método decimal:
				//System.out.print("[" + m[l][c] + "] ");
				
				//forma com o método decimal:
				String valorFormatado = df.format(m [l] [c]);
				System.out.print(valorFormatado);
			}
			System.out.println();
		}		
	}
}
