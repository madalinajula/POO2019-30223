package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.*;

public class AquaticFactory extends SpeciesFactory {
	@Override
    public Animal getAnimal(String type) {
        if (Constants.Animal.Aquatic.Lobster.equals(type)) {
            return new Lobster();
        } else if (Constants.Animal.Aquatic.Octopus.equals(type)) {
            return new Octopus();
        } else if (Constants.Animal.Aquatic.Whale.equals(type)) {
            return new Whale();
        } else {
            return null;
        }
    }
}
