import java.util.ArrayList;

public class Show {
    String title;
    int duration;
    Director director;
    ArrayList<Actor> listOfActors;

    public Show(Director director, int duration, ArrayList<Actor> listOfActors, String title) {
        this.director = director;
        this.duration = duration;
        this.listOfActors = listOfActors;
        this.title = title;
    }

    public void printListOfActors() {
        for (Actor actor : listOfActors) {
            System.out.println(actor);
        }
    }

    public void addActorToShow(Actor actor) {
        if (actor != null) {
            for (Actor person : listOfActors) {
                if (person.equals(actor)) {
                    System.out.println("Такой актёр уже участвует в " + title + ".");
                    return;
                }
            }
            listOfActors.add(actor);
        }
    }

    public void replaceActor(Actor newActor, String surnameForReplace) {
        if (newActor != null) {
            for (Actor person : listOfActors) {
                if (person.surname.equals(surnameForReplace)) {
                    listOfActors.remove(person);
                    listOfActors.add(newActor);
                    return;
                }
            }
        }
        System.out.println("Актёра с такой фамилией нет в списке. Некого менять" + "\n");
    }
}