package Lab6;

public class MyInsertionSort {
    public static void main(String[] args) {
        int[] score = {12, 11, 13, 5, 6, 7, 8};
        int totShifts=0;
        int totInsertions=0;
        int totComparisons=0;
        for(int i=1; i<score.length; i++){
            int key=score[i];
            int j=i-1;
            totInsertions+=1;

            while(j>=0 ){
                totComparisons+=1;
                if(key<score[j]) {
                    score[j + 1] = score[j];
                    j--;
                    totShifts += 1;
                }
                else{
                    break;


                }
            }
            score[j+1]=key;

        }
        System.out.println("Total Insertions: "+totInsertions);
        System.out.println("Total Comparisons: "+totComparisons);
        System.out.println("Total Shifts: "+totShifts);
    }
}
