package lab7;

import java.util.ArrayList;
import java.util.Collections;


public class Persoana implements Comparable<Persoana>{
	private String nume;
	private String prenume;
	private int varsta;

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getPrenume() {
		return prenume;
	}

	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}

	public int getVarsta() {
		return varsta;
	}

	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}
	
	Persoana(){
	}
	
	public static void main(String[] args) {
		ArrayList<Persoana> listapersoane = new ArrayList<Persoana>();
		Persoana p1 = new Persoana();
		Persoana p2 = new Persoana();
		Persoana p3 = new Persoana();
		p1.setNume("Petrean");
		p1.setPrenume("Denisa");
		p1.setVarsta(20);
		p2.setNume("Sas");
		p2.setPrenume("Catalin");
		p2.setVarsta(28);
		p3.setNume("Bogdan");
		p3.setPrenume("Camelia");
		p3.setVarsta(56);
		listapersoane.add(0, p1);
		listapersoane.add(1, p2);
		listapersoane.add(2, p3);
		
		Collections.sort(listapersoane);
		
		for(Persoana counter: listapersoane) {
			System.out.println(counter.nume);
		}
	}

	@Override
	public int compareTo(Persoana o) {
		return nume.compareTo(o.nume);
		//return varsta.compareTo(o.varsta);
	}
}
