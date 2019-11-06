package javasmmr.zoowsome.models.animals;

import javasmmr.zoowsome.models.animals.Aquatic.WaterType;

public class Whale extends Aquatic {
	public Whale(Integer nrOfLegs, String name, Integer avgSwimDepth, WaterType waterType) {
		setNrOfLegs(nrOfLegs);
        setName(name);
        setAvgSwimDepth(avgSwimDepth);
        setWaterType(waterType);
	}
	public Whale () {
		setNrOfLegs(0);
        setName("Gray");
        setAvgSwimDepth(15000);
        setWaterType(WaterType.freshWater);
	}
}
