public class linearSearch {
    public static void main(String[] args) {
        int[] numbers={3,7,1,9,5};
        int target=9;
        int result=searchLin(numbers,target);
        System.out.println(result);

    }
    public static int searchLin(int[] numbers, int target) {
        if(numbers==null||numbers.length==0){
            return -1;
        }
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==target){
                return i;
            }
        }
        return -1;
    }
}
