package task03.exceptions;

public class TooHighMemoryTemperatureException extends RuntimeException {
    public TooHighMemoryTemperatureException(){
        super("Podkręcenie taktowania pamięci RAM przekroczy jej dopuszczalną temperaturę.");
    }
}
