package ProxyPattern.dynamicproxy;

/**
 * Created by liuyang on 2017/3/8.
 */
public class Test {
    public static void main(String[] args) {
        Service service = new UserServiceImpl();
        MyInvocationHandler handler = new MyInvocationHandler(service);
        Service serviceProxy = (Service)handler.getProxy();
        serviceProxy.add();
    }
}
