package javasmmr.zoowsome.models.animals;

import javasmmr.zoowsome.models.animals.Aquatic.WaterType;

public class Octopus extends Aquatic {
	public Octopus(Integer nrOfLegs, String name, Integer avgSwimDepth, WaterType waterType) {
		setNrOfLegs(nrOfLegs);
        setName(name);
        setAvgSwimDepth(avgSwimDepth);
        setWaterType(waterType);
	}
	public Octopus() {
		setNrOfLegs(8);
        setName("Purple");
        setAvgSwimDepth(1200);
        setWaterType(WaterType.saltWater);
	}
}
