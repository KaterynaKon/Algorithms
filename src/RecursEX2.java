import java.math.BigInteger;

public class RecursEX2 {
    public static void main(String[] args) {
        int [] arr={8, 3, 7, 1, 2};

        System.out.println(forSum(arr,0));

    }
    public static int forSum(int []arr ,int index){
        if (index==arr.length)
            return 0;
        return arr[index]+forSum(arr,index+1);


    }
}
