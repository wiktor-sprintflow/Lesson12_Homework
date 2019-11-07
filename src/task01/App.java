package task01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String firstName;
        String lastName;
        int age;
        String pesel;

        try {
            System.out.println("Podaj imię:");
            firstName = in.nextLine();
            System.out.println("Podaj nazwisko:");
            lastName = in.nextLine();
            System.out.println("Podaj wiek:");
            age = in.nextInt();
            in.nextLine();
            System.out.println("Podaj pesel:");
            pesel = in.nextLine();
            Person person = new Person(firstName, lastName, age, pesel);
            System.out.println(person);
        } catch (IncorrectFirstNameException | IncorrectLastNameException | IncorrectAgeException ex) {
            System.err.println(ex.getMessage());
        } catch (InputMismatchException ex) {
            System.err.println("Podany wiek nie jest liczbą całkowitą");
        } finally {
            in.close();
        }
    }
}