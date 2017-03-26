package ProxyPattern.dynamicproxy;

/**
 * Created by liuyang on 2017/3/8.
 */
public class UserServiceImpl implements Service {
    @Override
    public void add() {
        System.out.println("This is Add Service");
    }
}
