package colocviu;

public class Client extends Persoana {
	
	private int nrProduseCumparate;
	private Produs[] listaProduse = new Produs[200];
	int poz=-1;
	
	public int getnrProduseCumparate() {
		return nrProduseCumparate;
	}
	
	public Produs getProdus() {
		
		for(int i=0;i<listaProduse.length;) {
		 return listaProduse[i];
		 }
		return null;
	}
	
	public void setProdus(Produs p) {
		poz++;
		listaProduse[poz].nume=p.nume;
		listaProduse[poz].pret=p.pret;
		listaProduse[poz].nrPeStoc=p.nrPeStoc;
	}
	
}
