package weather;

import java.util.List;

public interface WeatherParser {
	List<Weather> getWeather(String url);
}
