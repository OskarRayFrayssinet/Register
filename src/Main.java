import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // arraylist för att samla alla personer (Person)
        ArrayList<Person> allPersons = new ArrayList<>();

        // generera ett visst antal personer och spara i personlistan
        allPersons.add(new Person("Oskar"));
        allPersons.add(new Person("Ulf"));
        allPersons.add(new Person("Jennie"));
        allPersons.add(new Person("Erika"));

        for(Person p : allPersons) {
            System.out.println(p);
        }
    }
}
