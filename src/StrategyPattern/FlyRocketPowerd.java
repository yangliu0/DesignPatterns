package StrategyPattern;

/**
 * 坐上火箭飞起来了
 */

public class FlyRocketPowerd implements FlyBehavior
{
    public void fly()
    {
        System.out.println("我坐上火箭飞起来了");
    }
}
