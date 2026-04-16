package Lab9;

import java.util.LinkedList;
import java.util.ListIterator;

public class StudentList {
    public static void main(String[] args) {
        LinkedList<String> Students= new LinkedList<String>();
        Students.add("Kay");
        Students.add("Jay");
        Students.add("May");
        Students.add("Fay");

//        for(int i=0; i<Students.size();i++) {
//            if (Students.get(i).equals("May")) {
//                Students.add(i+1, "Ray");
//                i++;
//            }
//        }

        ListIterator<String> iterator = Students.listIterator();
        while (iterator.hasNext()) {
            if (iterator.next().equals("May")) {
                iterator.add("Ray");
            }
        }
        System.out.println(Students);



//        for(int i=0; i<Students.size();i++) {
//            if (Students.get(i).equals("Jay")) {
//                Students.remove(i);
//                i++;
//            }
//        }

        Students.remove("Jay");

        System.out.println(Students);

        Students.add(2, "Tray");


        iterator = Students.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


        iterator = Students.listIterator(2);
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        Students.addFirst("Kay");
        Students.addLast("JaJ");
        System.out.print(Students+" ");

        Students.removeFirst();
        Students.removeLast();
        System.out.println(Students);
        System.out.println(Students.getFirst());
        System.out.println(Students.getLast());

    }
}
