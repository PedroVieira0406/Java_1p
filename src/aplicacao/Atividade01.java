package aplicacao;

//import java.util.Scanner;
//caso queria importar de outro pacote se usa:
//import (nome do pacote).(nome da classe)

public class Atividade01 {

		public static void main(String[] args) {
			
			//Integer valor = 10;
			//Integer [] vetor= new Integer[10];
			//Integer [] [] matriz = new Integer [3] [3] ;
			//Integer x;
			Aluno [] vetAluno = new Aluno [3];
			
			vetAluno[0] = new Aluno();
			vetAluno[0].nome = "Roberto";
			vetAluno[0].idade = 17;
			
			vetAluno[1] = new Aluno();
			vetAluno[1].nome = "José";
			vetAluno[1].idade = 42;
			
			vetAluno[2] = new Aluno();
			vetAluno[2].nome = "Carla";
			vetAluno[2].idade = 26;
			
			System.out.println("impimindo todos os alunos.");
			for (int i = 0; i <vetAluno.length; i++) {
				System.out.println("Nome: " + vetAluno[i].nome);
				System.out.println("idade: " + vetAluno[i].idade);
			}
			System.out.println("impimindo todos os alunos na maioridade.");
			for (int i = 0; i <vetAluno.length; i++){
				if(vetAluno[i].idade >= 18) {
					System.out.println("Nome: " + vetAluno[i].nome);
					System.out.println("idade: " + vetAluno[i].idade);
				}
			}
		}
}
