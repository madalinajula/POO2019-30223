package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import org.w3c.dom.Element;

import javasmmr.zoowsome.services.factories.Constants;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

public class Butterfly extends Insect {
	public Butterfly(Integer nrOfLegs, String name, boolean canFly, boolean isDangerous) {
		setNrOfLegs(nrOfLegs);
	    setName(name);
	    setFly(canFly);
	    setDangerous(isDangerous);
	}
	public Butterfly() {
		setNrOfLegs(6);
	    setName("Rhiannon");
	    setFly(true);
	    setDangerous(false);
	}
	
	@Override
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animal.Insect.Butterfly);
	}

	@Override
	public void decodeFromXml(Element element)
	{
		super.decodeFromXml(element);
	}
}
