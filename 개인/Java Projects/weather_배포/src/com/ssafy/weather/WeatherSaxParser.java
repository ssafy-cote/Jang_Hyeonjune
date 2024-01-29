package com.ssafy.weather;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class WeatherSaxParser extends DefaultHandler {
	private StringBuilder sb;
	WeatherDto weatherDto;
	List<WeatherDto> list = new ArrayList<>();

	private static WeatherSaxParser parser = new WeatherSaxParser();

	private WeatherSaxParser() {
	}

	public static WeatherSaxParser getParser() {
		return parser;
	}

	public List<WeatherDto> getNewsList(String url) {
		list.removeAll(list);
		connectWeather(url);
		return list;
	}

	private List<WeatherDto> connectWeather(String url) {
		SAXParserFactory f = SAXParserFactory.newInstance();
		try {
			SAXParser parser = f.newSAXParser();
//			TODO : url을 이용하여 xml 문서를 parsing

			return list;
		} catch (Exception e) {
			throw new RuntimeException();
		}
	}

	@Override
	public void startDocument() throws SAXException {
		super.startDocument();
//			TODO: startDocument method를 구현하세요.
		
	}

	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		super.characters(ch, start, length);
//			TODO: characters method를 구현하세요.
		
	}

	@Override
	public void startElement(String uri, String localName, String name, Attributes attributes) throws SAXException {
		super.startElement(uri, localName, name, attributes);
//			TODO: startElement method를 구현하세요.
		
	}

	@Override
	public void endElement(String uri, String localName, String name) throws SAXException {
		if (weatherDto != null) {
			if (name.equalsIgnoreCase("hour")) {
				weatherDto.setHour(sb.toString().trim());
			} else if (name.equalsIgnoreCase("temp")) {
//				TODO: 온도를 Dto에 설정하세요.
			} else if (name.equalsIgnoreCase("wfKor")) {
				weatherDto.setWfKor(sb.toString().trim());
			} else if (name.equalsIgnoreCase("wfEn")) {
				weatherDto.setWfEn(sb.toString().trim());
			} else if (name.equalsIgnoreCase("reh")) {
				weatherDto.setReh(sb.toString().trim());
			} else if (name.equalsIgnoreCase("data")) {
				list.add(weatherDto);
			}
		}
		sb.setLength(0);
	}

}