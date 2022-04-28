package lacos;

public class IntervaloNumerico {
public static void main(String[] args) {
	IntervaloNumerico.cal();
}

public static void cal() {
	int cont=0,soma=0,media=0;
	
	for(int i=50;i<=70;i++) {
		if(i % 2==0) {
			soma+=i;
			cont++;
		}
		media=soma/cont;
	}
	System.out.println("Quantidade:  "+cont+ "\nsoma= "+soma+"\nMedia= "+media);
}
}
