package FactoryMethod;

import StrategyPattern.CelsiusDisplay;
import StrategyPattern.DisplayStrategy;

public class CelsiusDisplayFactory extends DisplayStrategyFactory {
    @Override
    public DisplayStrategy createStrategy() {
        return new CelsiusDisplay();
    }
}
