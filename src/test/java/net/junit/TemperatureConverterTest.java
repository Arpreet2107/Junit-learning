package net.junit;

import net.junit.TemperatureConverter;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("🔥 Temperature Conversion Tests Suite")
public class TemperatureConverterTest {

    TemperatureConverter converter = new TemperatureConverter();

    @Test
    @DisplayName("🌡️ Convert Celsius to Fahrenheit correctly")
    void testCelsiusToFahrenheit() {
        double result = converter.celsiusToFahrenheit(0);
        assertEquals(32.0, result, "0°C should be 32°F");
    }

    @Test
    @DisplayName("🌡️ Convert Fahrenheit to Celsius correctly")
    void testFahrenheitToCelsius() {
        double result = converter.fahrenheitToCelsius(32);
        assertEquals(0.0, result, "32°F should be 0°C");
    }

    @Test
    @DisplayName("🔁 Convert boiling point of water from Celsius to Fahrenheit")
    void testBoilingPointCToF() {
        double result = converter.celsiusToFahrenheit(100);
        assertEquals(212.0, result, "100°C should be 212°F");
    }

    @Test
    @DisplayName("🔁 Convert freezing point of water from Fahrenheit to Celsius")
    void testFreezingPointFToC() {
        double result = converter.fahrenheitToCelsius(32);
        assertEquals(0.0, result, "32°F should be 0°C");
    }
}