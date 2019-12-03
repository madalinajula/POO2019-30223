package javasmmr.zoowsome.models.animals;


import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import org.w3c.dom.Element;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

public class Mammal extends Animal {
          Float normalBodyTemp;
          Float percBodyHair;
          
        public Float getBodyTemp() {
      		return normalBodyTemp;
      	}

      	public void setBodyTemp(Float normalBodyTemp) {
      		this.normalBodyTemp=normalBodyTemp;
      	}

      	public Float getBodyHair() {
      		return percBodyHair;
      	}

      	public void setBodyHair(Float percBodyHair) {
      		this.percBodyHair=percBodyHair;
      	}
      	
      	@Override
    	public void encodeToXml (XMLEventWriter eventWriter) throws XMLStreamException {
    		super.encodeToXml(eventWriter);
    		createNode(eventWriter, "normalBodyTemp", String.valueOf(getBodyTemp()));
    		createNode(eventWriter, "percBodyHair", String.valueOf(getBodyHair()));

    	}

    	@Override
    	public void decodeFromXml(Element element)
    	{
    		super.decodeFromXml(element);
    		setBodyTemp(Float.valueOf(element.getElementsByTagName("normalBodyTemp").item(0).getTextContent()));
    		setBodyHair(Float.valueOf(element.getElementsByTagName("percBodyHair").item(0).getTextContent()));
    	}
}
