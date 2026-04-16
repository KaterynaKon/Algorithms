package Lab9;

import java.util.*;


public class ListComparison {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        //DoublyLinkedList doublyLinkedList = new DoublyLinkedList();

        int size = 10000;

        // ArrayList Insertion
        long start = System.nanoTime();
        for (int i = 0; i < size; i++) {
            arrayList.add(0, i); // O(n)
        }
        long end = System.nanoTime();
        System.out.println("ArrayList insertion time: " + (end - start) + " ns");

        // LinkedList Insertion
        start = System.nanoTime();
        for (int i = 0; i < size; i++) {
            linkedList.add(0, i); // O(1)
        }
        end = System.nanoTime();
        System.out.println("LinkedList insertion time: " + (end - start) + " ns");

    }
}


