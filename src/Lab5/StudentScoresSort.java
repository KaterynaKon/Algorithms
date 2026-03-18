package Lab5;

public class StudentScoresSort {
    public static void main(String[] args) {
        int [] score={27,90,60,80,15};// create  populate array
        for (int s : score) { //print initial array
            System.out.print(s+" ");
        }

        for (int i=0; i<score.length-1; i++){  //we need each element for comparithing
            int minidex=i;//we think that the current element is min
            for(int j=i+1;j<score.length;j++){ // we take a chunk of array fom next of current element and take each element
                if (score[j]<score[minidex]){//we try to find the element that is smaller than current if we find , save it index like minidex
                    minidex=j;
                }
            }
            if (i!=minidex){ // if we find element smaller than current we do replace
                int temp=score[i]; //save current element meaning
                score[i]=score[minidex]; //switch current and minidex
                score[minidex]=temp; // return meaning from temp to place of min element
            }
        }
        System.out.println();
        for(int s : score) {
            System.out.print(s+" ");
        }
        System.out.println();
        System.out.println(score[score.length-1]);
    }
}
