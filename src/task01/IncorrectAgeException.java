package task01;

class IncorrectAgeException extends RuntimeException {
    IncorrectAgeException(){
        super("Wiek nie może być niższy niż 1.");
    }
}
