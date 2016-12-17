package StrategyPattern;

/**
 * 模型鸭子类，用于实现具体的鸭子
 */

public class ModelDuck extends Duck
{
    public ModelDuck()
    {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    public void display()
    {
        System.out.println("我是一只模型鸭子");
    }

    public static void main(String[] args)
    {
        Duck model = new ModelDuck();
        model.performFly();
        model.performQuack();
        System.out.println("*****修改模型鸭飞行行为*****");
        model.setFlyBehavior(new FlyRocketPowerd());
        model.performFly();
    }
}
