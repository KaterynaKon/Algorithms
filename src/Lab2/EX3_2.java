package Lab2;

public class EX3_2 {
    public static void main(String[] args) {
        int[] numbers={1, 3, 5, 7, 9, 11, 13};
        int target=7;
        int result=binarySearchN(numbers,target);
        System.out.println(result);
    }

    private static int binarySearchN(int[] numbers, int target) {
        int low=0;
        int high=numbers.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(numbers[mid]==target){
                return mid;
            }
            else if(numbers[mid]>target){
                high=mid-1;
            }
            else {
                low=mid+1;
            }
        }
        return -1;
    }
}
