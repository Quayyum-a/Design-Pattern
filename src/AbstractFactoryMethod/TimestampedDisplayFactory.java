package AbstractFactoryMethod;

import DecoratorPattern.TimestampDecorator;
import FactoryMethod.CelsiusDisplayFactory;
import FactoryMethod.DetailedDisplayFactory;
import FactoryMethod.DisplayStrategyFactory;
import FactoryMethod.FahrenheitDisplayFactory;
import StrategyPattern.DisplayStrategy;

public class TimestampedDisplayFactory extends AbstractDisplayFactory{
    private DisplayStrategyFactory celsiusFactory = new CelsiusDisplayFactory();
    private DisplayStrategyFactory fahrenheitFactory = new FahrenheitDisplayFactory();
    private DisplayStrategyFactory detailedFactory = new DetailedDisplayFactory();

    @Override
    public DisplayStrategy createCelsiusDisplay() {
        return new TimestampDecorator(celsiusFactory.createStrategy());
    }

    @Override
    public DisplayStrategy createFahrenheitDisplay() {
        return new TimestampDecorator(fahrenheitFactory.createStrategy());
    }

    @Override
    public DisplayStrategy createDetailedDisplay() {
        return new TimestampDecorator(detailedFactory.createStrategy());
    }
}
