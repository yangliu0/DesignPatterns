package FactoryPattern.factorymethod;

import FactoryPattern.CheesePizza;
import FactoryPattern.ClamPizza;
import FactoryPattern.Pizza;

/**
 * Created by liuyang on 2017/2/12.
 */
public class WuHanPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;

        if ("cheese".equals(type)) {
            pizza = new CheesePizza();
        } else if ("clam".equals(type)) {
            pizza = new ClamPizza();
        }
        return pizza;
    }
}
