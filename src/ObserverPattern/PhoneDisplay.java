package ObserverPattern;

import StrategyPattern.DisplayStrategy;

public class PhoneDisplay implements Observer {
    private WeatherStation station;
    private String displayName;
    private DisplayStrategy displayStrategy;

    public PhoneDisplay(WeatherStation station, String displayName, DisplayStrategy displayStrategy) {
        this.station = station;
        this.displayName = displayName;
        this.displayStrategy = displayStrategy;
        station.addObserver(this);
    }

    public void setDisplayStrategy(DisplayStrategy displayStrategy) {
        this.displayStrategy = displayStrategy;
    }

    @Override
    public void update() {
        int temp = station.getTemperature();
        System.out.println(displayName + " - " + displayStrategy.display(temp));
    }
}