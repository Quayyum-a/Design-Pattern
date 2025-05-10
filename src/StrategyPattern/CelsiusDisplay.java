package StrategyPattern;

public class CelsiusDisplay implements DisplayStrategy {
    @Override
    public String display(int temperature) {
        return temperature + "°C";
    }
}
