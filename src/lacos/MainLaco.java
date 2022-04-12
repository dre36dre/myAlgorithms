package lacos;

import java.util.Scanner;

public class MainLaco {
public static void main(String[] args) {
	
	Laco fat=new Laco();
	Scanner entrada=new Scanner(System.in);
	System.out.println("Digite um numero:");
	int n=entrada.nextInt();
	System.out.println(n+"!= "+fat.fatorial(n));
	
}
}
