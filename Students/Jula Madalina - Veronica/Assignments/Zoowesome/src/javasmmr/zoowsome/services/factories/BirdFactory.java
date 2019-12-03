package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.*;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Parrot;
import javasmmr.zoowsome.models.animals.Swan;
import javasmmr.zoowsome.models.animals.Turkey;
public class BirdFactory extends SpeciesFactory {

    @Override
    public Animal getAnimal(String type) {
        if (Constants.Animal.Bird.Parrot.equals(type)) {
            return new Parrot();
        } else if (Constants.Animal.Bird.Swan.equals(type)) {
            return new Swan();
        } else if (Constants.Animal.Bird.Turkey.equals(type)) {
            return new Turkey();
        } else {
            return null;
        }
    }
}
