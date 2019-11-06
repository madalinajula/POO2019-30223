package javasmmr.zoowsome.models.animals;

public class Fly extends Insect{
	public Fly (Integer nrOfLegs, String name, boolean canFly, boolean isDangerous) {
		setNrOfLegs(nrOfLegs);
	    setName(name);
	    setFly(canFly);
	    setDangerous(isDangerous);
	}
	public Fly() {
		setNrOfLegs(6);
	    setName("Mug");
	    setFly(true);
	    setDangerous(true);
	}
}
