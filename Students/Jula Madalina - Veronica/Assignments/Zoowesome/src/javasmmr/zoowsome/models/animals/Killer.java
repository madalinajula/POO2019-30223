package javasmmr.zoowsome.models.animals;


public interface Killer {
	public default boolean kill() {
		return false;
	}
}
