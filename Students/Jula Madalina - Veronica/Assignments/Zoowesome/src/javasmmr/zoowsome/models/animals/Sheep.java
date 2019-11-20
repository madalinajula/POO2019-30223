package javasmmr.zoowsome.models.animals;

public class Sheep extends Mammal {
	public Sheep(Integer nrOfLegs, String name, float normalBodyTemp, float percBodyHair) {
		setNrOfLegs(nrOfLegs);
		setName(name);
		setBodyTemp(normalBodyTemp);
		setBodyHair(percBodyHair);
	}
	public Sheep() {
		setNrOfLegs(4);
		setName("Rosie");
		setBodyTemp(34.2f);
		setBodyHair(75.3f);
	}
}
