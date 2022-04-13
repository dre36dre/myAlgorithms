package lacos;

import java.util.Scanner;

public class Table {
	
	Scanner entrada=new Scanner(System.in);
	
	
	private int fator;
	private int produto;
	
	
	public Table() {
		super();
	}


	public Table(int fator, int produto) {
		super();
		this.fator = fator;
		this.produto = produto;
	}


	public int getFator() {
		return fator;
	}


	public int getProduto() {
		return produto;
	}


	public void setFator(int fator) {
		this.fator = fator;
	}


	public void setProduto(int produto) {
		this.produto = produto;
	}

	public void calculoTable() {
		System.out.println("Digite o numero");
		fator=entrada.nextInt();
		for(int i=1;i<=10;i++) {
			produto=fator* i;
			System.out.println(fator +" x "+i+" = "+produto);
		}
	}
	
	
	
}
