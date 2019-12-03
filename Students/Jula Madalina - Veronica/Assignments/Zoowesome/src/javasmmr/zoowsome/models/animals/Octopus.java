package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import javasmmr.zoowsome.models.animals.Aquatic.WaterType;
import javasmmr.zoowsome.services.factories.Constants;

public class Octopus extends Aquatic {
	public Octopus(Integer nrOfLegs, String name, Integer avgSwimDepth, WaterType waterType) {
		setNrOfLegs(nrOfLegs);
        setName(name);
        setAvgSwimDepth(avgSwimDepth);
        setWaterType(waterType);
	}
	public Octopus() {
		setNrOfLegs(8);
        setName("Purple");
        setAvgSwimDepth(1200);
        setWaterType(WaterType.saltWater);
	}
	@Override
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animal.Aquatic.Octopus);
	}

	@Override
	public void decodeFromXml(Element element)
	{
		super.decodeFromXml(element);
	}
}
