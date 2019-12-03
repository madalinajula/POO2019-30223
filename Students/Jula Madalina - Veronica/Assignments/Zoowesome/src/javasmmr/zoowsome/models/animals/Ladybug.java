package javasmmr.zoowsome.models.animals;
import org.w3c.dom.Element;

import javasmmr.zoowsome.services.factories.Constants;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

public class Ladybug extends Insect {
	public Ladybug(Integer nrOfLegs, String name, boolean canFly, boolean isDangerous) {
		setNrOfLegs(nrOfLegs);
	    setName(name);
	    setFly(canFly);
	    setDangerous(isDangerous);
	}
	public Ladybug() {
		setNrOfLegs(6);
	    setName("Bubblr");
	    setFly(true);
	    setDangerous(false);
	}
	@Override
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animal.Insect.Ladybug);
	}

	@Override
	public void decodeFromXml(Element element)
	{
		super.decodeFromXml(element);
	}
}
