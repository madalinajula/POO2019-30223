package javasmmr.zoowsome.models.employees;

import java.math.BigDecimal;
import java.util.UUID;

public abstract class Employee {
	String name;
	UUID id= UUID.randomUUID();
	BigDecimal salary;
	boolean isDead= false ;
	
	Employee (String name, BigDecimal salary, boolean isDead){
		this.name=name;
		this.salary=salary;
		this.isDead=isDead;
	}
	
	public void setName (String name) {
		this.name=name;
	} 
	
	public String getName () {
		return name;
	}
	
	public void setSalary(BigDecimal salary) {
		this.salary=salary;
	}
	public BigDecimal getSalary() {
		return salary;
	}
	public void setIsDead (boolean isDead) {
		this.isDead=isDead;
	}
	public boolean getisDead () {
		return isDead;
	}
	
}
