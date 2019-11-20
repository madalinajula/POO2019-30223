package javasmmr.zoowsome.models.animals;

import java.util.Random;

public class Animal implements Killer {
      Integer nrOfLegs;
      String name;
      final double maintenanceCost; 
      final double dangerPerc;
      Boolean takenCareOf = false ;
      
      public Integer getNrOfLegs () {
    	  return this.nrOfLegs;
      }
      
      public void setNrOfLegs(int nrOfLegs) {
    	  this.nrOfLegs=nrOfLegs;
      }
      
      public String getName() {
    	  return this.name;
      }
      
      public void setName(String name) {
    	  this.name=name;
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
      
      public void setTakenCareOf(Boolean takenCareOf) {
    	  this.takenCareOf=takenCareOf;
      }
      
      public boolean getTakenCareOf () {
    	  return takenCareOf;
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
}
