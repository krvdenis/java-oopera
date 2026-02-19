public class Director extends Person {
    private int numberOfShows;

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

    public int getNumberOfShows() {
        return numberOfShows;
    }

    public void setNumberOfShows(int numberOfShows) {
        this.numberOfShows = numberOfShows;
    }

    public void printInfoAboutDirector() {
        System.out.println(this);
    }
}