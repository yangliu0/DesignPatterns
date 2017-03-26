package ProxyPattern.staticproxy;

/**
 * Created by liuyang on 2017/3/8.
 */
public class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("RealSubject");
    }
}
