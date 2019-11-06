package javasmmr.zoowsome.models.animals;

public class Tiger extends Mammal {
	public Tiger(Integer nrOfLegs, String name, float normalBodyTemp, float percBodyHair) {
		setNrOfLegs(nrOfLegs);
		setName(name);
		setBodyTemp(normalBodyTemp);
		setBodyHair(percBodyHair);
	}
	public Tiger() {
		setNrOfLegs(4);
		setName("Blur");
		setBodyTemp(36f);
		setBodyHair(97.5f);
	}
}
