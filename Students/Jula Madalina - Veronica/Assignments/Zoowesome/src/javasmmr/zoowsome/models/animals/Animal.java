package javasmmr.zoowsome.models.animals;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import java.util.Random;

import org.w3c.dom.Element;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.models.interfaces.XML_Parsable;

public class Animal implements Killer,XML_Parsable {
      private Integer nrOfLegs;
      private String name;
      private double maintenanceCost; 
      private double dangerPerc;
      private Boolean takenCareOf = false ;
      
      public Integer getNrOfLegs() {
		return nrOfLegs;
	}

	public void setNrOfLegs(Integer nrOfLegs) {
		this.nrOfLegs = nrOfLegs;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getTakenCareOf() {
		return takenCareOf;
	}

	public void setTakenCareOf(Boolean takenCareOf) {
		this.takenCareOf = takenCareOf;
	}

	public double getDangerPerc() {
		return dangerPerc;
	}
	
	public void setDangerPerc(double dangerPerc) {
		this.dangerPerc=dangerPerc;
	}

	
 
      Animal() {
		this.maintenanceCost = 0;
		this.dangerPerc = 0;
    	  
      }
      
      Animal(Integer nrOfLegs, String name, double maintenanceCost, double dangerPerc, boolean takenCareOf){
		  this.nrOfLegs=nrOfLegs;
    	  this.name=name;
    	  this.maintenanceCost=maintenanceCost;
    	  this.dangerPerc=dangerPerc;
    	  this.takenCareOf=takenCareOf;
      }
      

	public boolean kill() {
		Random rand = new Random();
		double r = rand.nextDouble();
		if(r<dangerPerc) {
			return true;
		}
		else 
			return false;
	}

	public double getMaintenanceCost() {
		return maintenanceCost;
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		createNode(eventWriter, "nrOfLegs", String.valueOf(this.nrOfLegs));
		createNode(eventWriter, "name", String.valueOf(this.name));
		createNode(eventWriter, "maintenanceCost", String.valueOf(this.maintenanceCost));
		createNode(eventWriter, "dangerPerc", String.valueOf(this.dangerPerc));
		createNode(eventWriter, "takenCareOf", String.valueOf(this.takenCareOf));
	}
	
	public void decodeFromXml(Element element) {
		setNrOfLegs(Integer.valueOf(element.getElementsByTagName("nrOfLegs").item(0).getTextContent()));
		setName(String.valueOf(element.getElementsByTagName("name").item(0).getTextContent()));
		setMaintenanceCost(Double.valueOf(element.getElementsByTagName("maintenanceCost").item(0).getTextContent()));
		setDangerPerc(Double.valueOf(element.getElementsByTagName("dangerPerc").item(0).getTextContent()));
		setTakenCareOf(Boolean.valueOf(element.getElementsByTagName("takenCareOf").item(0).getTextContent()));
	}

	private void setMaintenanceCost(Double valueOf) {
		// TODO Auto-generated method stub
		
	}

	
}
