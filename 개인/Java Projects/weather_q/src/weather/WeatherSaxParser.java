package weather;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class WeatherSaxParser extends DefaultHandler implements WeatherParser {
	
	//날씨 데이터 담을 리스트
	private List<Weather> list = new ArrayList<>();
	
	Weather weather;	//<data> 태그내의 데이터를 담기위한 객체의 참조변수
	
	String content;		//중간 데이터를 저장하기 위한 문자열
	
	//날씨 데이터 리스트 반환 메소드
	@Override
	public List<Weather> getWeather(String url){
		
		SAXParserFactory factory = SAXParserFactory.newInstance();
		
		try {
		SAXParser parser = factory.newSAXParser();
			parser.parse(url, this);
		} catch (SAXException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}
	
	
	
}
