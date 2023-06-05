package questoes;

import java.util.Scanner;

import dados.Tela;

public class Exe02 {

	public static void main(String[] args) {
		Tela[] [] info = new Tela [3] [3];
		
		
		for(int i =0; i<info.length; i++) {
			for(int j = 0; j<info[0].length;j++)
			
			info[i] [j]= Exe02.lerDados();
		}
		Exe02.imprimir(info);
    }
	public static Tela lerDados(){
		
		Tela tela= new Tela();
		
        Scanner escreva = new Scanner(System.in);
        
        System.out.println("O monitor eh novo? (true/false): ");
        tela.ehNovo = escreva.nextBoolean();
        
        System.out.println("Digite a cor do monitor: ");
        tela.cor = escreva.next();
        
        System.out.println("Digite a taxa maxima de hz do monitor: ");
        tela.hz = escreva.nextInt();
        
        System.out.println("Qual o comprimento da tela em cm?: ");
        tela.comprimento = escreva.nextFloat();
        
        System.out.println("Qual a largura da tela em cm?: ");
        tela.largura = escreva.nextFloat();

        System.out.println("---------------------------");
        return tela;
}
	
	public static void imprimir(Tela[] [] impr) {
		
		for (int i=0; i < impr.length; i++) {
			for(int j = 0; j<impr[i].length;j++) {
				System.out.println("Eh novo: " + impr[i][j].ehNovo);
				System.out.println("Eh da cor: " + impr[i][j].cor);
				System.out.println("A taxa de hz eh: " + impr[i][j].hz);
				System.out.println("O comprimento eh: " + impr[i][j].comprimento);
				System.out.println("A largura eh: " + impr[i][j].largura);
				System.out.println("---------------------------");
			}
		}
	}
}
