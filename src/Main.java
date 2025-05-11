import AbstractFactoryMethod.AbstractDisplayFactory;
import AbstractFactoryMethod.BasicDisplayFactory;
import AbstractFactoryMethod.EnhancedDisplayFactory;
import AbstractFactoryMethod.TimestampedDisplayFactory;
import ObserverPattern.PhoneDisplay;
import ObserverPattern.WeatherStation;

public class Main {
    public static void main(String[] args) {
        // Create a weather station
        WeatherStation station = new WeatherStation();

        // Create abstract factories for different display families
        AbstractDisplayFactory basicFactory = new BasicDisplayFactory();
        AbstractDisplayFactory enhancedFactory = new EnhancedDisplayFactory();
        AbstractDisplayFactory timestampedFactory = new TimestampedDisplayFactory();

        // Create phone displays with different display families
        PhoneDisplay phone1 = new PhoneDisplay(station, "Phone 1", basicFactory.createCelsiusDisplay());
        PhoneDisplay phone2 = new PhoneDisplay(station, "Phone 2", enhancedFactory.createFahrenheitDisplay());
        PhoneDisplay phone3 = new PhoneDisplay(station, "Phone 3", timestampedFactory.createDetailedDisplay());

        // Simulate temperature changes
        System.out.println("Setting temperature to 25°C:");
        station.setTemperature(25);

        System.out.println("\nSetting temperature to 37°C:");
        station.setTemperature(37);

        System.out.println("\nSetting temperature to -5°C:");
        station.setTemperature(-5);

        // Change Phone 1's display using enhanced factory
        System.out.println("\nChanging Phone 1 to enhanced Fahrenheit display:");
        phone1.setDisplayStrategy(enhancedFactory.createFahrenheitDisplay());
        station.setTemperature(-5);

        // Remove Phone 2 and update temperature
        System.out.println("\nRemoving Phone 2 and setting temperature to 20°C:");
        station.removeObserver(phone2);
        station.setTemperature(20);
    }
}
