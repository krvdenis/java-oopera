public class Person {
    String name;
    String surname;
    Gender gender;

    public Person(Gender gender, String name, String surname) {
        this.gender = gender;
        this.name = name;
        this.surname = surname;
    }
}