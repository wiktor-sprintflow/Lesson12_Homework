package task03.exceptions;

public class TooHighProcessorTemperatureException extends RuntimeException {
    public TooHighProcessorTemperatureException() {
        super("Podkręcenie taktowania procesora przekroczy jego dopuszczalną temperaturę.");
    }
}
