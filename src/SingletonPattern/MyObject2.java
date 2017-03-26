package SingletonPattern;

/**
 * 懒汉模式
 * 非线程安全
 */
public class MyObject2 {
    private static MyObject2 myObject2;
    private MyObject2() {}
    public static MyObject2 getInstance() {
        if (myObject2 == null) {
            myObject2 = new MyObject2();
        }
        return myObject2;
    }
}
