package javasmmr.zoowsome.models.animals;

public class Snake extends Reptile {
      public Snake(Integer nrOfLegs, String name, Boolean laysEggs) {
    	  setNrOfLegs(nrOfLegs);
          setName(name);
          setEggs(laysEggs);
      }
      public Snake() {
    	  setNrOfLegs(0);
          setName("Ssslo");
          setEggs(true);
      }
}
