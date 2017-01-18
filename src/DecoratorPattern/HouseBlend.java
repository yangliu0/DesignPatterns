package DecoratorPattern;

/**
 * 综合咖啡
 */
public class HouseBlend extends Beverage
{
    public HouseBlend()
    {
        description = "HouseBlend";
    }

    public double cost()
    {
        return 0.89;
    }
}
