package javasmmr.zoowsome.models.animals;

public class Ladybug extends Insect {
	public Ladybug(Integer nrOfLegs, String name, boolean canFly, boolean isDangerous) {
		setNrOfLegs(nrOfLegs);
	    setName(name);
	    setFly(canFly);
	    setDangerous(isDangerous);
	}
	public Ladybug() {
		setNrOfLegs(6);
	    setName("Bubblr");
	    setFly(true);
	    setDangerous(false);
	}
}
