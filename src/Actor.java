import java.util.Objects;

public class Actor extends Person {
    double height;

    public Actor(Gender gender, String name, String surname, double height) {
        super(gender, name, surname);
        this.height = height;
    }

    @Override
    public String toString() {
        return name + " " +
                surname +
                " (Рост - " + height +
                "м.)";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Actor actor = (Actor) o;
        return Objects.equals(this.name, actor.name)
                && Objects.equals(this.surname, actor.surname)
                && height == actor.height;
    }

    @Override
    public int hashCode() {
        int hash = Objects.hash(this.name, this.surname);
        hash = 31 * hash + Objects.hash(height);
        return hash;
    }
}