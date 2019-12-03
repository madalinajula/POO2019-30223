package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import javasmmr.zoowsome.services.factories.Constants;

public class Lizard extends Reptile {
	public Lizard (Integer nrOfLegs, String name, Boolean laysEggs) {
		setNrOfLegs(nrOfLegs);
        setName(name);
        setEggs(laysEggs);
	}
	public Lizard () {
		setNrOfLegs(4);
        setName("Linus");
        setEggs(true);
	}
	@Override
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animal.Reptile.Lizard);
	}

	@Override
	public void decodeFromXml(Element element)
	{
		super.decodeFromXml(element);
	}
}
