public class Person {
    protected String name;
    protected String surname;
    protected Gender gender;

    public Person(Gender gender, String name, String surname) {
        this.gender = gender;
        this.name = name;
        this.surname = surname;
    }
}