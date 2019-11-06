package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome,models.animals.*;

public class ReptileFactory extends SpeciesFactory {
    @Override
    public Animal getAnimal(String type) {
        if (Constants.Animal.Reptile.Crocodile.equals(type)) {
            return new Crocodile();
        } else if (Constants.Animal.Reptile.Lizard.equals(type)) {
            return new Lizard();
        } else if (Constants.Animal.Reptile.Snake.equals(type)) {
            return new Snake();
        } else {
            return null;
        }
    }
} 