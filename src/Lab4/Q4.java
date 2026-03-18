package Lab4;

public class Q4 {
    public static void main(String[] args) {
          int[] a  = {10, 2, 4, 16, 47, 3};

          for (int i =0; i<a.length-1; i++){
              int minindex=i;
              for (int j=i+1; j<a.length; j++){
                  if (a[j]<a[i]){
                      minindex=j;
                  }
              }
              if (minindex!=i){
                  int temp=a[minindex];
                  a[minindex]=a[i];
                  a[i]=temp;
              }

          }


    }
}
