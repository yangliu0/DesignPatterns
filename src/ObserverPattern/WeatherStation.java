package ObserverPattern;

// 模拟天气站，发布天气
public class WeatherStation
{
    public static void main(String[] args)
    {
        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay current = new CurrentConditionDisplay(weatherData);

        weatherData.setMeasurement(35, 65, 30.4f);
        weatherData.setMeasurement(36, 67, 30.5f);
        weatherData.setMeasurement(34, 66, 30.5f);

        // 移除观察者
        current.remove();
        weatherData.setMeasurement(33, 62, 30.5f);
    }
}
