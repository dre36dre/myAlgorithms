package Matrizes;


import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		Matriz.Nome();
}

public static void Nome() {
	Scanner entrada=new Scanner(System.in);
	String[] A=new String[10];
	int i=0;
	for( i=0;i< 10;i++) {
		System.out.println("Digite um nome");
		
		A[i]=entrada.nextLine();
	}
	for(i=0;i<10;i++) {
	System.out.println("Nome: "+A[i]);

	}
	}



}
