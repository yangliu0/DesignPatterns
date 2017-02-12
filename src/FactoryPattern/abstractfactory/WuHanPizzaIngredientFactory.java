package FactoryPattern.abstractfactory;

import FactoryPattern.Cheese;
import FactoryPattern.Clam;
import FactoryPattern.FreshClam;
import FactoryPattern.ReggianoCheese;

/**
 * Created by liuyang on 2017/2/12.
 * 抽象工厂实现
 */
public class WuHanPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }
    @Override
    public Clam createClam() {
        return new FreshClam();
    }
}
