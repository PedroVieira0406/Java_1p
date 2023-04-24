
public class Vetores02 {

	public static void main(String[] args) {
		
		Integer [] vetor= new Integer [11];
		
//   	int salva o valor "0" nos espaços vazios; Integer salva o valor "nulo" nos espaços vazios; 0 != 1
		
		vetor[0]= 10;
		vetor[1]= 15;
		vetor[2]= 20;
		
		System.out.println(vetor.length);

// 		legth indíca o número da quantidade de vetores 
		
		for (int i = 0; i < vetor.length; i++){
			
			System.out.println(i + " ->" + vetor[i]);
		}
	}
}
