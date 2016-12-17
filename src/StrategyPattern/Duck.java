package StrategyPattern;

/**
 * 抽象类：鸭子类
 */
public abstract class Duck
{
    FlyBehavior flyBehavior;        // 飞行为接口
    QuackBehavior quackBehavior;       // 叫行为接口

    public Duck()
    {
    }

    public abstract void display();

    public void swim()
    {
        System.out.println("所有鸭子都可以游泳，我在游泳");
    }

    public void performFly()
    {
        flyBehavior.fly();
    }

    public void performQuack()
    {
        quackBehavior.quack();
    }

    // 设定方法，可以动态改变鸭子的行为
    public void setFlyBehavior(FlyBehavior fb)
    {
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb)
    {
        quackBehavior = qb;
    }

}
