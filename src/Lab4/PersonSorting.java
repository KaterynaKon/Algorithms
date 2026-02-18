package Lab4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PersonSorting {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("Bob", 25, 5000, "IT"));
        people.add(new Person("Alice", 30, 6000, "HR"));
        people.add(new Person("Bob", 20, 4000, "Sales"));
        people.add(new Person("Alice", 28, 5500, "IT"));

        System.out.println("Original list");
        printList(people);

        Comparator<Person> byName = new Comparator<Person>() {
            public int compare(Person p1, Person p2) {
                return p1.name.compareTo(p2.name);
            }
        };

        Comparator<Person> byAge=new Comparator<Person>() {
            public int compare(Person p1, Person p2) {
                return Integer.compare(p1.age,p2.age);
            }
        };

        Comparator<Person> bySallary=new Comparator<Person>() {
            public int compare(Person p1, Person p2) {
                return Double.compare(p1.salary,p2.salary);
            }
        };


        System.out.println("Sorted by name list");
        Collections.sort(people, byName);
        printList(people);

        System.out.println("Sorted by age list");
        Collections.sort(people, byAge);
        printList(people);

        System.out.println("Sorted by salary list");
        Collections.sort(people, bySallary);
        printList(people);


    }


    private static void printList(ArrayList<Person> people) {
        for (Person p : people) {
            System.out.println(p);
        }
    }
}
