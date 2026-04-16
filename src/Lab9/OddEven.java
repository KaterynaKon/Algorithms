package Lab9;

import java.util.LinkedList;
import java.util.ListIterator;

public class OddEven {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }
        System.out.println(numbers); //Before
        ListIterator<Integer> iterator = numbers.listIterator();

        while (iterator.hasNext()) {
            int value = iterator.next();
            if (value % 2 == 0) {
                iterator.set(value * 10);  // Multiply even numbers by 10
            } else {
                iterator.remove();  // Remove odd numbers
            }
        }

        numbers.removeLast();
        numbers.removeFirst();

        System.out.println(numbers.getFirst());
        System.out.println(numbers.getLast());

        System.out.println(numbers.isEmpty());
        System.out.println(numbers.size());

        numbers.add(2,5);


        System.out.println(numbers); //After
    }
}
