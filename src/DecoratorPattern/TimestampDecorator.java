package DecoratorPattern;

import StrategyPattern.DisplayStrategy;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimestampDecorator extends DisplayDecorator {
    public TimestampDecorator(DisplayStrategy wrappedStrategy) {
        super(wrappedStrategy);
    }

    @Override
    public String display(int temperature) {
        String baseDisplay = wrappedStrategy.display(temperature);
        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        return baseDisplay + " [Timestamp: " + timestamp + "]";
    }
}