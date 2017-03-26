package SingletonPattern;

/**
 * 使用static代码块
 * 线程安全
 */
public class MyObject6 {
    private static MyObject6 instance = null;
    private MyObject6() {}
    static {
        instance = new MyObject6();
    }
    public static MyObject6 getInstance() {
        return instance;
    }
}
