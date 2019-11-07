package task03.exceptions;

public class TooLowProcessorFrequencyException extends RuntimeException {
    public TooLowProcessorFrequencyException(){
        super("Taktowanie procesora nie może być mniejsze lub równe 0.");
    }
}
