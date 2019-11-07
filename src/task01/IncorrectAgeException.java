package task01;

class IncorrectAgeException extends Exception {
    IncorrectAgeException(){
        super("Wiek nie może być niższy niż 1.");
    }
}
