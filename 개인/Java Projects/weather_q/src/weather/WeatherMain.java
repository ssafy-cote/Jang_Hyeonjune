package weather;

import java.util.List;

public class WeatherMain {

	public static void main(String[] args) {
		
		//SAX파서 사용
		WeatherParser parser = new WeatherSaxParser();
		
		//Dom파서 사용
//		WeatherParser parser = new WeatherDOMParser();
		
		List<Weather> list = parser.getWeather("http://www.kma.go.kr/wid/queryDFSRSS.jsp?zone=3017058600");
		
		list.stream().forEach(System.out::println);
	}
}
