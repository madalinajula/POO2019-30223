package Main;

public class Functions {
	public Polynomial add(Polynomial p1, Polynomial p2) {
		int n1 = p1.n;
		int n2 = p2.n;
		String[] elements;
		
		if(n1 >= n2) {
			elements = new String[n1+1];
			for(int i = 0; i <= n1; i++) {
				elements[i] = "0";
			}
			Polynomial result = new Polynomial(elements);
			for(int i = p2.n; i >= 0; i--) {
				//System.out.println(p1.coef[n1] + p2.coef[n2]);
				result.coef[n1] = p1.coef[n1] + p2.coef[n2];
				n1--;
				n2--;
			}
			//System.out.println("p "+p2.n);
			for(int i = p1.n-p2.n-1; i >= 0  ; i--) {
				//System.out.println("s");
				result.coef[i] = p1.coef[i];
				//System.out.println(p1.coef[i]);
			}
			return result;
		}else {
			elements = new String[n2+1];
			for(int i = 0; i <= n2; i++) {
				elements[i] = "0";
			}
			Polynomial result = new Polynomial(elements);
			for(int i = p1.n; i >= 0; i--) {
				result.coef[n2] = p2.coef[n2] + p1.coef[n1];
				n1--;
				n2--;
			}
			for(int i = p2.n-p1.n-1; i >= 0  ; i--) {
				result.coef[i] = p2.coef[i];
			}
			return result;
		}
	}
	
	public Polynomial substract(Polynomial p1, Polynomial p2) {
		int n1 = p1.n;
		int n2 = p2.n;
		String[] elements;
		
		if(n1 >= n2) {
			elements = new String[n1+1];
			for(int i = 0; i <= n1; i++) {
				elements[i] = "0";
			}
			Polynomial result = new Polynomial(elements);
			for(int i = p2.n; i >= 0; i--) {
				result.coef[n1] = p1.coef[n1] - p2.coef[n2];
				n1--;
				n2--;
			}
			for(int i = p1.n-p2.n-1; i >= 0  ; i--) {
				result.coef[i] = p1.coef[i];
			}
			return result;
		}else {
			elements = new String[n2+1];
			for(int i = 0; i <= n2; i++) {
				elements[i] = "0";
			}
			Polynomial result = new Polynomial(elements);
			for(int i = p1.n; i >= 0; i--) {
				result.coef[n2] = p2.coef[n2] - p1.coef[n1];
				n1--;
				n2--;
			}
			for(int i = p2.n-p1.n-1; i >= 0  ; i--) {
				result.coef[i] = p2.coef[i];
			}
			return result;
		}
	}
	
	public Polynomial multiply(Polynomial p1, Polynomial p2) {
		int n1 = p1.n;
		int n2 = p2.n;
		String[] elements;
		
		elements = new String[p1.coef.length + n2];
		for(int i = 0; i < n1+n2+1; i++) {
			elements[i] = "0";
		}
		Polynomial result = new Polynomial(elements);
		
		for(int i = 0; i <= n1; i++) {
			for(int j = 0; j <= n2; j++) {
				result.coef[i+j] += p1.coef[i] * p2.coef[j];
			}
		}
		return result;
	}
	
	public Polynomial mul_scal(Polynomial p1, int scal) {
		int n1 = p1.n;
		String[] elements;
		
		elements = new String[p1.coef.length];
		for(int i = 0; i <= n1; i++) {
			elements[i] = "0";
		}
		Polynomial result = new Polynomial(elements);
		
		for(int i = 0; i <= n1; i++) {
			result.coef[i] = p1.coef[i] * scal;
		}
		return result;
	}
	
	public int eval(Polynomial p1, int n) {
		int c = p1.n;
		int result = 0;
		int s = 0;
		for(int i = 0; i <= p1.n; i++) {
			s = (int) Math.pow(n, c);
			s *= p1.coef[i];
			result+=s;
			c--;
		}
		
		return result;
	}
}
