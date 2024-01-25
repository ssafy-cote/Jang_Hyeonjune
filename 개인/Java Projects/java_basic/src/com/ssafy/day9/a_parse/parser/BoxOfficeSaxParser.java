package com.ssafy.day9.a_parse.parser;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import com.ssafy.day9.a_parse.dto.BoxOffice;

public class BoxOfficeSaxParser extends DefaultHandler implements BoxOfficeParser {

	// TODO: singleton 형태로 작성해보자.
	private static BoxOfficeSaxParser parser = new BoxOfficeSaxParser();

	public static BoxOfficeSaxParser getParser() {
		return parser;
	}

	private BoxOfficeSaxParser() {
		this.list = new ArrayList<>();
	}
	// END

	// 파싱된 내용을 저장할 List
	private List<BoxOffice> list;
	// 현재 파싱하고 있는 대상 객체
	private BoxOffice current;
	// 방금 읽은 텍스트 내용
	private String content;

	@Override
	public List<BoxOffice> getBoxOffice(InputStream resource) {
		list = new ArrayList<>();
		try {
			SAXParserFactory factory = SAXParserFactory.newInstance();
			SAXParser parser;
			parser = factory.newSAXParser();
			parser.parse(resource, this);
		} catch (ParserConfigurationException | SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// END
		return list;
	}
	
	public void startDocument() throws SAXException {
		System.out.println("문서 시작");
	}

	@Override
	public void endDocument() throws SAXException {
		System.out.println("문서 끝");
	}

	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		// TODO Auto-generated method stub
//		System.out.println("start Element");
		if(qName.equals("dailyBoxOffice")) {
			current = new BoxOffice();
		}
	}


	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		// TODO Auto-generated method stub
		if (qName.equals("rank")) {
			current.setRank(Integer.parseInt(content));
		} else if (qName.equals("movieNm")) {
			current.setMovieNm(this.content);
		} else if (qName.equals("openDt")) {
			current.setOpenDt(current.toDate(content));
		} else if (qName.equals("audiAcc")) {
			current.setAudiAcc(Integer.parseInt(content));
		} else if (qName.equals("dailyBoxOffice")) {
			list.add(this.current);
			this.current = null;
		}
	}

	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		// TODO Auto-generated method stub
		this.content = String.valueOf(ch, start, length);
	}

	// TODO: 필요한 매서드를 재정의 하여 boxOffice.xml을 파싱하시오.

	// END
}
