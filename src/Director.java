public class Director extends Person {
    int numberOfShows;

    public Director(Gender gender, String name, String surname, int numberOfShows) {
        super(gender, name, surname);
        this.numberOfShows = numberOfShows;
    }

    @Override
    public String toString() {
        return "Режиссёр - " +
                name + " " +
                surname +
                '.';
    }

    public void getInfoAboutDirector() {
        System.out.println(this);
    }
}