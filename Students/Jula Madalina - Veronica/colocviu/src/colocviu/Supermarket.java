package colocviu;

public class Supermarket {
	
	Angajat[] angajati = new Angajat[100];
	ClientFidel[] clientFidel= new ClientFidel[500];
	Produs[] produseAdaugate = new Produs[500];
	int p=-1,c=-1,a=-1;
	Angajat mr = new Angajat();
	int sumaProduseFideli=0, sumaProduse=0;
	
	Supermarket(){
		
	}
	
	public void adaugaProdus(Produs pro) {
		p++;
		produseAdaugate[p]=pro;
	}
	
	public void adaugaAngajati(Angajat ang) {
		a++;
		angajati[a]=ang;
	}
	
	public void adaugaClientiFideli(ClientFidel cli) {
		c++;
		clientFidel[c]=cli;
	}
	
	public int nrProduseClientiFideli() {
		for(int i=0;i<c;i++) {
			sumaProduseFideli+=clientFidel[i].getnrProduseCumparate();
		}
		return sumaProduseFideli;
	}
	
	public int nrProduseClienti(Client[] c, int nr) {
		for(int i=0;i<nr;i++)
		{
			sumaProduse+=c[i].getnrProduseCumparate();
		}
		return sumaProduse;
	}
	
	
	
	
}
