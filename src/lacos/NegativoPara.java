package lacos;

//Programa que l� sucessivamente valores 
//num�ricos e apresente no final o somat�rio
//e a m�dia dos valores lidos
import java.util.Scanner;

public class NegativoPara {
public static void main(String[] args) {
	

	NegativoPara.calculo();	
	
}

public static void calculo() {
	double soma=0,total=0, media=0, valor=0;
	Scanner entrada=new Scanner(System.in);
		
	do {
		System.out.print("Digite um valor: ");
	valor=entrada.nextInt();
	soma+=valor;
	total++;

	}while(valor>0); 
media=soma/(total-1);
	System.out.println(
			"\nSoma: "+soma+
			"\nTotal de valores: "+ --total+
			"\nM�dia: "+media);
		
}

}