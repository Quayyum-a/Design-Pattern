package AbstractFactoryMethod;

import FactoryMethod.CelsiusDisplayFactory;
import FactoryMethod.DetailedDisplayFactory;
import FactoryMethod.DisplayStrategyFactory;
import FactoryMethod.FahrenheitDisplayFactory;
import StrategyPattern.DisplayStrategy;

public class BasicDisplayFactory extends AbstractDisplayFactory{
    private DisplayStrategyFactory celsiusFactory = new CelsiusDisplayFactory();
    private DisplayStrategyFactory fahrenheitFactory = new FahrenheitDisplayFactory();
    private DisplayStrategyFactory detailedFactory = new DetailedDisplayFactory();

    @Override
    public DisplayStrategy createCelsiusDisplay() {
        return celsiusFactory.createStrategy();
    }

    @Override
    public DisplayStrategy createFahrenheitDisplay() {
        return fahrenheitFactory.createStrategy();
    }

    @Override
    public DisplayStrategy createDetailedDisplay() {
        return detailedFactory.createStrategy();
    }
}

