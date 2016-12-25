package ObserverPattern;

// 展示当前状态
public class CurrentConditionDisplay implements Observer, DisplayElement
{
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionDisplay(Subject weatherData)
    {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void remove()
    {
        weatherData.removeObserver(this);
    }

    public void update(float temperature, float humidity, float pressure)
    {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    public void display()
    {
        System.out.println("当前状态: 温度 " + temperature + "度 " + " 湿度 " + humidity + "%");
    }
}
