package FactoryPattern.factorymethod;

import FactoryPattern.Pizza;

/**
 * Created by liuyang on 2017/2/12.
 * 工厂方法
 */
public abstract class PizzaStore {
    public Pizza orderPizza(String type) {
        Pizza pizza;

        pizza = createPizza(type);

        //其他操作

        return pizza;
    }

    abstract Pizza createPizza(String type);
}
