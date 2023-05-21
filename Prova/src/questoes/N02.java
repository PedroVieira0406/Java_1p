package questoes;

import java.util.Scanner;

public class N02{
	
	public static void main(String[] args) {
		
		int numero, n1 = 0, n2 = 1;
		
		System.out.println("Informe um numero:");
		Scanner leia = new Scanner(System.in);
		numero= leia.nextInt();
			
		System.out.println("Quantidade: " + numero);
		
		if(numero >= 1){			
			System.out.print("Fibonacci: " + n1 + ", ");
			
			if(numero >= 2){				
				System.out.print(n2);
				
				if(numero>=3){
					for(int i = 3 ; i <= numero ; i++){
						
						n1= n1 + n2;
						System.out.print(", " + n1);
						i++;
						
						if(i <= numero) {
							n2=n1 +n2;
							System.out.print(", " + n2);
						}
					}	
				}
			}
		}
		System.out.print(".");
		leia.close();
	}
	
}