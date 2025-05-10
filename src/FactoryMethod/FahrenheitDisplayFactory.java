package FactoryMethod;

import StrategyPattern.DisplayStrategy;
import StrategyPattern.FahrenheitDisplay;

public class FahrenheitDisplayFactory extends DisplayStrategyFactory{
    @Override
    public DisplayStrategy createStrategy() {
        return new FahrenheitDisplay();
    }
}
