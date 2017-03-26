package SingletonPattern;

/**
 * 饿汉模式 立即加载
 */
public class MyObject1 {
    private static MyObject1 myObject1 = new MyObject1();
    private MyObject1() {}
    public static MyObject1 getInstance() {
        return myObject1;
    }
}
