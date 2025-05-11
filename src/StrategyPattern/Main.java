package StrategyPattern;

import DecoratorPattern.TimestampDecorator;
import DecoratorPattern.WarningDecorator;
import FactoryMethod.CelsiusDisplayFactory;
import FactoryMethod.DetailedDisplayFactory;
import FactoryMethod.DisplayStrategyFactory;
import FactoryMethod.FahrenheitDisplayFactory;
import ObserverPattern.PhoneDisplay;
import ObserverPattern.WeatherStation;

public class Main {
    public static void main(String[] args) {
        // Create a weather station
        WeatherStation station = new WeatherStation();

        // Create factories for display strategies
        DisplayStrategyFactory celsiusFactory = new CelsiusDisplayFactory();
        DisplayStrategyFactory fahrenheitFactory = new FahrenheitDisplayFactory();
        DisplayStrategyFactory detailedFactory = new DetailedDisplayFactory();

        // Create phone displays with different strategies and decorators
        DisplayStrategy phone1Strategy = new TimestampDecorator(celsiusFactory.createStrategy());
        PhoneDisplay phone1 = new PhoneDisplay(station, "Phone 1", phone1Strategy);

        DisplayStrategy phone2Strategy = new WarningDecorator(fahrenheitFactory.createStrategy());
        PhoneDisplay phone2 = new PhoneDisplay(station, "Phone 2", phone2Strategy);

        DisplayStrategy phone3Strategy = new TimestampDecorator(new WarningDecorator(detailedFactory.createStrategy()));
        PhoneDisplay phone3 = new PhoneDisplay(station, "Phone 3", phone3Strategy);

        // Simulate temperature changes
        System.out.println("Setting temperature to 25°C:");
        station.setTemperature(25);

        System.out.println("\nSetting temperature to 37°C:");
        station.setTemperature(37);

        System.out.println("\nSetting temperature to -5°C:");
        station.setTemperature(-5);

        // Change Phone 1's strategy using factory and decorators
        System.out.println("\nChanging Phone 1 to Fahrenheit with timestamp and warning:");
        phone1.setDisplayStrategy(new WarningDecorator(new TimestampDecorator(fahrenheitFactory.createStrategy())));
        station.setTemperature(-5);

        // Remove Phone 2 and update temperature
        System.out.println("\nRemoving Phone 2 and setting temperature to 20°C:");
        station.removeObserver(phone2);
        station.setTemperature(20);
    }
}
