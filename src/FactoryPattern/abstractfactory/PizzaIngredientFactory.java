package FactoryPattern.abstractfactory;

import FactoryPattern.Cheese;
import FactoryPattern.Clam;

/**
 * Created by liuyang on 2017/2/12.
 * 抽象工厂
 */
public interface PizzaIngredientFactory {
    public Cheese createCheese();
    public Clam createClam();
}
