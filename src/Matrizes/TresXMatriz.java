package Matrizes;

import java.util.Scanner;

public class TresXMatriz {

public static void main(String[] args) {
TresXMatriz.calculoMatriz();	
}
public static void calculoMatriz() {
	Scanner entrada=new Scanner(System.in);	
	int[] A=new int[8];
for(int i=0;i<8;i++) {
	System.out.println("Digite um numero");
	A[i]=entrada.nextInt();
}
	int[] B=new int[8];
for(int i=0;i<8;i++) {
	B[i]=A[i]*3;
	System.out.println("A= " +A[i]+ " = B= "+B[i]);
}
}
}
