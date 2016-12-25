package ObserverPattern;

import java.util.ArrayList;

// 天气数据类，用以获取最新的天气数据，并进行发布
public class WeatherData implements Subject
{
    private ArrayList observers; //用来存储观察者
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData()
    {
        observers = new ArrayList();
    }

    public void registerObserver(Observer o)
    {
        observers.add(o);
    }

    public void removeObserver(Observer o)
    {
        int i = observers.indexOf(o);
        if(i >= 0)
        {
            observers.remove(i);
        }
    }

    public void notifyObserver()
    {
        for(int i = 0; i < observers.size(); i++)
        {
            Observer observer = (Observer)observers.get(i);
            observer.update(temperature, humidity, pressure);
        }
    }

    // 当从气象站获取到新的天气数据后，通知观察者
    public void measurementChanged()
    {
        notifyObserver();
    }

    // 测试方法，set天气数据
    public void setMeasurement(float temperature, float humidity, float pressure)
    {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementChanged();
    }
}
