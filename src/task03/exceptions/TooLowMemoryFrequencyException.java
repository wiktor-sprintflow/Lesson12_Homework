package task03.exceptions;

public class TooLowMemoryFrequencyException extends RuntimeException {
    public TooLowMemoryFrequencyException(){
        super("Taktowanie pamięci RAM nie może być mniejsze lub równe 0.");
    }
}
