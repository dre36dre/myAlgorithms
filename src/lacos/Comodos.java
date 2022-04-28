package lacos;

import java.util.Scanner;

public class Comodos {

	public static void main(String[] args) {
Comodos.calculo();
	}
	
	public static void calculo() {
		Scanner entrada=new Scanner(System.in);
		int comp=0, larg=0, area=0,areaTotal=0;

		String nomeComodo=null;
		boolean resp=false;
		
		do {
		System.out.println("Nome do comodo");
		nomeComodo=entrada.next();
		System.out.println("Digite a largura");
		larg=entrada.nextInt();
		System.out.println("Digite a comprimento");
		comp=entrada.nextInt();
		area=comp * larg;
		areaTotal+=area;
		System.out.println("Deseja registrar mais comodos?");
		resp=entrada.hasNext();
			
			
		}while(resp==true);
		
		
		System.out.println("Comodo: "+nomeComodo+
							"\nArea: "+area+
							"\nArea do imóvel"+areaTotal);
		
		
		
	}

}
