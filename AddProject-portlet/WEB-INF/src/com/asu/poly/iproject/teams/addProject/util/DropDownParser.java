package com.iproject.util;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class DropDownParser {

	/**
	 * @author Shruthi
	 */
	public HashMap<String, ArrayList<DropOption>> Parse(String fileName) {

		HashMap<String, ArrayList<DropOption>> retMap = new HashMap<String, ArrayList<DropOption>>();
		ArrayList<DropOption> oneDropDown;
		DropOption oneKeyValPair;
		try {

			File fXmlFile = new File(fileName);
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(fXmlFile);
			doc.getDocumentElement().normalize(); 

			NodeList nList = doc.getElementsByTagName("dropdown"); 

			for (int temp = 0; temp < nList.getLength(); temp++) {

				Node nNode = nList.item(temp); 

				if (nNode.getNodeType() == Node.ELEMENT_NODE) {

					Element eElement = (Element) nNode;

					
					NodeList dropDownList = eElement.getElementsByTagName("options");
					oneDropDown = new ArrayList<DropOption>();
					for (int i = 0; i < dropDownList.getLength(); i++) {
						oneKeyValPair = new DropOption();
						Node optionNode = dropDownList.item(i);
						if (optionNode.getNodeType() == Node.ELEMENT_NODE) {
							Element optElement = (Element) nNode;
							oneKeyValPair.setKey(optElement.getElementsByTagName("key").item(i).getTextContent());
							oneKeyValPair.setValue(optElement.getElementsByTagName("value").item(i).getTextContent());
							oneDropDown.add(oneKeyValPair);
						}

					}
					retMap.put(eElement.getAttribute("name"), oneDropDown);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return retMap;
	}

}