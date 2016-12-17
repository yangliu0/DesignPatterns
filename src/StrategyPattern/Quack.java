package StrategyPattern;

/**
 * 鸭子呱呱叫
 */

public class Quack implements QuackBehavior
{
    public void quack()
    {
        System.out.println("我在呱呱叫");
    }
}
