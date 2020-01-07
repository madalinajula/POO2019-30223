package Main;

public class Polynomial {
	int n; // numar de coeficienti
	int[] coef; // coeficientii
	String poli ="";
	
	public Polynomial(String[] listOfCoef) {
		this.n = listOfCoef.length - 1; // e si 0 luat in considerare
		this.coef = new int[listOfCoef.length];
		
		for(int i=0; i<=n; i++) {
			coef[i] = Integer.parseInt(listOfCoef[i]);
		}
	}
	
	public String writePoly() {
		int c = n;
		for(int i=0; i<=n; i++) {
			if(coef[i] != 0) {
				if(c == 0) {
					if(coef[i] < 0) {
						//System.out.print(coef[i]);
						poli += coef[i];
					}else {
						//System.out.print("+"+coef[i]);
						poli += "+"+coef[i];
					}
				}else {
					
					if(coef[i] < 0 || i==0) {
						//System.out.print(coef[i]+"x^"+c);
						if(c == 1) {
							poli += coef[i]+"x";
						}else {
							poli += coef[i]+"x^"+c;
						}
					}else {
						//System.out.print("+"+coef[i]+"x^"+c);
						if(c == 1) {
							poli += "+"+coef[i]+"x";
						}else {
							poli += "+"+coef[i]+"x^"+c;
						}
					}
				}
			}
			c--;
		}
		return poli;
	}
}
