package teste;

import java.text.DecimalFormat;

public class Ativade01 {

	public static void main(String[] args) {
			
		int [] v = new int [3]; int cont= 1;
		int v2 []  = new int [3];
		
		DecimalFormat df = new DecimalFormat ("[00] ");
		
		int [][] x = new int [3] [3];
		int [][] y = { {1,2,3}, {4,5,6}, {7,8,9} };
		int [][] soma = new int [3] [3];
			
		x[0] [0]= 1;
		x[0] [1]= 2;
		x[0] [2]= 3;
		x[1] [0]= 4;
		x[1] [1]= 5;
		x[1] [2]= 6;
		x[2] [0]= 7;
		x[2] [1]= 8;
		x[2] [2]= 9;
			
		System.out.println("coluna 1:");
		
		for (int l=0; l<3; l++) {
			for (int c = 0; c < 3; c++){
				String valorFormatado = df.format(x [l] [c]);
				System.out.print(valorFormatado);
			}
			System.out.println();
		}
		
		System.out.println("coluna 2:");
		
		for (int l=0; l<3; l++) {
			for (int c = 0; c < 3; c++){
				String valorFormatado = df.format(y [l] [c]);
				System.out.print(valorFormatado);
			}
			System.out.println();
		}
		
		System.out.println("coluna da soma:");
		
		for (int l=0; l<3; l++) {
			for (int c = 0; c < 3; c++){
				soma [l] [c] = x [l] [c] + y [l] [c];
				String valorFormatado = df.format(soma [l] [c]);
				System.out.print(valorFormatado);
			}
			System.out.println();
		}
	}
}
