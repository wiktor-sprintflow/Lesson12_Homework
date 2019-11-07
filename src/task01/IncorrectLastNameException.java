package task01;

class IncorrectLastNameException extends Exception {
    IncorrectLastNameException() {
        super("Nazwisko nie może być null-em, ani być krótsze niż 2 znaki.");
    }
}