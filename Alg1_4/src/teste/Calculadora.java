package teste;

import java.util.Scanner;

public class Calculadora {
	
	public static void main(String[] args) {
		
		Scanner leia= new Scanner(System.in);
		Float valor1, valor2;
		Integer operacao;
		
		
		System.out.println("Digite o primeiro valor:");
		valor1= (float) leia.nextInt();
		
		System.out.println("Lembrete--> (1)= (soma), (2)= (subtração), (3)= (multiplicação), (4)= (divisão),(5)= (exponecial),(6)= (finalizar processo)");
		System.out.println("Digite o tipo de operação: ");
		operacao= leia.nextInt();
		
		while(operacao<7) {
			
			if (operacao ==6) {
				System.out.println("operação finalizada");
				break;
			}
			System.out.println("Digite o segundo valor:");
			valor2= (float) leia.nextInt();
		
			if(operacao ==1) {
				valor1=Calculadora.soma(valor1, valor2);
				Calculadora.imprimir(valor1);
			}
			
			else if (operacao ==2) {
				valor1=Calculadora.sub(valor1, valor2);
				Calculadora.imprimir(valor1);
			}
			
			else if (operacao ==3) {
				valor1=Calculadora.mult(valor1, valor2);
				Calculadora.imprimir(valor1);
			}
			
			else if (operacao ==4) {
				valor1=Calculadora.divi(valor1, valor2);
				Calculadora.imprimir(valor1);
			}
			
			else if (operacao ==5) {
				valor1=Calculadora.exp(valor1, valor2);
				Calculadora.imprimir(valor1);
				
			}
			
		System.out.println("Digite o tipo de operação: ");
		operacao= leia.nextInt();
		
		}
		if(operacao>=7) {
			System.out.println("ERROR");
		}
		leia.close();
	}
	
	public static Float soma(Float num1,Float num2 ) {
		Float soma = num1 + num2;
	return soma;
	}
	
	public static Float sub(Float num1, Float num2 ) {
		Float sub = num1 - num2;
	return sub;
	}
	
	public static Float mult(Float num1, Float num2 ) {
		Float mult = num1 * num2;
	return mult;
	}
	
	public static Float divi(Float num1, Float num2 ) {

		Float divi = num1 / num2;
		
	return divi;
	}
	
	public static Float exp	(Float base, Float expoente ) {
		
		for(int i=1; i<expoente; i++ ) {
			base*=base;
		}
	
		return base;
	}
	
	public static void imprimir (Float valor) {
		System.out.println(valor);
	}
}