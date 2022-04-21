package lacos;

public class Temperatura {
public static void main(String[] args) {
Temperatura.calculo();	
}
// Conversão de Celcius para Farenheit de dez em dez até 100


public static void calculo() {
	System.out.println("De graus celcius para Farenheit\n");
	
	for(float i=10;i<=100 ;i+=10) {
	System.out.println(i+"ºC em Farenheit:  "+ (i*1.8)+32 +" ºF");
	}
	
	System.out.println("==============================\n");
	
	System.out.println("De Farenheit para Celcius\n");
	
	for (float j=10;j<=100 ; j+=10) {
		System.out.println(j+"ºF em Celcius:  "+(j-32)*5/9 +" ºC");
	}
}
}
