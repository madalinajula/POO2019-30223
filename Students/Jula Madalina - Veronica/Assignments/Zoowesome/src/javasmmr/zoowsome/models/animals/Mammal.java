package javasmmr.zoowsome.models.animals;

public class Mammal extends Animal {
          Float normalBodyTemp;
          Float percBodyHair;
          
        public Float getBodyTemp() {
      		return normalBodyTemp;
      	}

      	public void setBodyTemp(Float normalBodyTemp) {
      		this.normalBodyTemp=normalBodyTemp;
      	}

      	public Float getBodyHair() {
      		return percBodyHair;
      	}

      	public void setBodyHair(Float percBodyHair) {
      		this.percBodyHair=percBodyHair;
      	}
}
