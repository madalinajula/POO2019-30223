package lab7;

public class Student implements Cloneable {
	private String nume;
	private String prenume;
	private Masina m;
	
	public Student(String nume, String prenume, Masina m) {
		this.nume=nume;
		this.prenume=prenume;
		this.m=m;
	}
	
	public Object cloneDeep() throws CloneNotSupportedException{
		Student cloned=(Student)super.clone();
		cloned.setM((Masina)cloned.getM().clone());
		return cloned;
	}
	
	public Object cloneShallow() throws CloneNotSupportedException{
		return (Student)super.clone();
	}
	
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
	public Masina getM() {
		return m;
	}
	public void setM(Masina m) {
		this.m = m;
	}
	
	public void schimbaCuloarea(String culoare) {
		this.m.setCuloare(culoare);
	}
}
