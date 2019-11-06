package task01;

public class IncorrectAgeException extends Exception {
    IncorrectAgeException(){
        super("Wiek nie może być niższy niż 1.");
    }
}
