package StrategyPattern;

public class FahrenheitDisplay implements DisplayStrategy {
    @Override
    public String display(int temperature) {
        int fahrenheit = (temperature * 9 / 5 + 32);
        return "Temperature: " + fahrenheit + "°F";
    }
}
