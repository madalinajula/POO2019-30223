package javasmmr.zoowsome.repositories;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLEventFactory;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartDocument;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javasmmr.zoowsome.models.employees.Caretaker;
import javasmmr.zoowsome.models.employees.Employee;
import javasmmr.zoowsome.models.interfaces.XML_Parsable;
import javasmmr.zoowsome.services.factories.Constants;

public class EmployeeRepository extends EntityRepository<Employee> {
	
	private static final String XML_FILENAME = "Employees.xml";
	private Boolean isDead;

	public EmployeeRepository() {
		super(XML_FILENAME, Constants.XML_TAGS.EMPLOYEE);
	}



	public ArrayList<Employee> load() throws ParserConfigurationException, SAXException, IOException {
		ArrayList<Employee> employees = new ArrayList<Employee>();
		File fXMLFile = new File(XML_FILENAME);

		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder.parse(fXMLFile);

		doc.getDocumentElement().normalize();

		NodeList nodeList = doc.getElementsByTagName(Constants.XML_TAGS.EMPLOYEE);

		for (int i = 0; i < nodeList.getLength(); i++) {
			Node node = nodeList.item(i);
			if (node.getNodeType() == Node.ELEMENT_NODE) {
				Element element = (Element) node;
				String discriminant = element.getElementsByTagName(Constants.XML_TAGS.DISCRIMINANT).item(0).getTextContent();
				switch (discriminant) {
				case Constants.TypesOfEmployee.Caretaker:
					isDead = (Boolean) null;
					Employee newCaretaker = new Caretaker(discriminant, null, isDead);
					newCaretaker.decodeFromXml(element);
					employees.add(newCaretaker);
					break;
				default:
					break;
				}
			}
		}
		System.out.println(employees.size());
		return employees;
	}

	public static void createNode(XMLEventWriter eventWriter, String name, String value) throws XMLStreamException {
		XMLEventFactory eventFactory = XMLEventFactory.newInstance();
		XMLEvent end = eventFactory.createDTD("\n");
		XMLEvent tab = eventFactory.createDTD("\t");

		StartElement sElement = eventFactory.createStartElement("", "", name);
		eventWriter.add(tab);
		eventWriter.add(sElement);

		Characters characters = eventFactory.createCharacters(value);
		eventWriter.add(characters);

		EndElement eElement = eventFactory.createEndElement("", "", name);
		eventWriter.add(eElement);
		eventWriter.add(end);
	}

	@Override
	protected Employee getEntityFromXmlElement(Element element) {
		String discriminant = element.getElementsByTagName(Constants.XML_TAGS.DISCRIMINANT).item(0).getTextContent();
		switch(discriminant) {
		case Constants.TypesOfEmployee.Caretaker:
			Employee newCaretaker = new Caretaker(discriminant, null, (Boolean) null);
			newCaretaker.decodeFromXml(element);
			return newCaretaker;
			default:
				break;
		}
		return null;
	}
}
