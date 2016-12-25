package ObserverPattern;

// 主题接口，被订阅的主题
public interface Subject
{
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObserver();
}
