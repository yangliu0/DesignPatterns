package SingletonPattern;

/**
 * 懒汉模式
 * 同步 线程安全
 * 但是效率低下
 */
public class MyObject3 {
    private static MyObject3 myObject3;
    private MyObject3() {}
    synchronized public static MyObject3 getInstance() {
        if (myObject3 == null) {
            myObject3 = new MyObject3();
        }
        return myObject3;
    }
}
