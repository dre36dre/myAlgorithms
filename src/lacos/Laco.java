package lacos;

import java.util.Scanner;

// Elaborar um programa que calcule o fatorial de numero qualquer
//  O programa deve permitir que usuario decida quando terminar o programa
public class Laco {
	Scanner entrada=new Scanner(System.in);
	private int cont, fat, n;
	String resp;

	public Laco() {
		super();
	}

	public Laco(Scanner entrada, int cont, int fat, int n, String resp) {
		super();
		this.entrada = entrada;
		this.cont = cont;
		this.fat = fat;
		this.n = n;
		this.resp = resp;
	}


	public Scanner getEntrada() {
		return entrada;
	}

	public int getCont() {
		return cont;
	}

	public int getFat() {
		return fat;
	}

	public int getN() {
		return n;
	}

	public String getResp() {
		return resp;
	}

	public void setEntrada(Scanner entrada) {
		this.entrada = entrada;
	}

	public void setCont(int cont) {
		this.cont = cont;
	}

	public void setFat(int fat) {
		this.fat = fat;
	}

	public void setN(int n) {
		this.n = n;
	}

	public void setResp(String resp) {
		this.resp = resp;
	}

	public  int fatorial(int n) {
			if(n<=1) {
				return 1;
			}
			return (n * fatorial(n-1));
			

	}
}








