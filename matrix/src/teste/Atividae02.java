package teste;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Atividae02 {
	
	public static void main(String[] args) {

	Scanner read= new Scanner(System.in);
	
	int [][] x = new int [2] [3];
	
	DecimalFormat df = new DecimalFormat ("[000] ");
	
	for (int l=0; l<x.length; l++) {
		for (int c = 0; c < 2; c++){
			System.out.println("Digite um numero:");
			x[l][c]= read.nextInt();
			
		}
		System.out.println();
		
	}

	//o length seria o tamanho da linha
	for (int l=0; l< x.length; l++) {
		
		//usar x[l].length seria o tamanho da colua
		for (int c = 0; c < 2; c++){
			
			String valorFormatado = df.format(x [l] [c]);
			System.out.print(valorFormatado);
			
			}
		x[l][2]= x[l][0]* x[l][1];
		
		String valorFormatado = df.format(x[l][2]);
		System.out.print(valorFormatado);
		System.out.println();
		}
	read.close();
	}
}
