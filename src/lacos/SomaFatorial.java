package lacos;

//Programa que lê 15 valores numéricos reais e apresente  no final
//o somatorio do fatorial e a media de cada valor lido


public class SomaFatorial {
public static void main(String[] args) {
	SomaFatorial.calculo();
}
public static void calculo() {
	float soma=0,media=0;
	
	for(int i=1;i<15;i++) {
		float n=i;
		float fat=n;
		
		
		while(n>1) {
			fat*=(n-1);
			n--;
		}
		System.out.println(" -> "+i+"!="+fat);
		
		
		soma+=fat;
		media=soma/i;
	}
	System.out.println("Soma: "+soma+"\nMedia: "+media);
}



}
