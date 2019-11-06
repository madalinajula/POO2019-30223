package javasmmr.zoowsome.models.animals;

public class Butterfly extends Insect {
	public Butterfly(Integer nrOfLegs, String name, boolean canFly, boolean isDangerous) {
		setNrOfLegs(nrOfLegs);
	    setName(name);
	    setFly(canFly);
	    setDangerous(isDangerous);
	}
	public Butterfly() {
		setNrOfLegs(6);
	    setName("Rhiannon");
	    setFly(true);
	    setDangerous(false);
	}
}
