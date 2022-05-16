package Matrizes;

import java.util.Scanner;

public class MatrizAoQuadrado {
public static void main(String[] args) {
	

	MatrizAoQuadrado.calculo();
}

public static void calculo() {
	Scanner entrada=new Scanner(System.in);
	double[] A=new double[5];
	double[] B=new double[5];
	for(int i=0;i<A.length-1;i++) {
	System.out.println("Digite elementos de A");
		A[i]=entrada.nextInt();
		
	}
	
	
	for(int i=0;i<A.length-1;i++) {
		System.out.println("A="+A[i]);
	
		B[i]=Math.sqrt(A[i]);
	System.out.printf("A="+A[i]+"B= "+B[i]);
	}
}
}
