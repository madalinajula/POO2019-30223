package javasmmr.zoowsome.models.animals;

public class Turkey extends Bird {

	public Turkey(Integer nrOfLegs, String name, boolean migrates, Integer avaFlightAltitude) {
		setNrOfLegs(nrOfLegs);
		setName(name);
		setMigrates(migrates);
		setAvgFlightAltitude(avgFlightAltitude);
	}
	
	public Turkey() {
		setNrOfLegs(2);
		setName("Buffalo");
		setMigrates(false);
		setAvgFlightAltitude(2);
	}
}
