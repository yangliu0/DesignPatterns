package SingletonPattern;

/**
 * Created by liuyang on 2017/3/24.
 */
public class Test extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(MyObject7.getInstance().hashCode());
        }
    }

    public static void main(String[] args) {
        Test test = new Test();
        Thread t1 = new Thread(test);
        Thread t2 = new Thread(test);
        Thread t3 = new Thread(test);
        t1.start();
        t2.start();
        t3.start();
    }
}
