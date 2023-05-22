package teste;

public class Exemplo01 {
//utilização de métodos no Java
	
	public static void main(String[] args) {
		Integer valor1 = Exemplo01.somar(10, 20);
		Integer valor2 = Exemplo01.somar(30, 20);
		Integer valor3 = Exemplo01.somar(16, 23);
		Integer valor4 = Exemplo01.somar(15, 56);
		Integer valor5 = Exemplo01.somar(1, 99);
		Integer valor6 = Exemplo01.somar(13, 7);
		
		
		Exemplo01.imprimir(valor1);
		Exemplo01.imprimir(valor2);
		Exemplo01.imprimir(valor3);
		Exemplo01.imprimir(valor4);
		Exemplo01.imprimir(valor5);
		Exemplo01.imprimir(valor6);
		
	}
	
	public static Integer somar (Integer valor1, Integer valor2) {
		
		Integer soma = valor1 + valor2;
		
		return soma;
	}
	
	public static Integer somar (Integer valor1, Integer valor2, Integer valor3) {
		
		Integer soma = valor1 + valor2 + valor3;
		
		return soma;
	}
	
	public static void imprimir (Integer valor) {
		System.out.println(valor);
		
	}
}
