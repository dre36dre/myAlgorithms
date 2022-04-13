package lacos;

public class AoQuadrado {

	private int  i;

public AoQuadrado() {
		super();
	}

public AoQuadrado(int i) {
	super();
	this.i = i;
}

public int getI() {
	return i;
}

public void setI(int i) {
	this.i = i;
}

public int numeroAoQuadrado() {
	
for ( i=15;i<200;i++) {
	;
System.out.println(i+" -  "+Math.pow(i, 2));	
}
return i;
}	
	
}
