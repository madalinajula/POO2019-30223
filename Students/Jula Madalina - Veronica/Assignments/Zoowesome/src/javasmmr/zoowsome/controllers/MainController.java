package javasmmr.zoowsome.controllers;

import java.util.ArrayList;


import javasmmr.zoowsome.models.employees.Caretaker;
import javasmmr.zoowsome.models.employees.Employee;
import javasmmr.zoowsome.repositories.AnimalRepository;
import javasmmr.zoowsome.repositories.EmployeeRepository;
import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.services.factories.AnimalFactory;
import javasmmr.zoowsome.services.factories.Constants;
import javasmmr.zoowsome.services.factories.SpeciesFactory;

import java.math.BigDecimal;

import javasmmr.zoowsome.models.employees.*;

public class MainController {
	
	
    private static Animal[] animals;
    private static Caretaker[] caretakers;
	public static void main(String[] args) throws Exception {
    	
    	animals = new Animal[3];
    	caretakers = new Caretaker[3];
    	
    	AnimalFactory animalFactory = new AnimalFactory();
    	
    	SpeciesFactory speciesFactory1 = animalFactory.getSpeciesFactory(Constants.Species.Mammal);
		SpeciesFactory speciesFactory2 = animalFactory.getSpeciesFactory(Constants.Species.Reptile);
		SpeciesFactory speciesFactory3 = animalFactory.getSpeciesFactory(Constants.Species.Bird);
		
    	
    	Animal animal1 = speciesFactory1.getAnimal(Constants.Animal.Mammal.Tiger);
    	Animal animal2 = speciesFactory2.getAnimal(Constants.Animal.Reptile.Crocodile);
    	Animal animal3 = speciesFactory3.getAnimal(Constants.Animal.Bird.Swan);
        
    	System.out.printf("Avem un animal cu %d picioare, iar numele lui e %s \n", animal1.getNrOfLegs(), animal1.getName());
    	System.out.printf("Avem un crocodil cu numele %s \n", animal2.getName());
    	System.out.printf("Avem un animal cu %d picioare \n", animal3.getNrOfLegs());
    	
    	Caretaker care1 = new Caretaker("Ana", BigDecimal.valueOf(3000), false);
    	Caretaker care2 = new Caretaker("Dragos", BigDecimal.valueOf(4213), false);
    	Caretaker care3 = new Caretaker("Mircea", BigDecimal.valueOf(3865), false);
    	
    	animals[0]=animal1;
    	animals[1]=animal2;
    	animals[2]=animal3;
    	
    	caretakers[0]=care1;
    	caretakers[1]=care2;
    	caretakers[2]=care3;
    	
String result;
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(caretakers[i].getisDead() == false && animals[j].getTakenCareOf() == false ) {
					result = caretakers[i].takeCareOf(animals[j]);
					if(result.equals(Constants.Employee.Caretaker.TCO_KILLED)) {
						caretakers[i].setIsDead(true);
					}
					else if(result.equals(Constants.Employee.Caretaker.TCO_SUCCESS)) {
						animals[j].setTakenCareOf(true);
					}
				}
			}
		}
		
		
    	System.out.println("Sunt ingrijite animalele ? ");
		for(int i=0;i<3; i++)
		{
			System.out.println(animals[i].getName() + " " + animals.getTakenCareOf());
		}
		
		System.out.println("Sunt ingrijitorii morti ?");
		for(int i=0;i<3;i++)
		{
			System.out.println(caretakers[i].getName() + " " + caretakers.getIsDead());
		}
		
		ArrayList<Animal> loadA = new ArrayList<Animal>();
		
		loadA.add(animals[0]);
		loadA.add(animals[1]);
		loadA.add(animals[2]);
		
		
		ArrayList<Employee> employees = new ArrayList<Employee>();
		
		employees.add(caretakers[0]);
		employees.add(caretakers[1]);
		employees.add(caretakers[2]);
		
		

      /*  BigDecimal salar = new BigDecimal(3000);
        BigDecimal salar2 = new BigDecimal(4000);
        Employee[] employee = new Caretaker[2];
        employee[0]=new Caretaker("Ana",salar,false);
        employee[1]=new Caretaker("Dragos",salar2,false);
        */
    }
	
}   