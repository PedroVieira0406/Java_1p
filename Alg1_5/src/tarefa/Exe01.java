package tarefa;

import java.util.Scanner;

import dados.Tela;

public class Exe01 {

	public static void main(String[] args) {
		Tela[] info = new Tela [5];
		
		
		for(int i =0; i<info.length; i++) {
			
			info[i]= Exe01.lerDados();
		}
		
	Exe01.imprimir(info);
    }
	public static Tela lerDados(){
		
		Tela tela= new Tela();
		
        Scanner escreva = new Scanner(System.in);
        
        System.out.print("O monitor eh novo? (true/false): ");
        tela.ehNovo = escreva.nextBoolean();
        
        System.out.print("Digite a cor do monitor: ");
        tela.cor = escreva.nextLine();
        escreva.nextLine();
        
        System.out.print("Digite a taxa maxima de hz do monitor: ");
        tela.hz = escreva.nextInt();
        escreva.nextLine(); 
        
        System.out.print("Qual o comprimento da tela em cm?: ");
        tela.comprimento = escreva.nextFloat();
        escreva.nextLine();
        
        System.out.print("Qual a largura da tela em cm?: ");
        tela.largura = escreva.nextFloat();
    
        return tela;
}
	
	public static void imprimir(Tela[] impr) {
		
		for (int i=0; i < impr.length; i++) {
		
			System.out.println("Eh novo: " + impr[i].ehNovo);
			System.out.println("Eh da cor: " + impr[i].cor);
			System.out.println("A taxa de hz eh: " + impr[i].hz);
			System.out.println("O comprimento eh: " + impr[i].comprimento);
			System.out.println("A largura eh: " + impr[i].largura);
		}
	}
}