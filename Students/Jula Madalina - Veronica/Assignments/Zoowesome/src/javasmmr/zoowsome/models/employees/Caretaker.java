package javasmmr.zoowsome.models.employees;

import java.math.BigDecimal;


import javasmmr.zoowsome.services.factories.*;
import javasmmr.zoowsome.models.animals.Animal;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import org.w3c.dom.Element;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.services.factories.Constants;

public class Caretaker extends Employee implements Caretaker_I {
	public double workingHours;

	public Caretaker(String name, BigDecimal i, boolean isDead) {
		super(name, i, isDead);
		// TODO Auto-generated constructor stub
	}
	
	public void setWorkingHours (double workingHours) {
		this.workingHours=workingHours;
	}
	public double getWorkingHours () {
		return workingHours;
	}
	
	@Override
	public String takeCareOf(Animal animal) {
		if(animal.kill()) {
			return Constants.Employee.Caretaker.TCO_KILLED;
		}
		if(this.workingHours<animal.getMaintenanceCost()) {
			return Constants.Employee.Caretaker.TCO_NO_TIME;
		}
		animal.setTakenCareOf(true);
		this.workingHours=this.workingHours-animal.getMaintenanceCost();
		return Constants.Employee.Caretaker.TCO_SUCCESS;
	}
	
	@Override
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "workingHours", String.valueOf(this.workingHours));
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.TypesOfEmployee.Caretaker);
	}

	@Override
	public void decodeFromXml(Element element)
	{
		super.decodeFromXml(element);
		setWorkingHours(Double.valueOf(element.getElementsByTagName("workingHours").item(0).getTextContent()));
	}
}
