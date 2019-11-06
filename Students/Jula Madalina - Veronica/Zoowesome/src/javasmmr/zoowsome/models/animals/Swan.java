package javasmmr.zoowsome.models.animals;

public class Swan extends Bird {
	public Swan (Integer nrOfLegs, String name, boolean migrates, Integer avaFlightAltitude) {
		setNrOfLegs(nrOfLegs);
		setName(name);
		setMigrates(migrates);
		setAvgFlightAltitude(avgFlightAltitude);
	}
	
	public Swan () {
		setNrOfLegs(2);
		setName("Lady");
		setMigrates(true);
		setAvgFlightAltitude(1200);
	}
}
