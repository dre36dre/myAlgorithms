package lacos;

public class Temperatura {
public static void main(String[] args) {
Temperatura.calculo();	
}
// Convers�o de Celcius para Farenheit de dez em dez at� 100


public static void calculo() {
	System.out.println("De graus celcius para Farenheit\n");
	
	for(float i=10;i<=100 ;i+=10) {
	System.out.println(i+"�C em Farenheit:  "+ (i*1.8)+32 +" �F");
	}
	
	System.out.println("==============================\n");
	
	System.out.println("De Farenheit para Celcius\n");
	
	for (float j=10;j<=100 ; j+=10) {
		System.out.println(j+"�F em Celcius:  "+(j-32)*5/9 +" �C");
	}
}
}
