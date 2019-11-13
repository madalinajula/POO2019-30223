package colocviu;

public class Produs {
	
	 String nume;
	 double pret;
	 int nrPeStoc;
	
	public boolean ProdusPeStoc(Produs p)
	{
		if(p.nrPeStoc != 0)
		{
			return true;
		}
		return false; 
	}
	
	public String getNume() {
		return nume;
	}

}
