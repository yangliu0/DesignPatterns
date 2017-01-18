package DecoratorPattern;

/**
 * 深焙咖啡
 */
public class DarkRoast extends Beverage
{
    public DarkRoast()
    {
        description = "DarkRoast";
    }

    public double cost()
    {
        return 0.99;
    }
}
