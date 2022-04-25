package lacos;


//Este programa  ler quinze valores numéricos inteiros
//e no final apresenta  o somatório da fatorial de cada valor lido.  

public class Fatorial {
public static void main(String[] args) {
	Fatorial.fatorial();
}
 public static void fatorial() {
	 int soma=0,media=0;
	 
	 for(int i=1;i<=15;i++) {
		 int n=i;
		 int fat=n;
		 
		 while(n>1) {
			 fat*=(n-1);
			 n--;
		 }
		 System.out.println("-> " +i+ "!= "+fat);
		 
		 
		 soma+=fat;
		 media=soma/i;
	 }
	 System.out.println("Soma: "+soma);
	 System.out.println("Média: "+media);
 }

	
}
