package Lab4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Ex2 {
    public static void main(String[] args) {
        ArrayList<Person> myList = new ArrayList<>();
//        myList.addAll(Arrays.asList(new Person("Ann",22,2700.50,"HR"),
//                                   new Person("Jone",32,4200.80,"Marketing"),
//                                    new Person("Ben",18,2000.70,"Accounting")
//        ));
//
//        System.out.println(myList);
//
//        Collections.sort(myList, (p1, p2) -> p1.name.compareTo(p2.name));
//        System.out.println(myList);
//        Collections.sort(myList, (p1, p2) -> p1.age - p2.age);
//        System.out.println(myList);
//        Collections.sort(myList, (p1, p2) -> Double.compare(p1.salary,p2.salary));
//        System.out.println(myList);

    ArrayList<Person> people=new ArrayList<>();
    people.add( new Person ("Ann",18, 140.50, "H"));
    people.add(new Person ("Bob", 19, 120.70,"A"));
    people.add(new Person("Jane",21,150.70,"C"));

    System.out.println(people);

    Collections.sort(people, (p1, p2) -> p1.name.compareTo(p2.name));
    System.out.println(people);

    Collections.sort(people, (p1, p2) -> p1.age - p2.age);
    System.out.println(people);

    Collections.sort(people, (p1, p2) -> Double.compare(p1.salary,p2.salary));
    System.out.println(people);
    }
}
