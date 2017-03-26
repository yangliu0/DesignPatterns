package SingletonPattern;

/**
 * 使用enum
 */
public class MyObject7 {
    private enum MyEnumSingleton {
        enumFactory;
        private MyObject7 myObject7;
        private MyEnumSingleton() {
            myObject7 = new MyObject7();
        }
        public MyObject7 getInstance() {
            return myObject7;
        }
    }
    public static MyObject7 getInstance() {
        return MyEnumSingleton.enumFactory.getInstance();
    }
}
