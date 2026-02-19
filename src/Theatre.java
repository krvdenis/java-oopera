import java.util.ArrayList;

public class Theatre {
    public static void main(String[] args) {
        // Создание актёров
        Actor firstActor = new Actor(Gender.MALE, "Сергей", "Безруков", 1.74);
        Actor secondActor = new Actor(Gender.FEMALE, "Мария", "Баянкина", 1.75);
        Actor thirdActor = new Actor(Gender.FEMALE, "Светлана", "Захарова", 1.60);
        // Создание режиссёров
        Director firstDirector = new Director(Gender.MALE, "Сергей", "Женовач", 15);
        Director secondDirector = new Director(Gender.MALE, "Филипп", "Григорьян", 15);
        // Инициализация автора музыки и хореографа
        Person musicAuthor = new Person(Gender.MALE, "Пётр", "Чайковский");
        Person choreographer = new Person(Gender.FEMALE, "Татьяна", "Баганова");
        // Создание трех спектаклей: обычного, оперного и балета
        Show show = new Show(secondDirector, 40, new ArrayList<>(), "Хулиган. Исповедь");
        Opera opera = new Opera(secondDirector, 90, new ArrayList<>(), "Травиата",
                "librettoForOpera", musicAuthor, 12);
        Ballet ballet = new Ballet(firstDirector, 60, new ArrayList<>(), "Лебединое озеро",
                "librettoForBallet", musicAuthor, choreographer);

        // Добавление актёров в каждый из спектаклей
        show.addActorToShow(firstActor);
        show.addActorToShow(secondActor);
        show.addActorToShow(thirdActor);
        opera.addActorToShow(secondActor);
        opera.addActorToShow(firstActor);
        ballet.addActorToShow(firstActor);
        ballet.addActorToShow(thirdActor);

        // Вывод списков актёров по спектаклям
        System.out.println("\n" + "Список актёров спектакля " + show.title + ":");
        show.printListOfActors();
        System.out.println("\n" + "Список актёров оперы " + opera.title + ":");
        opera.printListOfActors();
        System.out.println("\n" + "Список актёров балета " + ballet.title + ":");
        ballet.printListOfActors();

        // Замена актёров
        System.out.println("\n" + "Замена актёра по фамилии " + firstActor.surname + " (" + ballet.title + ").");
        ballet.replaceActor(secondActor, "Безруков");
        System.out.println("Список актёров балета " + ballet.title + " после замены:");
        ballet.printListOfActors();
        System.out.println("\n" + "Замена актёра по фамилии Петров " + "(" + opera.title + ").");
        opera.replaceActor(thirdActor, "Петров" + "\n");

        // Вывод Либретто
        opera.printLibrettoText();
        ballet.printLibrettoText();
    }
}