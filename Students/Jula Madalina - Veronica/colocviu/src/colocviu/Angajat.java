package colocviu;

public class Angajat extends Persoana implements Comparable  {
	
	private String dataAngajare;
	private int nrClienti;
	Client[] clientiServiti = new Client[nrClienti];
	double sumaPlata=0;
	
    Angajat(){
    	
    }
    
	public String getDataAngajare() {
		return dataAngajare;
	}
	public void setDataAngajare(String dataAngajare) {
		this.dataAngajare=dataAngajare;
	}
	
	public int getNrClienti()
	{
		return nrClienti;
	}
	
	public void setNrCLienti(int nrClienti) {
		this.nrClienti=nrClienti;
	}
	
	public String getClientiServiti() {
		for(int i=0;i<clientiServiti.length;) {
			return clientiServiti[i].getNume();
		}
		return null;
	}
	
	public void scaneazaProduse(ClientFidel c ) {
		for(int i=0;i<c.getnrProduseCumparate();) {
			sumaPlata+=c.getProdus().pret;
		}
	     c.setSumaPlata(sumaPlata);
	}
	
	public double compareTo(ClientFidel c) {
		return nume.compareTo(c.sumaPlata);
	}
}
