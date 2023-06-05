package questoes;

import java.util.Scanner;

import dados.Aluno;

public class Exe04 {

	public static void main(String[] args) {	

		Aluno[] alunos = new Aluno [10];
		
		for(int i=0; i<alunos.length; i++) {
			alunos[i]= Exe04.lerDados();
		}
		
		for (int i = 0; i < alunos.length; i++) {
                Exe04.imprimir(alunos[i]);
            }
		
		float mediaGeral= Exe04.mediageral(alunos);
		System.out.println("A média da turma é: "+ mediaGeral);
	}

	public static Aluno lerDados(){
		
		Scanner leia = new Scanner(System.in);
		Aluno alunos = new Aluno();
		
		System.out.println("Nome do aluno:");
		alunos.nome = leia.next();
		
		System.out.println("Nome da materia:");
		alunos.materia = leia.next();
		
		System.out.println("Nota 01:");
		alunos.nota01= leia.nextFloat();
		
		System.out.println("Nota 02:");
		alunos.nota02= leia.nextFloat();
		
		System.out.println("---------------------------");
		
		alunos.media=Exe04.media(alunos);
		alunos.aprovado= Exe04.aprovado(alunos);
		
		return alunos;
	}
 	public static float media(Aluno aluno) {
	
		return  (float) ((aluno.nota01 + aluno.nota02)/2);
	}
	public static String aprovado(Aluno aluno) {
		float media = media(aluno);
		if( media >=6) {
			return "Aprovado";
		}
		else {
			return "Reprovado";
		}
	}
	public static void imprimir(Aluno aluno) {
			
	System.out.println("Nome: " + aluno.nome);
        System.out.println("Disciplina: " + aluno.materia);
        System.out.println("Nota A1: " + aluno.nota01);
        System.out.println("Nota A2: " + aluno.nota02);
        System.out.println("Média: " + aluno.media);
        System.out.println("Situação: " + aluno.aprovado);
        System.out.println("---------------------------");
	}
	
	public static float mediageral (Aluno [] aluno ) {
		int soma = 0;
		
		for (int i=0; i < aluno.length; i++) {
			
			soma+=aluno[i].media;
		}
		
		float mediaGeral = soma/aluno.length;
  
		return mediaGeral;
	}
}
