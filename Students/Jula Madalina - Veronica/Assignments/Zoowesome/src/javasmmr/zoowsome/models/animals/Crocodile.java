package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import org.w3c.dom.Element;

import javasmmr.zoowsome.services.factories.Constants;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

public class Crocodile extends Reptile {
	public Crocodile(Integer nrOfLegs, String name, Boolean laysEggs) {
		setNrOfLegs(nrOfLegs);
        setName(name);
        setEggs(laysEggs);
	}
	public Crocodile () {
		setNrOfLegs(4);
        setName("Roco");
        setEggs(true);
	}
	
	@Override
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animal.Reptile.Crocodile);
	}

	@Override
	public void decodeFromXml(Element element)
	{
		super.decodeFromXml(element);
	}
}
