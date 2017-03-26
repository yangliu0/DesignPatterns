package ProxyPattern.dynamicproxy;

/**
 * Created by liuyang on 2017/3/22.
 */
public class SubjectTest {
    public static void main(String[] args) {
        RealSubject realSubject = new RealSubject();
        SubjectProxy subjectProxy = new SubjectProxy(realSubject);
        Subject subject = (Subject)subjectProxy.getProxy();
        subject.doSomething();
    }
}
