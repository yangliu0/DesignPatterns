package StrategyPattern;

/**
 *
 * 不能飞
 */
public class FlyNoWay implements FlyBehavior
{
    public void fly()
    {
        System.out.println("我不会飞");
    }
}
