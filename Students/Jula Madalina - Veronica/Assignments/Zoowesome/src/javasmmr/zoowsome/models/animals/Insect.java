package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import org.w3c.dom.Element;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

public class Insect extends Animal {
	
	Boolean canFly;
	Boolean isDangerous;
	
	public Boolean getFly() {
		return canFly;
	}

	public void setFly(Boolean canFly) {
		this.canFly=canFly;
	}

	public Boolean getDangerous(){
		return isDangerous;
	}

	public void setDangerous(Boolean isDangerous) {
		this.isDangerous=isDangerous;
	}
	
	@Override
	public void encodeToXml (XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "canFly", String.valueOf(getFly()));
		createNode(eventWriter, "isDangerous", String.valueOf(getDangerous()));

	}

	@Override
	public void decodeFromXml(Element element)
	{
		super.decodeFromXml(element);
		setFly(Boolean.valueOf(element.getElementsByTagName("canFly").item(0).getTextContent()));
		setDangerous(Boolean.valueOf(element.getElementsByTagName("isDangerous").item(0).getTextContent()));
	}
}
