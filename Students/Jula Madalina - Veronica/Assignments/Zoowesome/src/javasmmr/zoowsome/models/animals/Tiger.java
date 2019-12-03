package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import javasmmr.zoowsome.services.factories.Constants;

public class Tiger extends Mammal {
	public Tiger(Integer nrOfLegs, String name, float normalBodyTemp, float percBodyHair) {
		setNrOfLegs(nrOfLegs);
		setName(name);
		setBodyTemp(normalBodyTemp);
		setBodyHair(percBodyHair);
	}
	public Tiger() {
		setNrOfLegs(4);
		setName("Blur");
		setBodyTemp(36f);
		setBodyHair(97.5f);
	}
	@Override
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animal.Mammal.Tiger);
	}

	@Override
	public void decodeFromXml(Element element)
	{
		super.decodeFromXml(element);
	}
}
