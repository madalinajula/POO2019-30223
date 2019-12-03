package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import org.w3c.dom.Element;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

public class Aquatic extends Animal {
	
	private static final WaterType WaterType = null;
	private Integer avgSwimDepth;
	enum WaterType {saltWater, freshWater};
	WaterType water;
	
	private Integer getAvgSwimDepth() {
		return avgSwimDepth;
	}
	
	public void setAvgSwimDepth (Integer avgSwimDepth) {
		this.avgSwimDepth=avgSwimDepth;
	}
	
	public WaterType getWaterType() {
		return WaterType;
	}
	
	public void setWaterType(WaterType waterType) {
	}
	
	@Override
	public void encodeToXml (XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "avgSwimDepth", String.valueOf(getAvgSwimDepth()));
		createNode(eventWriter, "water", String.valueOf(getWaterType()));
	}
	
	@Override
	public void decodeFromXml(Element element)
	{
		super.decodeFromXml(element);
		setAvgSwimDepth(Integer.valueOf(element.getElementsByTagName("avgSwimDepth").item(0).getTextContent()));
		setWaterType(WaterType.valueOf(element.getElementsByTagName("water").item(0).getTextContent()));
	}
	
}
