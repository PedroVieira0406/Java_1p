package teste;

public class Exemplo02 {
	
	public static void main(String[] args) {
		
		Integer [] vetor = {1,2,3,4,5,6};
		//pode se mandar criando os vetores
		Integer valor1= Exemplo02.somar(vetor);
		Exemplo02.imprimir(valor1);
	
		//pode se mandar sem criar os vetores e colocar uma função dentro da outra
		Exemplo02.imprimir(Exemplo02.somar(1,2,3,4,5,6,7,8,9,10));
	}
	//os "..." fazem o mesmo que a "[]"
	public static Integer somar (Integer ... valores) {
		Integer soma = 0;
		
		for(int i = 0; i < valores.length; i++) {
			soma += valores[i];
		}
	return soma;
	}
	public static void imprimir (Integer valor) {
		System.out.println(valor);
	}
}

