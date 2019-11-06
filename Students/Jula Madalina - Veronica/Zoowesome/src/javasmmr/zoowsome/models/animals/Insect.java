package javasmmr.zoowsome.models.animals;

public class Insect extends Animal {
	
	Boolean canFly;
	Boolean isDangerous;
	
	public Boolean getFly() {
		return canFly;
	}

	public void setFly(Boolean canFly) {
		this.canFly=canFly;
	}

	public Boolean getDangerous(){
		return isDangerous;
	}

	public void setDangerous(Boolean isDangerous) {
		this.isDangerous=isDangerous;
	}
}
