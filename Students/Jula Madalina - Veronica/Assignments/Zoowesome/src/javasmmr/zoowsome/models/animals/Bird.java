package javasmmr.zoowsome.models.animals;

public class Bird extends Animal {

	Boolean migrates;
	Integer avgFlightAltitude;
	
	public Boolean getMigrates() {
		return migrates;
	}
	
	public void setMigrates(Boolean migrates) {
		this.migrates=migrates;
	}
	
	public Integer getAvgFlightAltitude() {
		return avgFlightAltitude;
	}
	
	public void setAvgFlightAltitude (Integer avgFlightAltitude) {
		this.avgFlightAltitude = avgFlightAltitude;
	}
}
