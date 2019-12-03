package javasmmr.zoowsome.models.employees;

import java.math.BigDecimal;

import java.util.UUID;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import org.w3c.dom.Element;

import javasmmr.zoowsome.models.interfaces.XML_Parsable;

public abstract class Employee implements XML_Parsable {
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
	public void setIsDead (Boolean boolean1) {
		this.isDead=boolean1;
	}
	public boolean getisDead () {
		return isDead;
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		createNode(eventWriter,"id" ,String.valueOf(this.id));
		createNode(eventWriter,"name" ,String.valueOf(this.name));
		createNode(eventWriter,"salary" ,String.valueOf(this.salary));
		createNode(eventWriter,"isDead" ,String.valueOf(this.isDead));
	}
	public void decodeFromXml(Element element) {
		//setIsDead(UUID.valueOf(element.getElementsByTagName("id").item(0).getTextContent()));
		setName(element.getElementsByTagName("name").item(0).getTextContent());
		setSalary(new BigDecimal(element.getElementsByTagName("salary").item(0).getTextContent()));
		setIsDead(Boolean.valueOf(element.getElementsByTagName("isDead").item(0).getTextContent()));
	}
	
}
