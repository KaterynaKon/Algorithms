package Lab5;

public class InsertionSort {
    public static void main(String[] args) {
        int[] score = {27, 50, 20, 90, 105};
        for(int i=1; i<score.length; i++){
            int key=score[i];
            int j=i-1;
            while(j>=0 && score[j]>key){
                score[j+1]=score[j];
                j--;
            }
            score[j+1]=key;
        }
    }
}
