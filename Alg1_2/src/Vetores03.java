
public class Vetores03 {

	public static  void main(String[] args) {
		
		int[] vetor= new int [10]; int soma =0;
		
		vetor[0]= 10;
		vetor[1]= 15;
		vetor[2]= 20;
		
		System.out.println(vetor.length);

		for(int i=0; i < vetor.length; i++){ 
			
			soma+= vetor[i];
		}
		System.out.println("A soma é:"+ soma);
	}
}
