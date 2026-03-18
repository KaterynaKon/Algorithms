import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortIntegerList {
    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<Integer>();
//        list.addAll(Arrays.asList(10, 20, 5, 7));
//
//        Collections.sort(list);
//        Collections.reverse(list);
//        System.out.println(list);

        ArrayList<Integer> myList= new ArrayList<>();
        myList.addAll(Arrays.asList(1,2,3,4));
        Collections.sort(myList);
        Collections.reverse(myList);
        System.out.println(myList);

    }



}
