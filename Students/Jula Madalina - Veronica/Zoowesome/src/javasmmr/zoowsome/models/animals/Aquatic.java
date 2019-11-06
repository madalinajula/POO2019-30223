package javasmmr.zoowsome.models.animals;

public class Aquatic extends Animal {
	
	private static final WaterType WaterType = null;
	private Integer avgSwimDepth;
	private javasmmr.zoowsome.models.animals.Aquatic.WaterType waterType;
	enum WaterType {saltWater, freshWater};
	
	private Integer getAvgSwimDepth() {
		return avgSwimDepth;
	}
	
	public void setAvgSwimDepth (Integer avgSwimDepth) {
		this.avgSwimDepth=avgSwimDepth;
	}
	
	public WaterType getWaterType() {
		return WaterType;
	}
	
	public void setWaterType(WaterType waterType) {
		this.waterType=waterType;
	}
}
