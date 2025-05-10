package StrategyPattern;

public class WeatherApp {
    private DisplayStrategy displayStrategy;
    private int temperature;

    public WeatherApp(DisplayStrategy displayStrategy) {
        this.displayStrategy = displayStrategy;
    }

    public void setDisplayStrategy(DisplayStrategy displayStrategy) {
        this.displayStrategy = displayStrategy;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public void showWeather() {
        System.out.println(displayStrategy.display(temperature));
    }
}
