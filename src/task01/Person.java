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

    public void setFirstName(String firstName) throws NameUndefinedException {
        if (firstName == null || firstName.length() < 2) {
            throw new NameUndefinedException();
        }
        this.firstName = firstName;
    }

    String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) throws NameUndefinedException {
        if (lastName == null || lastName.length() < 2) {
            throw new NameUndefinedException();
        }
        this.lastName = lastName;
    }

    int getAge() {
        return age;
    }

    public void setAge(int age) throws IncorrectAgeException {
        if (age < 1) {
            throw new IncorrectAgeException();
        }
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
