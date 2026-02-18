package Lab4;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex3 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.addAll(Arrays.asList(10,20,30,40,50));
        System.out.println(arr);


        arr.remove(2);
        System.out.println(arr);

        arr.add(2,25);
        System.out.println(arr);

        arr.set(arr.size()-1,60);
        System.out.println(arr);

        System.out.println(arr.get(2));
        System.out.println(arr);

    }
}
