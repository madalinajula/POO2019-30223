package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import org.w3c.dom.Element;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

public class Reptile extends Animal {
     Boolean laysEggs;
     
     public Boolean getEggs() {
    	 return laysEggs;
     }
     
     public void setEggs(Boolean laysEggs) {
    	 this.laysEggs=laysEggs;
     }
     
     @Override
 	public void encodeToXml (XMLEventWriter eventWriter) throws XMLStreamException {
 		super.encodeToXml(eventWriter);
 		createNode(eventWriter, "laysEggs", String.valueOf(getEggs()));

 	}

 	@Override
 	public void decodeFromXml(Element element)
 	{
 		super.decodeFromXml(element);
 		setEggs(Boolean.valueOf(element.getElementsByTagName("laysEggs").item(0).getTextContent()));
 	}
}
