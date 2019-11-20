package javasmmr.zoowsome.controllers;


import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.services.factories.AnimalFactory;
import javasmmr.zoowsome.services.factories.Constants;
import javasmmr.zoowsome.services.factories.SpeciesFactory;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.services.factories.AnimalFactory;
import javasmmr.zoowsome.services.factories.Constants;
import javasmmr.zoowsome.services.factories.SpeciesFactory;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.services.factories.AnimalFactory;
import javasmmr.zoowsome.services.factories.Constants;
import javasmmr.zoowsome.services.factories.SpeciesFactory;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.services.factories.AnimalFactory;
import javasmmr.zoowsome.services.factories.Constants;
import javasmmr.zoowsome.services.factories.SpeciesFactory;

import java.math.BigDecimal;

import javasmmr.zoows
import javasmmr.zoowsome.models.employees.*;

public class MainController {
    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalFactory();

        SpeciesFactory speciesFactory =
                 animalFactory.getSpeciesFactory(Constants.Species.Bird);
        Animal animal = speciesFactory.getAnimal(Constants.Animal.Bird.Swan);

        System.out.printf("We have an animal which had: %d legs")
                animal.getNrOfLegs();
        BigDecimal salar = new BigDecimal(3000);
        BigDecimal salar2 = new BigDecimal(4000);
        Employee[] employee = new Caretaker[2];
        employee[0]=new Caretaker("Ana",salar,false);
        employee[1]=new Caretaker("Dragos",salar1,false);
        
        
    }
}   