package StrategyPattern;

public class DetailedDisplay implements DisplayStrategy {
    @Override
    public String display(int temperature) {
        String comfortLevel = temperature > 30 ? "Hot" : temperature < 15 ? "Cold" : "Comfortable";
        return "Detailed Report: " + temperature + "°C (" + comfortLevel + ")";
    }
}
