package ghiozdan;

public class TestGhiozdan {

	public static void main(String[] args) {
		Ghiozdan g= new Ghiozdan();
		Caiet c=new Caiet();
		Caiet c1=new Caiet();
		Manual m=new Manual();
		Manual m1=new Manual();
		c.setNume("Matematica");
		c1.setNume("Informatica");
		m.setNume("Engleza");
		m1.setNume("Chineza");
		g.addCaiet(c);
		g.addCaiet(c1);
		g.addManual(m);
		g.addManual(m1);
		g.getNrRechizite();
		g.getNrCaiete();
		g.getNrManuale();
		g.listItems();
		g.listCaiet();
		g.listManual();
	}

}
