package javasmmr.zoowsome.models.animals;

public class Animal {
      Integer nrOfLegs;
      String name;
      
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
      }
      
      Animal(Integer nrOfLegs, String name){
    	  this.nrOfLegs=nrOfLegs;
    	  this.name=name;
      }
}
