import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TemperatureConverter {
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        System.out.println(celsiusToFahrenheit(30));
        System.out.println(fahrenheitToCelsius(86));
    }
}

class TemperatureConverterTest {
    @Test
    void testingCelsiusToFahrenheit() {
        assertEquals(86.0, TemperatureConverter.celsiusToFahrenheit(30), 0.01);
    }

    @Test
    void testingFahrenheitToCelsius() {
        assertEquals(30.0, TemperatureConverter.fahrenheitToCelsius(86), 0.01);
    }
}
