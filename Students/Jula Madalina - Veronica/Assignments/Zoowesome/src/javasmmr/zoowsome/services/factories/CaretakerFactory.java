package javasmmr.zoowsome.services.factories;

import java.math.BigDecimal;

import javasmmr.zoowsome.models.employees.Caretaker;

public class CaretakerFactory extends EmployeeFactory{
	
	public Caretaker getEmployee(String type) {
		if(Constants.TypesOfEmployee.Caretaker.equals(type)) {
			BigDecimal n= new BigDecimal(0);
			return new Caretaker(null, n, false);	
		}
		else
			return null;
	}

}
