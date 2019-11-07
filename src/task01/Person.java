package task01;

class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String pesel;

    Person(String firstName, String lastName, int age, String pesel) {
        validateFirstName(firstName);
        validateLastName(lastName);
        validateAge(age);
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.pesel = pesel;
    }

    private void validateFirstName(String firstName) {
        if (firstName.equals(null) || firstName.length() < 2) {
            throw new IncorrectFirstNameException();
        }
    }

    private void validateLastName(String lastName) {
        if (lastName.equals(null) || lastName.length() < 2) {
            throw new IncorrectLastNameException();
        }
    }

    private void validateAge(int age) {
        if (age < 1) {
            throw new IncorrectAgeException();
        }
    }

    String getFirstName() {
        return firstName;
    }

    void setFirstName(String firstName) {
        validateFirstName(firstName);
        this.firstName = firstName;
    }

    String getLastName() {
        return lastName;
    }

    void setLastName(String lastName) {
        validateLastName(lastName);
        this.lastName = lastName;
    }

    int getAge() {
        return age;
    }

    void setAge(int age) {
        validateAge(age);
        this.age = age;
    }

    String getPesel() {
        return pesel;
    }

    void setPesel(String pesel) {
        this.pesel = pesel;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", pesel='" + pesel + '\'' +
                '}';
    }
}
