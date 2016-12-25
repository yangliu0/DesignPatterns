package ObserverPattern.usejdk;

import ObserverPattern.DisplayElement;

import java.util.Observable;
import java.util.Observer;

// 展示当前状态
public class CurrentConditionDisplay implements Observer, DisplayElement
{
    Observable observable;
    private float temperature;
    private float humidity;

    public CurrentConditionDisplay(Observable observable)
    {
        this.observable = observable;
        observable.addObserver(this);
    }

    public void remove()
    {
        observable.deleteObserver(this);
    }

    public void update(Observable obs, Object arg)
    {
        if(obs instanceof WeatherData)
        {
            WeatherData weatherData = (WeatherData)obs;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

    public void display()
    {
        System.out.println("当前状态: 温度 " + temperature + "度 " + " 湿度 " + humidity + "%");
    }
}
