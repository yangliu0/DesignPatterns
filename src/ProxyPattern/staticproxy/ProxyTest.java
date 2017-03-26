package ProxyPattern.staticproxy;

/**
 * Created by liuyang on 2017/3/8.
 */
public class ProxyTest {
    public static void main(String[] args) {
        RealSubject realSubject = new RealSubject();
        Proxy proxy = new Proxy(realSubject);
        proxy.request();
    }
}
