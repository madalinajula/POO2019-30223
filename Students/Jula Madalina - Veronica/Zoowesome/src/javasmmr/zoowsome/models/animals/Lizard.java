package javasmmr.zoowsome.models.animals;

public class Lizard extends Reptile {
	public Lizard (Integer nrOfLegs, String name, Boolean laysEggs) {
		setNrOfLegs(nrOfLegs);
        setName(name);
        setEggs(laysEggs);
	}
	public Lizard () {
		setNrOfLegs(4);
        setName("Linus");
        setEggs(true);
	}
}
