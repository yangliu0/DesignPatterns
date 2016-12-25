package ObserverPattern.usejdk;

// 天气站，发布天气
public class WeatherStation
{
    public static void main(String[] args)
    {
        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay current = new CurrentConditionDisplay(weatherData);

        weatherData.setMeasurements(35, 65, 30.4f);
        weatherData.setMeasurements(36, 67, 30.5f);
        weatherData.setMeasurements(34, 66, 30.5f);

        // 移除观察者
        current.remove();
        weatherData.setMeasurements(33, 62, 30.5f);
    }
}
