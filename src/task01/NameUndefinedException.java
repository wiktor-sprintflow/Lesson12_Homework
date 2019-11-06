package task01;

public class NameUndefinedException extends Exception {
    public NameUndefinedException(){
        super("Imię lub nazwisko nie może być null-em, ani być krótsze niż 2 znaki.");
    }
}
