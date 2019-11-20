package javasmmr.zoowsome.models.animals;

public class Gorila extends Mammal {
	public Gorila(Integer nrOfLegs, String name, float normalBodyTemp, float percBodyHair) {
		setNrOfLegs(nrOfLegs);
		setName(name);
		setBodyTemp(normalBodyTemp);
		setBodyHair(percBodyHair);
	}
	public Gorila() {
		setNrOfLegs(4);
		setName("Judo");
		setBodyTemp(38.4f);
		setBodyHair(64.3f);
	}
}
