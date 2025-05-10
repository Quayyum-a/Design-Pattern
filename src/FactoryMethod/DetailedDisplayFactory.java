package FactoryMethod;

import StrategyPattern.DetailedDisplay;
import StrategyPattern.DisplayStrategy;

public class DetailedDisplayFactory extends DisplayStrategyFactory{
    @Override
    public DisplayStrategy createStrategy() {
        return new DetailedDisplay();
    }
}
