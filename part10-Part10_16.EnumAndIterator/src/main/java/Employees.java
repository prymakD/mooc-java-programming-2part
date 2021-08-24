
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {

    private List<Person> persons;

    public Employees() {
        this.persons = new ArrayList<>();
    }

    public void add(Person personToAdd) {
        persons.add(personToAdd);
    }

    public void add(List<Person> peopleToAdd) {
        persons.addAll(peopleToAdd);
    }

    public void print() {
        Iterator<Person> iterator = persons.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void print(Education education) {
        Iterator<Person> iterator = persons.iterator();

        while (iterator.hasNext()) {
            Person person = iterator.next();
            if (person.getEducation() == education) {
                System.out.println(person);
            }
        }
    }

    public void fire(Education education) {
        Iterator<Person> iterator = persons.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getEducation() == education) iterator.remove();
        }
    }
}
