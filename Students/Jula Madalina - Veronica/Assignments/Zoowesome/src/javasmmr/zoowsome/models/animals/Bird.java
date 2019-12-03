package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import org.w3c.dom.Element;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

public class Bird extends Animal {

	Boolean migrates;
	Integer avgFlightAltitude;
	
	public Boolean getMigrates() {
		return migrates;
	}
	
	public void setMigrates(Boolean migrates) {
		this.migrates=migrates;
	}
	
	public Integer getAvgFlightAltitude() {
		return avgFlightAltitude;
	}
	
	public void setAvgFlightAltitude (Integer avgFlightAltitude) {
		this.avgFlightAltitude = avgFlightAltitude;
	}
	
	@Override
	public void encodeToXml (XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "migrates", String.valueOf(getMigrates()));
		createNode(eventWriter, "avaFlightAltitude", String.valueOf(getAvgFlightAltitude()));

	}

	@Override
	public void decodeFromXml(Element element)
	{
		super.decodeFromXml(element);
		setMigrates(Boolean.valueOf(element.getElementsByTagName("migrates").item(0).getTextContent()));
		setAvgFlightAltitude(Integer.valueOf(element.getElementsByTagName("AvgFlightAltitude").item(0).getTextContent()));
	}
}
