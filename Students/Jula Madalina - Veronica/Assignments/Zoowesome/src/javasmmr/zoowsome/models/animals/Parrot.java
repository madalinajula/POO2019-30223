package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import javasmmr.zoowsome.services.factories.Constants;

public class Parrot extends Bird {
	

	public Parrot (Integer nrOfLegs, String name, boolean migrates, Integer avaFlightAltitude) {
		setNrOfLegs(nrOfLegs);
		setName(name);
		setMigrates(migrates);
		setAvgFlightAltitude(avgFlightAltitude);
	}

	public Parrot() {
		setNrOfLegs(2);
		setName("Sophia");
		setMigrates(false);
		setAvgFlightAltitude(586);
	}
	@Override
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animal.Bird.Parrot);
	}

	@Override
	public void decodeFromXml(Element element)
	{
		super.decodeFromXml(element);
	}
}
