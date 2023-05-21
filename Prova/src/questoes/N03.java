package questoes;

import java.util.Scanner;

public class N03 {

	public static void main(String[] args) {
		
		int valor, n100=0, n50=0, n20=0, n10=0, n5=0, n2=0;
		
		System.out.println("Informe o valor:");
		Scanner leia = new Scanner(System.in);
		valor= leia.nextInt();
		if(valor>=2) {
			while(valor >=100) {
				valor= valor - 100;
				n100++;
			}
			if(valor>=50) {
				valor= valor - 50;
				n50++;
			}
			while(valor >=20) {
				valor= valor - 20;
				n20++;
			}
			if(valor>=10) {
				valor= valor - 10;
				n10++;
			}
			if(valor>=5) {
				valor= valor - 5;
				n5++;
			}
			while(valor >=2) {
				valor= valor - 2;
				n2++;
			}
		}
		System.out.println("Devem ser entregues");
		System.out.println(n100+ " notas de R$100,00");
		System.out.println(n50+ " notas de R$50,00");
		System.out.println(n20+ " notas de R$20,00");
		System.out.println(n10+ " notas de R$10,00");
		System.out.println(n5+ " notas de R$5,00");
		System.out.println(n2+ " notas de R$2,00");
		
		leia.close();
	}
	
}
