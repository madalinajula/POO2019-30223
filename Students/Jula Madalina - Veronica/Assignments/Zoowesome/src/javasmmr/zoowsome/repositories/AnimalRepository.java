package javasmmr.zoowsome.repositories;

import java.io.File;


import java.io.IOException;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLEventFactory;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Bird;
import javasmmr.zoowsome.models.animals.Butterfly;
import javasmmr.zoowsome.models.animals.Crocodile;
import javasmmr.zoowsome.models.animals.Fly;
import javasmmr.zoowsome.models.animals.Gorila;
import javasmmr.zoowsome.models.animals.Ladybug;
import javasmmr.zoowsome.models.animals.Lizard;
import javasmmr.zoowsome.models.animals.Lobster;
import javasmmr.zoowsome.models.animals.Octopus;
import javasmmr.zoowsome.models.animals.Parrot;
import javasmmr.zoowsome.models.animals.Sheep;
import javasmmr.zoowsome.models.animals.Snake;
import javasmmr.zoowsome.models.animals.Swan;
import javasmmr.zoowsome.models.animals.Tiger;
import javasmmr.zoowsome.models.animals.Turkey;
import javasmmr.zoowsome.models.animals.Whale;
import javasmmr.zoowsome.models.interfaces.XML_Parsable;
import javasmmr.zoowsome.services.factories.Constants;



public class AnimalRepository extends EntityRepository<Animal> {
	private static final String XML_FILENAME = "Animals.xml";
	public AnimalRepository() {
		super(XML_FILENAME, Constants.XML_TAGS.ANIMAL);
	}
	
	public ArrayList<Animal> load() throws ParserConfigurationException, SAXException, IOException {
		ArrayList<Animal> animals = new ArrayList<Animal>();
		File fXMLFile = new File(XML_FILENAME);

		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder.parse(fXMLFile);

		doc.getDocumentElement().normalize();

		NodeList nodeList = doc.getElementsByTagName(Constants.XML_TAGS.ANIMAL);

		for (int i = 0; i < nodeList.getLength(); i++) {
			Node node = nodeList.item(i);
			if (node.getNodeType() == Node.ELEMENT_NODE) {
				Element element = (Element) node;
				String discriminant = element.getElementsByTagName(Constants.XML_TAGS.DISCRIMINANT).item(0)
						.getTextContent();

				switch (discriminant) {
				case Constants.Animal.Mammal.Gorila:
					Animal gorila = new Gorila();
					gorila.decodeFromXml(element);
					animals.add(gorila);
					break;
				case Constants.Animal.Mammal.Tiger:
					Animal tiger = new Tiger();
					tiger.decodeFromXml(element);
					animals.add(tiger);
					break;
				case Constants.Animal.Mammal.Sheep:
					Animal sheep = new Sheep();
					sheep.decodeFromXml(element);
					animals.add(sheep);
					break;
				case Constants.Animal.Bird.Parrot:
					Animal parrot = new Parrot();
					parrot.decodeFromXml(element);
					animals.add(parrot);
					break;
				case Constants.Animal.Bird.Swan:
					Animal swan = new Swan();
					swan.decodeFromXml(element);
					animals.add(swan);
					break;
				case Constants.Animal.Bird.Turkey:
					Animal turkey = new Turkey();
					turkey.decodeFromXml(element);
					animals.add(turkey);
					break;
				case Constants.Animal.Insect.Butterfly:
					Animal butterfly = new Butterfly();
					butterfly.decodeFromXml(element);
					animals.add(butterfly);
					break;
				case Constants.Animal.Insect.Ladybug:
					Animal ladybug = new Ladybug();
					ladybug.decodeFromXml(element);
					animals.add(ladybug);
					break;
				case Constants.Animal.Insect.Fly:
					Animal fly = new Fly();
					fly.decodeFromXml(element);
					animals.add(fly);
					break;
				case Constants.Animal.Aquatic.Whale:
					Animal whale = new Whale();
					whale.decodeFromXml(element);
					animals.add(whale);
					break;
				case Constants.Animal.Aquatic.Lobster:
					Animal lobster = new Lobster();
					lobster.decodeFromXml(element);
					animals.add(lobster);
					break;
				case Constants.Animal.Aquatic.Octopus:
					Animal octopus = new Octopus();
					octopus.decodeFromXml(element);
					animals.add(octopus);
					break;
				case Constants.Animal.Reptile.Snake:
					Animal snake = new Snake();
					snake.decodeFromXml(element);
					animals.add(snake);
					break;
				case Constants.Animal.Reptile.Lizard:
					Animal lizard = new Lizard();
					lizard.decodeFromXml(element);
					animals.add(lizard);
					break;
				case Constants.Animal.Reptile.Crocodile:
					Animal crocodile = new Crocodile();
					crocodile.decodeFromXml(element);
					animals.add(crocodile);
					break;
				default:
					break;
				}
			}
		}

		return animals;
	}
	
	
	@Override
	protected Animal getEntityFromXmlElement(Element element) {
		String discriminant = element.getElementsByTagName(Constants.XML_TAGS.DISCRIMINANT).item(0).getTextContent();
		switch(discriminant) {
		case Constants.Animal.Mammal.Gorila:
			Animal gorila = new Gorila();
			gorila.decodeFromXml(element);
			return gorila;
		case Constants.Animal.Mammal.Tiger:
			Animal tiger = new Tiger();
			tiger.decodeFromXml(element);
			return tiger;
		case Constants.Animal.Mammal.Sheep:
			Animal sheep = new Sheep();
			sheep.decodeFromXml(element);
			return sheep;
		case Constants.Animal.Bird.Parrot:
			Animal parrot = new Parrot();
			parrot.decodeFromXml(element);
			return parrot;
		case Constants.Animal.Bird.Swan:
			Animal swan = new Swan();
			swan.decodeFromXml(element);
			return swan;
		case Constants.Animal.Bird.Turkey:
			Animal turkey = new Turkey();
		    turkey.decodeFromXml(element);
			return turkey;
		case Constants.Animal.Insect.Butterfly:
			Animal butterfly = new Butterfly();
			butterfly.decodeFromXml(element);
			return butterfly;
		case Constants.Animal.Insect.Ladybug:
			Animal ladybug = new Ladybug();
			ladybug.decodeFromXml(element);
			return ladybug;
		case Constants.Animal.Insect.Fly:
			Animal fly = new Fly();
			fly.decodeFromXml(element);
			return fly;
		case Constants.Animal.Aquatic.Whale:
			Animal whale = new Whale();
			whale.decodeFromXml(element);
			return whale;
		case Constants.Animal.Aquatic.Lobster:
			Animal lobster = new Lobster();
			lobster.decodeFromXml(element);
			return lobster;
		case Constants.Animal.Aquatic.Octopus:
			Animal octopus = new Octopus();
			octopus.decodeFromXml(element);
			return octopus;
		case Constants.Animal.Reptile.Snake:
			Animal snake = new Snake();
			snake.decodeFromXml(element);
			return snake;
		case Constants.Animal.Reptile.Lizard:
			Animal lizard = new Lizard();
			lizard.decodeFromXml(element);
			return lizard;
		case Constants.Animal.Reptile.Crocodile:
			Animal crocodile = new Crocodile();
			crocodile.decodeFromXml(element);
			return crocodile;
		default:
			break;
		}
		return null;
	}
}
