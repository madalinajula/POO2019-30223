package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Butterfly;
import javasmmr.zoowsome.models.animals.Fly;
import javasmmr.zoowsome.models.animals.Ladybug;

public class InsectFactory extends SpeciesFactory {

    @Override
    public Animal getAnimal(String type) {
        if (Constants.Animal.Insect.Butterfly.equals(type)) {
            return new Butterfly();
        } else if (Constants.Animal.Insect.Ladybug.equals(type)) {
            return new Ladybug();
        } else if (Constants.Animal.Insect.Fly.equals(type)) {
            return new Fly();
        } else {
            return null;
        }
    }
}
