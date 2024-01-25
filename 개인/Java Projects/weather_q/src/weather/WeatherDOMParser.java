package weather;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class WeatherDOMParser implements WeatherParser {

	
	//날씨 데이터들을 담을 리스트
	private List<Weather> list = new ArrayList<>();
	
	@Override
	public List<Weather> getWeather(String url){
		
		//문서 읽어오기
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		try {
			DocumentBuilder builder = factory.newDocumentBuilder();
			//DOM 받아 오기
			
			Document doc = builder.parse(url);
			
			Element root = doc.getDocumentElement();
			
			//weather 데이터 만드는 작업
			parse(root);
			
		} catch (ParserConfigurationException | SAXException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}

	
	private void parse(Element root) {
		
	}
	
}
