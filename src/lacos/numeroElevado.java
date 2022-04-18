package lacos;


//Elaborar um programa que apresente os resultados das potências 
//do valor de base 3 elevado a um expoente que varie do valor 0 a 15.
// Resultado esperado: 1,3,9,27,... 14.348.907




public class numeroElevado {
	public static void main(String[] args) {
double numero=2;
double expoente=3;
double res= calculo(numero,expoente);
System.out.println(numero+"^"+expoente+"="+res);
}
	
	
	
		static double calculo(double num, double exp) {
			return Math.pow(num, exp);

	
	}
	
}
