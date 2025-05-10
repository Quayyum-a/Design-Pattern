package StrategyPattern;

import ObserverPattern.PhoneDisplay;
import ObserverPattern.WeatherStation;

public class Main {
    public static void main(String[] args) {
        // Create a weather station
        WeatherStation station = new WeatherStation();

        // Create phone displays with different display strategies
        PhoneDisplay phone1 = new PhoneDisplay(station, "Phone 1", new CelsiusDisplay());
        PhoneDisplay phone2 = new PhoneDisplay(station, "Phone 2", new FahrenheitDisplay());
        PhoneDisplay phone3 = new PhoneDisplay(station, "Phone 3", new DetailedDisplay());

        // Simulate temperature changes
        System.out.println("Setting temperature to 25°C:");
        station.setTemperature(25);

        System.out.println("\nSetting temperature to 32°C:");
        station.setTemperature(32);

        // Change display strategy for Phone 1
        System.out.println("\nChanging Phone 1 to Detailed Display:");
        phone1.setDisplayStrategy(new DetailedDisplay());
        station.setTemperature(32);

        // Remove Phone 2 and update temperature
        System.out.println("\nRemoving Phone 2 and setting temperature to 18°C:");
        station.removeObserver(phone2);
        station.setTemperature(18);
    }
}