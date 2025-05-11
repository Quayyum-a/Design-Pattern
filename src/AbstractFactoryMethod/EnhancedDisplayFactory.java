package AbstractFactoryMethod;

import DecoratorPattern.TimestampDecorator;
import DecoratorPattern.WarningDecorator;
import FactoryMethod.CelsiusDisplayFactory;
import FactoryMethod.DetailedDisplayFactory;
import FactoryMethod.DisplayStrategyFactory;
import FactoryMethod.FahrenheitDisplayFactory;
import StrategyPattern.DisplayStrategy;

public class EnhancedDisplayFactory extends AbstractDisplayFactory{
    private DisplayStrategyFactory celsiusFactory = new CelsiusDisplayFactory();
    private DisplayStrategyFactory fahrenheitFactory = new FahrenheitDisplayFactory();
    private DisplayStrategyFactory detailedFactory = new DetailedDisplayFactory();

    @Override
    public DisplayStrategy createCelsiusDisplay() {
        return new TimestampDecorator(new WarningDecorator(celsiusFactory.createStrategy()));
    }

    @Override
    public DisplayStrategy createFahrenheitDisplay() {
        return new TimestampDecorator(new WarningDecorator(fahrenheitFactory.createStrategy()));
    }

    @Override
    public DisplayStrategy createDetailedDisplay() {
        return new TimestampDecorator(new WarningDecorator(detailedFactory.createStrategy()));
    }
}
