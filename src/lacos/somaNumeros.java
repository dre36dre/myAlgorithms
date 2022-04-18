package lacos;

public class somaNumeros {

	public static void main(String[] args) {
		int numero=0, numeroImpar=0;
		int divisivelPor4=0, soma=0,somatorio=0;
		
		//		for(int i=0;i<=100;i++) {
//			soma+=numero;
//			numero+=1;
//		}
//		System.out.println("Soma entre 1 a 100: "+soma);
//
//
//
//		// método que soma de 1 a 100
//		do {
//			soma+=numero;
//			numero+=1;
//		}while(numero <=100);
//
//		System.out.println("A soma dos inteiros de 1 a 99: "+soma);
//
//		while(numero <=100) {
//			soma+=numero;
//			numero+=1;
//
//		}
//		System.out.println("A soma dos inteiros de 1 a 100: "+soma);
//
//		//somatório dos numeros pares de 1 a 500
//		for(int i=1;i<=500;i++) {
//
//			if(i % 2==0) {
//				somatorio+=i;
//			}
//		}
//		System.out.print("Somatório: " +somatorio);
//
//		//impares 1 a 20
//		for(int i=1;i<20;i++) {
//			if(i % 2 != 0) {
//				numeroImpar+=i;
//			}
//		}
//		System.out.println("Numero impar: "+ numeroImpar); 

		//Numericos diviveis por 4 e menores que 200
		int i=0;
	while(i < 8) {
		divisivelPor4=i % 4;
		if(divisivelPor4==0) {
			System.out.println(i);
			i=i+1;
		}
		System.out.println(divisivelPor4);
	}
		
		
		
		

	



	}//Fim main


}//Fim classe
