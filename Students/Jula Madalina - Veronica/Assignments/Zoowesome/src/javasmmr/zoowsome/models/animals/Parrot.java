package javasmmr.zoowsome.models.animals;

public class Parrot extends Bird {
	

	public Parrot (Integer nrOfLegs, String name, boolean migrates, Integer avaFlightAltitude) {
		setNrOfLegs(nrOfLegs);
		setName(name);
		setMigrates(migrates);
		setAvgFlightAltitude(avgFlightAltitude);
	}

	public Parrot() {
		setNrOfLegs(2);
		setName("Sophia");
		setMigrates(false);
		setAvgFlightAltitude(586);
	}
}
