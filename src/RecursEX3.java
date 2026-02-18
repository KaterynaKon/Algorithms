import java.util.Arrays;

public class RecursEX3 {
    public  static void main(String[] args) {
        int[] arr={1,3,5,7,9,11};
        int key=7;
        System.out.println("key fount at index: "+binarySyarch(arr,key,0,arr.length-1));
    }

    private static int binarySyarch(int[] arr, int key, int low, int high) {
        if(low>high) return -1;
        int mid=low+(high-low)/2;
        if(arr[mid]==key) return mid;
        else if (key>arr[mid]) {
            return binarySyarch(arr, key, mid+1, high);
        }
        else
            return binarySyarch(arr, key, low, mid-1);


  /*      if(arr.length==0){
            return -1;
        }
        int middleInd = arr.length/2;


        if(arr[middleInd]==key){
            return middleInd;
        }
        else if(key>arr[middleInd]){
                int[] newArr= Arrays.copyOfRange(arr,middleInd+1,arr.length);
                int result=binarySyarch(newArr,key);
                if (result==-1){
                    return -1;
                }
                return middleInd+1+result;


            } else {
                int[] newArr= Arrays.copyOfRange(arr,0,middleInd);
                return binarySyarch(newArr,  key);

            }*/


        }

    }

