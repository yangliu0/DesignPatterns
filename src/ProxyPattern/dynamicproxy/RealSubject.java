package ProxyPattern.dynamicproxy;

/**
 * Created by liuyang on 2017/3/22.
 */
public class RealSubject implements Subject {
    public void doSomething() {
        System.out.println("我正在做某事");
    }
}
