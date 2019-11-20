package javasmmr.zoowsome.models.animals;

public class Lobster extends Aquatic {
	
	public Lobster(Integer nrOfLegs, String name, Integer avgSwimDepth, WaterType waterType) {
		setNrOfLegs(nrOfLegs);
        setName(name);
        setAvgSwimDepth(avgSwimDepth);
        setWaterType(waterType);
	}
	
	public Lobster() {
		setNrOfLegs(10);
        setName("Rain");
        setAvgSwimDepth(1000);
        setWaterType(WaterType.saltWater);
	}
}
