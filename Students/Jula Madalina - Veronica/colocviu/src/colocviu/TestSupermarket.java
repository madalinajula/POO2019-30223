package colocviu;

public class TestSupermarket {

	public static void main(String[] args) {
		Supermarket s=new Supermarket();
		Angajat a=new Angajat();
		Angajat a1=new Angajat();
		Client c=new Client();
		ClientFidel cf=new ClientFidel();
		ClientFidel cf1=new ClientFidel();
		a.setNume("Ionel");
		a.setDataAngajare("11.12.2003");
		a.setNrCLienti(52);
		a.setNume("Bogdan");
		a.setDataAngajare("4.10.2005");
		a.setNrCLienti(82);
		c.setNume("Amalia");
		cf.setNume("Pop");
		cf.setDiscount(0.4);
		cf.setPuncte(10);
		s.adaugaAngajati(a);
		s.adaugaAngajati(a1);
		s.adaugaClientiFideli(cf);
		s.adaugaClientiFideli(cf1);
		
	}

}
