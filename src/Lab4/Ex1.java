package Lab4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Ex1 {
    public static void main(String[] args) {
        ArrayList<Integer> listN = new ArrayList<>(Arrays.asList(1, 5, 7, 4));
        Collections.sort(listN);
        Collections.sort(listN, Collections.reverseOrder());


    }
}
