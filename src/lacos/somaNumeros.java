package lacos;

public class somaNumeros {
 
	public static void main(String[] args) {
	int numero=0;
		int soma=0;
		
		for(int i=0;i<=100;i++) {
			soma+=numero;
			numero+=1;
		}
		System.out.println("Soma entre 1 a 100: "+soma);
		
		do {
			soma+=numero;
			numero+=1;
		}while(numero <=100);
		
		System.out.println("A soma dos inteiros de 1 a 99: "+soma);
		
		while(numero <=100) {
			soma+=numero;
			numero+=1;
						
		}
		System.out.println("A soma dos inteiros de 1 a 100: "+soma);
		
		
		
	}
	
	
}
