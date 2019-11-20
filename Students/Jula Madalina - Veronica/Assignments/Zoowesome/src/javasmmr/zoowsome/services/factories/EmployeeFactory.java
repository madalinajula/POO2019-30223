package javasmmr.zoowsome.services.factories;

public class EmployeeFactory extends EmployeeAbstractFactory {
	public EmployeeFactory getEmployeeFactory (String type) {
		if(Constants.TypesOfEmployee.Caretaker.eguals(type)) {
			return new CaretakerFactory();	
		}
		else 
			return null;
	}
}
