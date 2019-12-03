package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import javasmmr.zoowsome.services.factories.Constants;

public class Sheep extends Mammal {
	public Sheep(Integer nrOfLegs, String name, float normalBodyTemp, float percBodyHair) {
		setNrOfLegs(nrOfLegs);
		setName(name);
		setBodyTemp(normalBodyTemp);
		setBodyHair(percBodyHair);
	}
	public Sheep() {
		setNrOfLegs(4);
		setName("Rosie");
		setBodyTemp(34.2f);
		setBodyHair(75.3f);
	}
	@Override
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animal.Mammal.Sheep);
	}

	@Override
	public void decodeFromXml(Element element)
	{
		super.decodeFromXml(element);
	}
}
