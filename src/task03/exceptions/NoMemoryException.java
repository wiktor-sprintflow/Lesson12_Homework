package task03.exceptions;

public class NoMemoryException extends RuntimeException {
    public NoMemoryException(){
        super("Pamięć nie może być mniejsza od 1MB");
    }
}
