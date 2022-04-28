package lacos;
//Program that reads positive values until the 
//user enters a value less than or equal to zero.


import java.util.Scanner;

public class NegativeStop {
public static void main(String[] args) {
	

	NegativeStop.cal();
}

public static void cal() {
	double soma=0,total=0, media=0,v=0;
	Scanner entrada=new Scanner(System.in);
	do {
		System.out.println("Digite um valor");
		v=entrada.nextDouble();
		soma+=v;
		total++;
	}while(v>0);
	media=soma/(total-1);
	System.out.println(
			"Soma: "+soma+
			"\nMedia: "+media+
			"\nTotal de valores válidos: "+(total-1));
	entrada.close();
	
	}	
}
