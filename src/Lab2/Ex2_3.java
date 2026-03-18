package Lab2;

public class Ex2_3 {
    public static void main(String[] args) {
        int[] numbers={3,7,1,9,5};
        int target=9;
        int result=searchN(numbers,target);
       System.out.println(result);
    }

    private static int searchN(int[] numbers, int target) {
        if(numbers==null||numbers.length==0){
            return -1;
        }
        for (int i=0;i<numbers.length;i++){
            if(numbers[i]==target){
                return i;
            }
        }
        return -1;
    }

}
