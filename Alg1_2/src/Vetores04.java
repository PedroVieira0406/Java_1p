
public class Vetores04{

	public static void main(String[] args) {
		
		int[] vetor= {1,3,3,5,7,7,9};
		Integer[] novo= new Integer [vetor.length];
		boolean existe = false;
		int posicao= 0;
		
		for(int i=0; i < vetor.length; i++){ 
			
			existe = false;
			
			for(int j=0; j< novo.length; j++){
				
					if (novo[j] != null) {
					
						if(vetor[i] == novo[j])
							existe = true;
					}
				}
			
				if(existe == false) {
					novo [posicao] = vetor[i];
					posicao++;
					System.out.println(vetor[i]);
			}
		}
	}
}
