package javasmmr.zoowsome.models.animals;

public class Crocodile extends Reptile {
	public Crocodile(Integer nrOfLegs, String name, Boolean laysEggs) {
		setNrOfLegs(nrOfLegs);
        setName(name);
        setEggs(laysEggs);
	}
	public Crocodile () {
		setNrOfLegs(4);
        setName("Roco");
        setEggs(true);
	}
}
