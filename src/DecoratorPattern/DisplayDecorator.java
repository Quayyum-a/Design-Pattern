package DecoratorPattern;

import StrategyPattern.DisplayStrategy;

public abstract class DisplayDecorator implements DisplayStrategy {
    protected DisplayStrategy wrappedStrategy;

    public DisplayDecorator(DisplayStrategy wrappedStrategy) {
        this.wrappedStrategy = wrappedStrategy;
    }
}
