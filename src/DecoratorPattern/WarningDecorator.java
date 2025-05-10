package DecoratorPattern;


import StrategyPattern.DisplayStrategy;

public class WarningDecorator extends DisplayDecorator {
    public WarningDecorator(DisplayStrategy wrappedStrategy) {
        super(wrappedStrategy);
    }

    @Override
    public String display(int temperature) {
        String baseDisplay = wrappedStrategy.display(temperature);
        if (temperature > 35) {
            return baseDisplay + " [Warning: Extremely Hot!]";
        } else if (temperature < 0) {
            return baseDisplay + " [Warning: Freezing!]";
        }
        return baseDisplay;
    }
}