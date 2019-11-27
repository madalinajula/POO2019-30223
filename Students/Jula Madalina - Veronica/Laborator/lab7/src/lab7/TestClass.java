package lab7;

public class TestClass {

	public static void main(String[] args) throws CloneNotSupportedException {
		Masina masina = new Masina("Ford", "verde");
		Student student = new Student("Petrean", "Denisa", masina);

		System.out.println(student.getNume()+' '+ student.getPrenume()+' ' + student.getM().getMarca()+' ' + student.getM().getCuloare());

		Student student1 = (Student) student.cloneDeep();
		student1.schimbaCuloarea("albastru");
		
		System.out.println(student1.getNume()+' '+ student1.getPrenume()+' ' + student1.getM().getMarca()+' ' + student1.getM().getCuloare());
	}

}
