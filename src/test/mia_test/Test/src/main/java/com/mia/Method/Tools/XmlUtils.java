package com.mia.Method.Tools;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.util.Iterator;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

import org.xml.sax.SAXException;
import org.dom4j.io.DOMReader;
import org.dom4j.io.SAXReader;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

public class XmlUtils {

	public static void Read(String FileName) {
		SAXReader saxReader = new SAXReader();
		Document document = null;
		try {
			document = saxReader.read(new File(FileName));
		} catch (DocumentException e) {

			e.printStackTrace();
		}

		// 获取根元素
		Element root = document.getRootElement();
		System.out.println("Root: " + root.getName());

		// 获取所有子元素
		List<?> childList = root.elements();
		System.out.println("total child count: " + childList.size());

		// 获取特定名称的子元素
		List<?> childList2 = root.elements("hello");
		System.out.println("hello child: " + childList2.size());

		// 获取名字为指定名称的第一个子元素
		Element firstWorldElement = root.element("world");
		// 输出其属性
		System.out.println("first World Attr: " + firstWorldElement.attribute(0).getName() + "="
				+ firstWorldElement.attributeValue("name"));

		System.out.println("迭代输出-----------------------");
		// 迭代输出
		for (Iterator<?> iter = root.elementIterator(); iter.hasNext();) {
			Element e = (Element) iter.next();
			System.out.println(e.attributeValue("name"));

		}

		System.out.println("用DOMReader-----------------------");
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = null;
		try {
			db = dbf.newDocumentBuilder();
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		}
		// 注意要用完整类名
		org.w3c.dom.Document document2 = null;
		try {
			document2 = db.parse(new File("students.xml"));
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		DOMReader domReader = new DOMReader();

		// 将JAXP的Document转换为dom4j的Document
		Document document3 = domReader.read(document2);

		Element rootElement = document3.getRootElement();

		System.out.println("Root: " + rootElement.getName());

	}

	public static void main(String[] args) {
		Read("students.xml");
	}

}
