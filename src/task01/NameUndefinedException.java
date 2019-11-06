package task01;

public class NameUndefinedException extends RuntimeException {
    public NameUndefinedException(){
        super("Imię lub nazwisko nie może być null-em, ani być krótsze niż 2 znaki.");
    }
}
