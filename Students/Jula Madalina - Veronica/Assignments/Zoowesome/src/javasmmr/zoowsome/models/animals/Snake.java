package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import javasmmr.zoowsome.services.factories.Constants;

public class Snake extends Reptile {
      public Snake(Integer nrOfLegs, String name, Boolean laysEggs) {
    	  setNrOfLegs(nrOfLegs);
          setName(name);
          setEggs(laysEggs);
      }
      public Snake() {
    	  setNrOfLegs(0);
          setName("Ssslo");
          setEggs(true);
      }
      @Override
  	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
  		super.encodeToXml(eventWriter);
  		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animal.Reptile.Snake);
  	}

  	@Override
  	public void decodeFromXml(Element element)
  	{
  		super.decodeFromXml(element);
  	}
}
