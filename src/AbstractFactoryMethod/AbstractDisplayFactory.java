package AbstractFactoryMethod;

import StrategyPattern.DisplayStrategy;

public abstract class AbstractDisplayFactory {
    public abstract DisplayStrategy createCelsiusDisplay();
    public abstract DisplayStrategy createFahrenheitDisplay();
    public abstract DisplayStrategy createDetailedDisplay();
}
