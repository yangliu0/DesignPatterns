package FactoryPattern.simplefactory;

import FactoryPattern.CheesePizza;
import FactoryPattern.ClamPizza;
import FactoryPattern.Pizza;

/**
 * Created by liuyang on 2017/2/12.
 * 简单工厂
 */
public class SimplePizzaFactory {
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if ("cheese".equals(type)) {
            pizza = new CheesePizza();
        } else if ("clam".equals(type)) {
            pizza = new ClamPizza();
        }
        return pizza;
    }
}
