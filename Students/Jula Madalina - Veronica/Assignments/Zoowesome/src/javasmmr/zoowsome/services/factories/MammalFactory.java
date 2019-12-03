package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.*;

public class MammalFactory extends SpeciesFactory {

    @Override
    public Animal getAnimal(String type) {
        if (Constants.Animal.Mammal.Gorila.equals(type)) {
            return new Gorila();
        } else if (Constants.Animal.Mammal.Sheep.equals(type)) {
            return new Sheep();
        } else if (Constants.Animal.Mammal.Tiger.equals(type)) {
            return new Tiger();
        } else {
            return null;
        }
    }
}