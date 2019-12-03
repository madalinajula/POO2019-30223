package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import javasmmr.zoowsome.services.factories.Constants;

public class Lobster extends Aquatic {
	
	public Lobster(Integer nrOfLegs, String name, Integer avgSwimDepth, WaterType waterType) {
		setNrOfLegs(nrOfLegs);
        setName(name);
        setAvgSwimDepth(avgSwimDepth);
        setWaterType(waterType);
	}
	
	public Lobster() {
		setNrOfLegs(10);
        setName("Rain");
        setAvgSwimDepth(1000);
        setWaterType(WaterType.saltWater);
	}
	
	@Override
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animal.Aquatic.Lobster);
	}

	@Override
	public void decodeFromXml(Element element)
	{
		super.decodeFromXml(element);
	}
}
