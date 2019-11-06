package task01;

public class IncorrectAgeException extends RuntimeException {
    IncorrectAgeException(){
        super("Wiek nie może być niższy niż 1.");
    }
}
