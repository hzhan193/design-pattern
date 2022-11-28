import com.apple.hzhan.observerpattern.CurrentCondition;
import com.apple.hzhan.observerpattern.Forecast;
import com.apple.hzhan.observerpattern.WeatherData;

public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentCondition currentCondition = new CurrentCondition(weatherData);
        Forecast forecast = new Forecast(weatherData);
        weatherData.setMeasurements(22.7, 11.3, 17.8);
    }
}