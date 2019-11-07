package task01;

class IncorrectFirstNameException extends RuntimeException {
    IncorrectFirstNameException() {
        super("Imię nie może być null-em, ani być krótsze niż 2 znaki.");
    }
}
