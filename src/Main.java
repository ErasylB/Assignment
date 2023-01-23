import java.util.ArrayList;
import java.util.Collections;


public class Main {
    public static void main(String[] args) {
        ArrayList<Person> personArrayList = new ArrayList<Person>();
        personArrayList.add(new Employee("John", "Lennon", "KNB",27045.78));
        personArrayList.add(new Employee("George", "Harrison", "Police",50000.00));
        personArrayList.add(new Student("Ringo", "Starr", 2.3));
        personArrayList.add(new Student("Paul", "McCartney", 3.0));
        Collections.sort(personArrayList);
        printData(personArrayList);
    }
        public static void printData(Iterable<Person> personArrayList) {
            for (Person p : personArrayList) {
                System.out.println(p);
            }

        }

}

