package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import javasmmr.zoowsome.services.factories.Constants;

import org.w3c.dom.Element;

import javasmmr.zoowsome.services.factories.Constants;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

public class Gorila extends Mammal {
	public Gorila(Integer nrOfLegs, String name, float normalBodyTemp, float percBodyHair) {
		setNrOfLegs(nrOfLegs);
		setName(name);
		setBodyTemp(normalBodyTemp);
		setBodyHair(percBodyHair);
	}
	public Gorila() {
		setNrOfLegs(4);
		setName("Judo");
		setBodyTemp(38.4f);
		setBodyHair(64.3f);
	}
	
	@Override
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animal.Mammal.Gorila);
	}

	@Override
	public void decodeFromXml(Element element)
	{
		super.decodeFromXml(element);
	}
}
